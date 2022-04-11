package com.training.services;

import java.util.Scanner;

import com.training.Exception.RangeCheckException;
import com.training.model.Student;
import com.training.services.ExceptionHandling;
import com.training.services.StudentServices;

public class Application {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Student ram = null;
		try {
			ram = new Student(1010,"ram",98);
		} catch (RangeCheckException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
				
		//System.out.println(ram.getRollNumber());
		//System.out.println(ram.getFirstName());
		//System.out.println(ram.getMarkScored());
		StudentServices service = new StudentServices();
		
		System.out.println(service.sendDetials());
		StudentServices service1=new StudentServices();
		try {
			System.out.println(service1.findRank());
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.err.println("name is not passed");
			e.printStackTrace();
		}
		Student stud = new Student();
		stud.setMarkScored(98);
		
		ExceptionHandling exhandling = new ExceptionHandling();
		exhandling.usingArrayIndexExpection(args);
		exhandling.usingNumberForamtExcpetion("45");
		
		exhandling.usingFinallyBlock();
		exhandling.understandingFinallyBlock();
	try(Scanner scan=new Scanner(System.in)){
		System.out.println("Enter number");
		int num=scan.nextInt();
		System.out.println(num);
		//since we are using try with resource Scanner will automatically closed
	}catch(Exception e) {
		e.printStackTrace();
		
	}
	}
}
