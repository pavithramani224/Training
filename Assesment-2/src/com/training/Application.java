package com.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import com.training.model.Country;
import com.training.service.CountryService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
			System.out.println(con);
			CountryService service=new CountryService(con);
			List<Country>list=service.findAll();
			list.forEach(System.out::println);
			
		CountryService.findCountry(list, "USA");
		CountryService.findPopulation(list, "India");
		CountryService.findCountryAndCount(list, "USA");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		
	}

}
