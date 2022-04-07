package com.training.model;

public class BankAccount {
	private int accountNumber;
	private String accountHoldername;
	private double accountBalance;
	private String accountType;
	
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("ZERO Argument constructor of SUPER CLASS called");
	}
	//three parameter
	public BankAccount(int accountNumber, String accountHoldername, double accountBalance) {
		super();
		System.out.println("THREE Argument constructor of SUPER CLASS called");
		this.accountNumber = accountNumber;
		this.accountHoldername = accountHoldername;
		this.accountBalance = accountBalance;
	}
	//four parameter
	public BankAccount(int accountNumber, String accountHoldername, double accountBalance, String accountType) {
		super();
		System.out.println("FOUR Argument constructor of SUPER CLASS  called");
		this.accountNumber = accountNumber;
		this.accountHoldername = accountHoldername;
		this.accountBalance = accountBalance;
		this.accountType = accountType;
	}
	public String getAccountType(String accountType) {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHoldername() {
		return accountHoldername;
	}
	public void setAccountHoldername(String accountHoldername) {
		this.accountHoldername = accountHoldername;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getAccountType() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
        return  super.toString()+this.accountNumber+","+this.accountHoldername+","+this.getAccountBalance()+","+this.accountType;
	}
	
	

}
