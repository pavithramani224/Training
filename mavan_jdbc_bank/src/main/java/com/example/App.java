package com.example;

import java.sql.Connection;
import java.util.Optional;

import com.training.doa.CustomerService;
import com.training.entity.Customer;
import com.training.entity.LoanApplication;
import com.training.util.ConnectionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Connection con;
       try {
    	   con = ConnectionFactory.getOracleConnection();
    	   System.out.println(con);
 	 CustomerService cust = new CustomerService(con); 
 	 cust.findAll().forEach(System.out::println);
 	 
 	 Optional<LoanApplication> found = cust.findById(1);
 	 if(found.isPresent()) {
 		 System.out.println("given id is present"+found.get());
 	 }else {
 		 System.out.println("given id is not present");
 	 }
 	 Customer cus = new Customer(6,"jaya",9884380211l,300);
 	 LoanApplication toadd = new LoanApplication(1006,cus,300);
// 	int rowadded = cust.add(toadd);
// 	 //int rowadded2 = cust.add(toadd);
// 	 System.out.println("row added"+rowadded);
// 	 cust.findAll().forEach(System.out::println);
 	 
 	 
       }catch(Exception e) {
    	   e.printStackTrace();
       }
    }
}
