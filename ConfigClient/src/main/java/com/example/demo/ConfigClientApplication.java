package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.repos.ProductRepository;

@SpringBootApplication
@RestController
public class ConfigClientApplication {

//	@Value("${customer.firstName}")
//	private String name;
//	
//	@GetMapping(path="/names")
//	private String getName() {
//		
//		return this.name;
//	}
	
	//for console to print
//	public static void main(String[] args) {
//		ConfigurableApplicationContext ctx =   SpringApplication.run(ConfigClientApplication.class, args);
//		
//		ProductRepository repo = ctx.getBean(ProductRepository.class);
//		repo.findAll().forEach(System.out::println);
//		
//	}
	
	
	// for edureka to print
	
	@Autowired
	private ProductRepository repo;
	
	@GetMapping(path="/products")
	
	public List<Product> getName(){
		return this.repo.findAll();
		
	}
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =   SpringApplication.run(ConfigClientApplication.class, args);

}
}
