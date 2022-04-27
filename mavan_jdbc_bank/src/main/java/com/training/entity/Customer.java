package com.training.entity;

public class Customer {
	private int customerId;
	private String customerName;
	private long phonenumber;
	private double creditScore;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int customerId, String customerName, long phonenumber, double creditScore) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.phonenumber = phonenumber;
		this.creditScore = creditScore;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public double getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(double creditScore) {
		this.creditScore = creditScore;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", phonenumber=" + phonenumber
				+ ", creditScore=" + creditScore + "]";
	}
	

}
