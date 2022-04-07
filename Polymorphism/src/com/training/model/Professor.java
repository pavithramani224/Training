package com.training.model;

import com.training.service.Conditional;

public class Professor implements Conditional {

private String Qualification;
	
	public Professor(String qualification) {
		super();
		Qualification = qualification;
	}


	public String getQualification() {
		return Qualification;
	}


	public void setQualification(String qualification) {
		Qualification = qualification;
	}


	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public boolean test(Object value) {
		// TODO Auto-generated method stub
		String strValue = (String)value;
		boolean result=false;
		if(strValue.toLowerCase().equals("Chennai")) {
			result=true;
		}
		return result;
	}

}
