package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.example.doa.MemberRespository;

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
 			con = DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV", "HR", "HR");
 			//System.out.println(con);
 			MemberRespository mem = new MemberRespository(con);
 			mem.findAll().forEach(System.out::println);
    }catch(SQLException e) {
    	e.printStackTrace();
    }
    }
}
