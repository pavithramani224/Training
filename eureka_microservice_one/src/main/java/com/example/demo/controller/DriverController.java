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
import org.springframework.web.bind.annotation.PutMapping;
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
				.path("/{id}").buildAndExpand(entity.getDriverId())
				.toUri();

				
		return  ResponseEntity.created(location).body(driver);
	
	}

//	
	@DeleteMapping(path="/drivers/{id}")  
	public ResponseEntity<String> deleteById(@PathVariable int id){
		
		this.service.deleteById(id);
		return ResponseEntity.status(204).body("One Record Deleted "+id);
		
	}
	
	
	
	@GetMapping(path="/drivers/srch/phone/{mobileNumber}")
	public List<Driver> getDriverByMobileNumber(@PathVariable("mobileNumber") long id){
		return this.service.findByMobileNumber(id);
		
	}
	
	
	@PutMapping(path="/drivers/{id}/{rating}")
	public ResponseEntity<Integer> updateRating(@PathVariable("id")int id,@PathVariable("rating")double updatedRating) {
		int update=this.service.updateRating(id, updatedRating);
		return ResponseEntity.ok().body(update);
	}
	
	
	
	@GetMapping(path="/drivers/srch/rating/{rating}")
	public List<Driver> getDriverByRating(@PathVariable("rating") double rating){
		return this.service.findByDriverRating(rating);
	}
	
	@GetMapping(path="/drivers/srch/drivername/{driverName}")
	public List<Driver> findByDriverName(@PathVariable("driverName") String name){
		return this.service.findByDriverName(name);
	}
	
	@GetMapping(path="/drivers/sort/{propName}")
	public List<Driver> sortByDrivername(@PathVariable("propName") String name){
		return this.service.sortedList(name);
	}
	
	
}

	
	
	

		

	

