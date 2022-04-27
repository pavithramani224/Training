package com.example;

import java.sql.Connection;

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
    	    CustomerRespository cust = new CustomerRespositroy(con);
    	    cust.findAll().forEach(System.out::println);
    	    
       }catch(Exception e) {
    	   e.printStackTrace();
       }
    }
}
