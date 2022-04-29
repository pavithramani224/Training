package com.training.model;
import java.sql.*;
import java.util.Optional;

import com.training.entity.Invoice;
import com.training.entity.Product;
import com.training.service.ProductService;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Connection con;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV", "HR", "HR");
		    ProductService service = new ProductService(con);
		    
//		    Product toAdd = new Product(110,"sandal",200);
//		    //int rowAdded = service.addProduct(toAdd);
//		   // System.out.println("Row Added:" +rowAdded);
//		    service.findAll().forEach(System.out::println);
//		    
//		  
//		    int rowDelete = service.deleteById(104);
//		    System.out.println("Row deleted:"+rowDelete);
//		    service.findAll().forEach(System.out::println);
//		    
//		    Optional<Product> found = service.findById(107);
//		    if(found.isPresent())
//		    {
//		    	System.out.println("given id is present"+found.get());
//		    }else {
//		    	System.out.println("product with given id not present");
//		    }
//		    
//		   
//		    System.out.println("price updated:"+service.update("plant", 200.00));
//		    service.findAll().forEach(System.out::println);
//		    
//			System.out.println(con);
			
//			Product chip= new Product(1003,"chip",400);
//			Product pin = new Product(1004,"pin",500);
//			
//			service.usingtxn(chip, pin);
			
			Product fing= new Product(124,"king",600);
			Invoice inv2= new Invoice(1111,"jas",2,123);
			service.usingtxnwithCatchBlock(fing,inv2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
