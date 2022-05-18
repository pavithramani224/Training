package com.example.demo.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.Driver;
import com.example.demo.ifaces.DriverRepository;

@Service
public class DriverService {
	
	@Autowired
	private DriverRepository repo;
	
	@Autowired
	public DriverService(DriverRepository repo) {
		super();
		this.repo = repo;
	}

	public List<Driver> findAll() {
		return this.repo.findAll();
	}

	public Driver add(Driver entity) {
	
		return this.repo.save(entity);
	}
	
	public Driver findById(int id) {
		return this.repo.findById(id).orElseThrow(()->
		new RuntimeException(id+"notfound"));
	}
//
//	public Driver deleteById(int id) {
//		return this.repo.deleteById(id).orElseThrow(()->
//		new RuntimeException(id+"notfound"));
//	}
	//}
	
//	public Driver remove(Driver entity) {
//		boolean result = this.repo.existsById(entity.getDriverid());
//		if(result) {
//			repo.delete(entity);
//		}else {
//			throw new NoSuchElementException("element with id"+entity.getDriverid() +"not present");
//		}
//		return entity;
//	}
	

	public void deleteById(int id) {
		// TODO Auto-generated method stub
		this.repo.deleteById(id);
	}
	
	public List<Driver> findByDriverName(String srchName){
		return this.repo.findByDriverName(srchName);
	}
	
	public List<Driver> findByMobileNumber(long number){
		return this.repo.findByMobileNumber(number);
	}
	
	public List<Driver> findByDriverRating(double rating){
		return this.repo.searchByRating(rating);
	}
	
	public int updateRating (int id, double updatedrating) {
		return this.repo.modifyRating(id, updatedrating);
	}
	
	 public List<Driver> sortedList(String propName) {
	    	return this.repo.findAll(Sort.by(propName));
	    }
	

	
	
	
		
}
