package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepository;

@Service
public class EmployeeService {
	private EmployeeRepository repo;
	
	@Autowired
	public EmployeeService(EmployeeRepository repo) {
		super();
		this.repo = repo;
	}
	
	public List<Employee> findAll(){
		return repo.findAll();
		
		
	}
	public Employee add(Employee employee) {
		return repo.save(employee);
	}
	public List<Employee> findbydateofbirth(LocalDate date) {
		return this.repo.findByEmpDateOfBirth(date);
	}
	
	public List<Employee> findByLocation(String location){
		return this.repo.findByLocation(location);
		
		
	}
	public List<Employee> findBySkillSet(String skillset){
		return this.repo.findBySkillSet(skillset);
	}
	public List<Employee> getBySkillSetAndLoc(String skill,  String loc){
		return this.repo.findBySkillSetAndLocation(skill, loc);
		
		
	}

	public List<Employee> getBySkillSetOrLocation(String skill,String loc){
		return this.repo.findBySkillSetOrLocation(skill, loc);
	}

}
