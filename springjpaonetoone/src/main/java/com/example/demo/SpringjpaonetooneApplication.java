package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Seminar;
import com.example.demo.entity.Speaker;
import com.example.demo.utils.SeminarUtils;

@SpringBootApplication
public class SpringjpaonetooneApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringjpaonetooneApplication.class, args);
		
		SeminarUtils obj=ctx.getBean(SeminarUtils.class);
	
		obj.create();
		obj.findAll();
		
	}
	
	@Bean
	public Speaker arun() {
		return new Speaker(101,"arun","ece");
		
	}
    @Bean
    public Seminar python() {
    	Seminar sem=new Seminar();
    	sem.setSeminarId(201);
    	sem.setDuration(10);
    	sem.setSeminarName("pavi");
    	return sem;
    }
    
}