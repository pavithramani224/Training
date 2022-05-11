package com.example.demo.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	public List<Employee> findByEmpDateOfBirth(LocalDate date);
	
	public List<Employee> findByLocation(String location);
	
	public List<Employee> findBySkillSet(String skillset);
		 
		
	}

