package com.training;

public class Customer {
	private int CustomerId;
	private String customerName;
	private long phoneNumber;
	private String emailId;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int customerId, String customerName, long phoneNumber, String emilaId) {
		super();
		CustomerId = customerId;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.emailId = emilaId;
	}
	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmilaId() {
		return emailId;
	}
	public void checkemailId() throws Exception  {
		if(this.emailId.contains("@")&&this.emailId.contains(".com")) {
			System.out.println("This is valid email");
			
		}
		else {
			
				throw new InvalidEmailException("Invalid email Id");
			
	}

}}
