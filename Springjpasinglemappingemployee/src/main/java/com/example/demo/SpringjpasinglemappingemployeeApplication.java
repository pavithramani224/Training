package com.example.demo;

import java.time.LocalDate;
import java.time.Month;

import org.apache.tomcat.jni.Local;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@SpringBootApplication
public class SpringjpasinglemappingemployeeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=
		SpringApplication.run(SpringjpasinglemappingemployeeApplication.class, args);
		
		EmployeeService service = ctx.getBean(EmployeeService.class);
		Employee pavi =ctx.getBean(Employee.class);
		
         Employee added = service.add(pavi);

		if(added!=null) {
			System.out.println("one Doctor added");
		}
		
		
		System.out.println("find all");
		service.findAll().forEach(System.out::println);
		
		System.out.println("find by date of birth");
		service.findbydateofbirth(LocalDate.of(2001, 4 ,22)).forEach(System.out::println);
		
		System.out.println("find by location");
		service.findByLocation("perambalur").forEach(System.out::println);
		
		System.out.println("find by skillset");
		service.findBySkillSet("java").forEach(System.out::println);
		
	}
	@Bean
	public Employee pavi(){
		return new Employee(1001,"pavi",LocalDate.of(2001, Month.APRIL, 22),"perambalur","java",9884380211l);
	}
}
