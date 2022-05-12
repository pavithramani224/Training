package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.utils.Doctorutils;

import antlr.Utils;

@SpringBootApplication
public class SpringjpaonetomanyApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = 
				SpringApplication.run(SpringjpaonetomanyApplication.class, args);
		Doctorutils obj = ctx.getBean(Doctorutils.class);
		
//		Utils obj1 = ctx.getBean(Utils.class);
		
	
		obj.create();
		obj.findAll();
	}

	
	@Bean
	public Doctor ariya() {
		Doctor doc1 = new Doctor();
		doc1.setDoctorId(101);
		doc1.setDoctorName("ariya");
		doc1.setDepartment("skin");
		doc1.setPhoneNumber(9159161960l);
		return doc1;
	}
	
	@Bean
	public Patient dhiya() {
		return new Patient(1003,"dhiya",9884380211l);
	}
	@Bean
	public Patient siva() {
		return new Patient(1004,"siva",98849080211l);
	}
}
