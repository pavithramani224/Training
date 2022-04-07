package com.training;

public class Application {
	public static void main(String[] args) {
		BankAccount account = new BankAccount("Ramesh",1000);
		System.out.println(account.getAccountNumber());
		System.out.println(account.getupdateBalance(2000));
		BankAccount account2 = new BankAccount("abbu",2000);
		System.out.println(account2.getAccountNumber());
		System.out.println(account2.getupdateBalance(2000));
		
	}

}
