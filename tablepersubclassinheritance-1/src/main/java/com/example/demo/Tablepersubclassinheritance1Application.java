package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.HealthInsurance;
import com.example.demo.entity.LifeInsurance;
import com.example.demo.service.InsuranceService;

@SpringBootApplication
public class Tablepersubclassinheritance1Application {

	public static void main(String[] args) {
		
	ConfigurableApplicationContext ctx=SpringApplication.run(Tablepersubclassinheritance1Application.class, args);
	
	
	InsuranceService service=ctx.getBean(InsuranceService.class);
	System.out.println("---------get all policy-----");
	service.getallPolicy();
	System.out.println("----------get health policy-----------");
	service.addHealthPolicy();
	System.out.println("----------add lifepolicy-------------");
	service.addLifePolicy();
	System.out.println("-----------findall--------------");
	
	
	ctx.close();
}
@Bean
public LifeInsurance life() {
   
   return new LifeInsurance(689632,"Divya",25,"it services");
}
@Bean
public HealthInsurance health() {
   
   return new HealthInsurance(543103,"Rames",55,"Diabetic");
}
}