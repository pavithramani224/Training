package com.example.model;

public class Student {
	private int rollNumber;
	private String firstName;
	private String branch;
	private double markScore;
	public String getBarnch() {
		return branch;
	}
	public Student() {
		super(); 
		// TODO Auto-generated constructor stub
	}
	public Student (int rollNumber, String firstName, String branch, double markScore) {
		super();
		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.branch = branch;
		this.markScore = markScore;
	}
	public Student(int rollNumber, String firstName, String branch) {
		this(rollNumber,firstName,branch,99);
		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.branch = branch;
	}
    public void setBarnch( String branch) {
		this.branch = branch;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public double getMarkScore() {
		return markScore;
	}
	
	public void setMarkScore(double markScore) {
		this.markScore = markScore;
	}
	
	

}
