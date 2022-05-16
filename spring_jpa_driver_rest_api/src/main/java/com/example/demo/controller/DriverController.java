package com.example.demo.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.entity.Driver;
import com.example.demo.service.DriverService;

@RestController
@RequestMapping(value="/api/v1")
public class DriverController {
	
	@Autowired
	private DriverService service;

	
	@Autowired
	public DriverController(DriverService service) {
		super();
		this.service = service;
	}
	
	@GetMapping(path="/drivers")
	public List<Driver> getDriver(){
		return this.service.findAll();
		
	}
	
	@GetMapping(path="/drivers/{id}")
	public Driver findDriverById(@PathVariable("id") int id){
		return this.service.findById(id);
		
	}
	@PostMapping(path="/drivers")
	public ResponseEntity<Driver> getDriver(@RequestBody Driver entity){
		Driver driver = this.service.add(entity);
		
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}").buildAndExpand(entity.getDriverid())
				.toUri();

				
		return  ResponseEntity.created(location).body(driver);
	
	}

	@DeleteMapping(path="/drivers")
	public RequestEntity<Object> remove(@RequestBody Driver entity) {

		Driver result = this.service.remove(entity);
		if(result!=null)
		{
			return RequestEntity.status(204).build();
		}else {
			return RequestEntity.ok("no record matching");
		}
	}
}
	
	

		

	

