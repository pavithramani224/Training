package com.example.demo.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Seminar;
import com.example.demo.entity.Speaker;

@Component
public class SeminarUtils {

	
	@Autowired
	Seminar sem;
	
	@Autowired
	com.example.demo.ifaces.SeminarRepository repo;
	
	@Autowired
	Speaker speaker;
	
	public void create() {
		
		sem.setSpeaker(speaker)
;
		Seminar added=repo.save(sem);
		
		if(added!=null)
			System.out.println("One record added");
	}
	public void  findAll() {
		System.out.println(sem);
		
	}
}
	