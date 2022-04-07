package com.training;

import com.training.model.BankAccount;
//when ever sub class constructor is called its super class
//constructor also called even if super() keyword is not present
public class SavingsAccount extends BankAccount {
	private String nominee;

	public String getNominee() {
		return nominee;
	}

	public void setNominee(String nominee) {
		this.nominee = nominee;
	}

	public SavingsAccount(int accountNumber, String accountHoldername, double accountBalance, String accountType,
			String nominee) {
		super(accountNumber, accountHoldername, accountBalance, accountType);
		this.nominee = nominee;
	}

	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//subclass and superclass also works
//	private String nominee;
//	public SavingsAccount() { //constructor
//		System.out.println("CONSTUCTOR of SUB CLASS called");
//		}
//    public SavingsAccount() {
//    	super(1020,"ram",5000);
//    	System.out.println("constructor of SUB CLASS called");
    	//}
	
	

}
