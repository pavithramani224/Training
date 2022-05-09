package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Product;
import com.example.demo.repos.ProductRepository;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
	//	SpringApplication.run(SpringJdbcApplication.class, args);
		
	ApplicationContext ctx = SpringApplication.run(SpringJdbcApplication.class, args);
	
	ProductRepository repo=ctx.getBean(ProductRepository.class);
    repo.findAll().forEach(System.out::println);
    
    Product gel=ctx.getBean(Product.class);
//    System.out.println("Row Added:"+repo.add(gel));
//    repo.findAll().forEach(System.out::println);
   
     System.out.println("find by id="+repo.findById(2001));
     //repo.findAll().forEach(System.out::println);
     
     System.out.println("deleted by id="+repo.remove(121));
     //repo.findAll().forEach(System.out::println);
     Product pin=ctx.getBean(Product.class);
     
     System.out.println("row updated=" +repo.update(pin));
     //repo.findAll().forEach(System.out::println);
	}
	@Bean
	public Product pin() {
		//when we entering wrong product id then will be it show row update-0
		return new Product(9766,"pin",900);
	}

}
