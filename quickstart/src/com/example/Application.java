package com.example;
import com.example.model.*;

/**
 * @author Pavithra.M
 *
 */
/**
 * @author Pavithra.M
 *
 */
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ram = new Student();
		//ram.rollNumber = 101;
		//public method able to access
		ram.setRollNumber(101);
		//default method unable to access=>
		//because student class is in com.example.model package
		//and Application is in com.example package
		ram.setFirstName("Ram");
		//unable to access because the application is Not a subclass of student 
		ram.setMarkScore(90);
		//unable to access because the method is private in student class
		//ram.setBranch("Cse");

		System.out.println(" Roll Number : =" + ram.getRollNumber());
		System.out.println(" mark Scored : =" + ram.getMarkScore());
		System.out.println(" First name : =" + ram.getFirstName());
		System.out.println(" branch : =" + ram.getBarnch());
		
		Student shyam = new Student(490, "pavi", "cse" , 90);
		System.out.println(shyam.getRollNumber());
	}
	// student means student class
	//object means object class
	
}
	

	

