package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Driver;
import com.example.demo.ifaces.DriverRepository;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info=@Info(title="Driver Serice API", version = "1.0"))
public class SpringJpaDriverRestApiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =  
		SpringApplication.run(SpringJpaDriverRestApiApplication.class, args);
		
	}
	
	@Bean
	public CommandLineRunner runner() {
		return new CommandLineRunner() {
			@Autowired
			DriverRepository repo;

			@Override
			public void run(String... args) throws Exception {
				// TODO Auto-generated method stub
				repo.save(new Driver(182,"anu",9889899999l,4.1));
				repo.save(new Driver(183,"anju",98898999584l,3.8));

			}
			
		};
		
	}
}
