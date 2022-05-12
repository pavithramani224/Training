package com.example.demo.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	public List<Employee> findByEmpDateOfBirth(LocalDate date);
	
	public List<Employee> findByLocation(String location);
	
	public List<Employee> findBySkillSet(String skillset);
	
	public List<Employee> findBySkillSetOrLocation(String skill,String loc);
	
	@Query(nativeQuery = true, value="select * from  pavi_employee where skill_Set=:skill and Location=:loc")
	public List<Employee> findBySkillSetAndLocation(@Param("skill")String skill, @Param("loc") String loc);
		
	}

