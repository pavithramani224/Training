package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Address;
import com.example.demo.ifaces.AddressRepository;



@Service
public class AddressService {
	@Autowired

	private AddressRepository repo;
	
	public void test1() {
		
		List<Address> addressList=repo.findAll();
		
		for(Address eachAddress:addressList) {
			
			System.out.println(eachAddress.getTitle());
			System.out.println(eachAddress.getCity());
			System.out.println(eachAddress.getUser());
		}
	}
public void test2() {
		
		List<Address> addressList=repo.findAll();
		
		for(Address eachAddress:addressList) {
			
			System.out.println(eachAddress.getTitle());
			System.out.println(eachAddress.getCity());
			System.out.println(eachAddress.getUser());
		}
	}
public void test3() {
	
	List<Address> addressList=repo.findAll();
	
	for(Address eachAddress:addressList) {
		
		System.out.println(eachAddress.getTitle());
		//System.out.println(eachAddress.getCity());
		System.out.println(eachAddress.getUser());
	}
}

public List<Address> findAll(){
	return this.repo.findAll();
	
}


}