package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.HealthInsurance;
import com.example.demo.entity.LifeInsurance;
import com.example.demo.repo.InsuranceRepository;

@Service
public class InsuranceService {
	@Autowired
	InsuranceRepository repo;
	
	@Autowired
	HealthInsurance entity;
	
	
	@Autowired
	LifeInsurance lifeentity;
	
	public void addHealthPolicy() {
		Object obj = repo.save(entity);
		if(obj!=null) {
			System.out.println("one Record added");
		}
	}
	public void addLifePolicy() {
		Object obj = repo.save(lifeentity);
		if(obj!=null) {
			System.out.println("one Record added");
		}
		}
	public void getHealthPolicy() {
		repo.findAll().forEach(System.out::println);
	}
	public void getallPolicy() {
		repo.findAll().forEach(System.out::println);
	}
	
	public void findall() {
		repo.findAll().forEach(System.out::println);
	}

}
