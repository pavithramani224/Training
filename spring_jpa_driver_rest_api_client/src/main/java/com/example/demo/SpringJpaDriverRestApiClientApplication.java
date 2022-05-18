package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Driver;

@SpringBootApplication
public class SpringJpaDriverRestApiClientApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx = 
		SpringApplication.run(SpringJpaDriverRestApiClientApplication.class, args); 
	
	Client client = ctx.getBean(Client.class);
	
	System.out.println(client.invokeGetAll());
	
	
	
//	Driver[] list = client.invokeAllObject();
//	
//	for(Driver EachDriver:list) {
//		System.out.println("driver id:"+EachDriver.getDriverId());
//		System.out.println("driver name:"+EachDriver.getDriverName());
//		System.out.println("driver mobile number:"+EachDriver.getMobileNumber());
//		System.out.println("driver rating"+EachDriver.getRating());
//	}
//	
//	client.add();


	ctx.close();
	
	}

	@Bean
	public RestTemplate template() {
		RestTemplate template = new RestTemplate();
		
		template.getInterceptors().add(interceptor());
		
		return template;
	}
	
	@Bean
	public BasicAuthenticationInterceptor interceptor() {
		return new BasicAuthenticationInterceptor("India", "India");
	}
}
