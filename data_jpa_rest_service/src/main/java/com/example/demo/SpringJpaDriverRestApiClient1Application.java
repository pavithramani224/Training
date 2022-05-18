package com.example.demo;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Passenger;
import com.example.demo.entity.TripHistory;
import com.example.demo.ifaces.PassengerRepository;

@SpringBootApplication
public class SpringJpaDriverRestApiClient1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =
		SpringApplication.run(SpringJpaDriverRestApiClient1Application.class, args);
	
	}
	@Bean
	public CommandLineRunner runner() {
		return new CommandLineRunner() {
			@Autowired
			PassengerRepository repo;

			@Override
			public void run(String... args) throws Exception {
				// TODO Auto-generated method stub
//				repo.save(new TripHistory(1,LocalDateTime.now(),"chennai","mumbai",4000));
//				repo.save(new Passenger(101,"anu","pavi@email.com","chennai",1));
//				
		Passenger pavi = new Passenger();
		pavi.setPassengerId(1007);
		pavi.setPassengerName("pavi");
		pavi.setPassengerEmail("pavi@gmail.com");
		pavi.setPassengerLocation("chennai");
		
		List<TripHistory> list1 = Arrays.asList(new TripHistory(101, LocalDateTime.of(2022, 05, 01, 10, 30),"Kallai bus stop", "Ooty bus stop", 5500.00 ));
		
		pavi.setTripHistory(list1);
		
		repo.save(pavi);

				

			}
			
		};
		
	}

}

