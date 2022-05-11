package com.example.demo.entity;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.asm.Advice.Local;



@Entity
@Table(name="pavi_employee")

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Employee {
	@Id
	@Column(name="employee_id")
	int employeeId;
	
	@Column(name="employye_name")
	String employeeName;
	
	@Column(name="date_of_birth")
	LocalDate empDateOfBirth;
	
	@Column(name="Location")
	String location;
	
	@Column(name="skillSet")
	String skillSet;
	
	@Column(name="phone_number")
	long phonenumber;

}
