package com.training.services;

import com.training.model.Student;

public class StudentServices {
	private Student student;

	public StudentServices() {
		super();
		// TODO Auto-generated constructor stub
	}
	//handle rule

	public StudentServices(Student student) {
		super();
		this.student = student;
	}
	public String sendDetials(){
		String name=null;
		try {
		
		name=this.student.getFirstName();
		}catch(NullPointerException e) {
			 System.err.println("Student Object is not passed check Again");
		 }
		return name;
	}
	public String findRank()throws Throwable{
		String grade="A";
		if(this.student.getMarkScored()>90) {
			grade="0";
		}
		return grade;
	}
	

}
