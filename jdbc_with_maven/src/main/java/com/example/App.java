package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Optional;

import com.example.doa.MemberRespository;
import com.example.doa.ProductService;
import com.example.entity.Member;
import com.example.entity.Product;
import com.example.util.ConnectionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void product() {
		try {
			Connection con = ConnectionFactory.getPostgressConnection();
			ProductService pro = new ProductService(con);
			Product toadd = new Product(100,"choco",700);
			
			int rowadded = pro.addProduct(toadd);
			System.out.println("Row added" +rowadded);
			pro.findAll().forEach(System.out::println);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
    public static void member()
    {
    	 Connection con;
 		try {
 		con = ConnectionFactory.getOracleConnection();
 			
    	 con =ConnectionFactory.getPostgressConnection();
 			System.out.println(con);
	
 			con = DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV", "HR", "HR");
 			
 			//System.out.println(con);
 			MemberRespository mem = new MemberRespository(con);
 			System.out.println("-----------find all----------");
 			mem.findAll().forEach(System.out::println);
 			
 			int rowsDelete = mem.remove(1);
 			System.out.println("---------------remove---------------");
 			System.out.println("row deleted:"+rowsDelete);
 			mem.findAll().forEach(System.out::println);
 			
 			Optional<Member> found = mem.findById(3);
 			if(found.isPresent()) {
 				System.out.println("given id is present"+found.get());
 			}else {
 				System.out.println("given is id not present");
 			}
 			Member toadd = new Member(111,"achuu","chennai",LocalDate.of(2001,4,22),"annual",5000,2,400);
 			//int rowadded = mem.add(toadd);
 			//System.out.println("-------------Added---------------");
 			//System.out.println("rowAddded:"+rowadded);
 			//mem.findAll().forEach(System.out::println);
              System.out.println("--------update----");
 			System.out.println("member address:"+mem.update(3, "perambalur"));
 			mem.findAll().forEach(System.out::println);
 }catch(Exception e) {
    	e.printStackTrace();
    }
 		 }
    public static void main( String[] args ) {
    	product();
    	member();
    }
  
		}

