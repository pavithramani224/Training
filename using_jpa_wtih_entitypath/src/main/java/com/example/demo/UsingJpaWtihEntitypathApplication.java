package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Address;
import com.example.demo.entity.City;
import com.example.demo.entity.User;
import com.example.demo.ifaces.AddressRepository;
import com.example.demo.service.AddressService;

@SpringBootApplication
public class UsingJpaWtihEntitypathApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx = 
		SpringApplication.run(UsingJpaWtihEntitypathApplication.class, args);
	
	AddressService service = ctx.getBean(AddressService.class);
	System.out.println("fetch data from class");
	service.test1();
//	
//	System.out.println("using two class to fetch data");
//	service.test2();
//	
//	System.out.println("using one class in path");
//	service.test3();
	
	System.out.println("--------findall-----------");
	ctx.close();
	
	}



@Bean
public CommandLineRunner runner() {
	
	return new CommandLineRunner() {
		
		@Autowired
		AddressRepository repo;

		@Override
		public void run(String... args) throws Exception {
			// TODO Auto-generated method stub
			
			City Chennai = new City(500,"chennai");
			City madurai = new City(501,"Madurai");
			
			User ram = new User(1001,"ram",99889896779l);
			User suresh = new User (1002,"suresh",9999999999l);
			
			Address address1 = new Address(101,"Mr.",madurai,suresh);
			Address address2 = new Address(102,"Mr.",Chennai,ram);
			
			this.repo.save(address1);
			this.repo.save(address2);
			
			
		}
	
	};
}

}