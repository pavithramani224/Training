package com.training;
public class BankAccount {
	//static variable
	private static int count=100;//we can initialize the count value in count value
	//instance variable
		private String accountHolderName;
		private int accountNumber;
		public BankAccount() {
			super();
			// TODO Auto-generated constructor stub
		}
		private double balance;
		//static method
		public static int getcount() {
			return ++count;
		}
		//instance method
		public double getupdateBalance(double amount) {
			double udateBalance=0.0;// local variable
			double currentBalance = 0;
			//Local variable should be initialized before using 
			//System.out.println(updateBalance);
			currentBalance = this.balance+amount;
			this.balance=currentBalance;
			return currentBalance;
			//return 0;
			}
		public BankAccount(String accountHolderName, double balance) {
			super();
			this.accountHolderName = accountHolderName;
			this.balance = balance;
			this.accountNumber=getcount();
		}
		public int getAccountNumber() {
			return accountNumber;
		}
		
		public String getAccountHolderName() {
			return accountHolderName;
		}
		public void setAccountHolderName(String accountHolderName) {
			this.accountHolderName = accountHolderName;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}

}
