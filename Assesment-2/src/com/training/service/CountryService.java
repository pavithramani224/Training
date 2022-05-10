package com.training.service;



import static java.util.stream.Collectors.toList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.training.model.Country;



public class CountryService {

	private Connection con;
	public CountryService(Connection con) {
		super();
		this.con=con;
		// TODO Auto-generated constructor stub
	}
	
	
	public List<Country> findAll(){
		
		 List<Country> list=new ArrayList<>();
		String sql="Select * from harish_country";
		
		try(PreparedStatement ptmst=con.prepareStatement(sql)){
			ResultSet rs=ptmst.executeQuery();
		
			
			while(rs.next()) {
				
				String place=rs.getString("place");
				String countryName=rs.getString("country");
				long population=rs.getLong("population");
				
				Country country=new Country(countryName, place, population);
				list.add(country);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("matikita pangu");
		}
		
		return list;
		
	}
	
	
	public static void findCountry(List<Country>list,String country) {
		
		List<String> place=list.stream()
				.filter(e -> e.getCountryName().equals(country)).map(e -> e.getPlace()).collect(toList());
				
	 place.forEach(System.out::println);
	}
	
	public static void findPopulation(List<Country>list,String country ) {
		Long count=list.stream().filter(e-> e.getCountryName().equalsIgnoreCase(country)).mapToLong(e -> e.getPopulation()).sum();

				
	 System.out.println(country+"="+count); 
}
	
	public static void findCountryAndCount(List<Country>list,String country) {
		Long count =  list.stream().filter(e-> e.getCountryName().equals(country)).count();
	

		
		System.out.println(country +"="+count);
	
}
}
