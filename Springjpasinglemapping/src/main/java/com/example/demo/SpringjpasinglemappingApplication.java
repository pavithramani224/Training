package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Doctor;
import com.example.demo.service.DoctorService;

@SpringBootApplication
public class SpringjpasinglemappingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringjpasinglemappingApplication.class, args);
		
		Doctor pavi = ctx.getBean(Doctor.class);
		
		
		
		DoctorService service = ctx.getBean(DoctorService.class);
		
		Doctor added = service.add(pavi);

		
		if(added!=null) {
			System.out.println("one Doctor added");
		}
		System.out.println("----------find all---------");
		service.findAll().forEach(System.out::println);
		
		System.out.println("----------find by department-----------");
		service.findByDept("ent").forEach(System.out::println);
		
		System.out.println("------find by name-----");
		service.findByName("ravi").forEach(System.out::println);;
		
		System.out.println("----find by name and departemnt-----");
		service.findByNameAndDept("pavi","heart").forEach(System.out::println);
		
		System.out.println("----find by name or department");
		service.findByNameORDept("pavi", "ent").forEach(System.out::println);;
		ctx.close();
		
	}
	@Bean
	public Doctor pavi(){
		return new Doctor (2020,"pavi","heart",9884380211l);
	}
	
		
	}


