package com.example.demo.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Passenger;
import com.example.demo.entity.TripHistory;
import com.example.demo.ifaces.PassengerRepository;

@Service
public class PassengerService {
	
	private PassengerRepository repo;
	
	@Autowired
	public PassengerService(PassengerRepository repo) {
		super();
		this.repo = repo;
	}

	public Passenger add(Passenger passenger ) {
		return this.repo.save(passenger);
	}
	public List<Passenger> findAll() {
		// TODO Auto-generated method stub
		return this.repo.findAll();
	
	}
	
	public List<Passenger> findByPassengerName(String name){
		return this.repo.findByPassengerName(name);
	}
	
	public List<Passenger> findByTripDate(LocalDateTime dateTime){
		return this.repo.findByTripHistoryTripDateTime(dateTime);
	}
	
	
	

}
