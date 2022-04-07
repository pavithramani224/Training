package com.training;
import java.util.*;
import com.training.model.BankAccount;
import com.training.services.BankAccountService;

public class MyApplication {
	public static void main(String[] args) {
		BankAccountService service = new BankAccountService();
		BankAccount[] list = new BankAccount[4];
		Scanner sc = new Scanner(System.in);
	    String option="no";
	    int i=0;
		
		do {
			BankAccount account = new BankAccount();
			
			System.out.println("Enter Account Number:");
			int accountNumber=sc.nextInt();
			System.out.println("Enter Account Holder Name");
			String accountHolderName=sc.next();
			System.out.println("Enter the balance");
			double balance=sc.nextDouble();
			System.out.println("Enter Account Type");
			String AccountType=sc.next();
			BankAccount account1 =new BankAccount(accountNumber,accountHolderName,balance);
			System.out.println("enter option to continue");
		    option=sc.next();
			list[i]=account;
			
			i++;
			
		}while(option.equals("yes"));
		service.findInterestbyAccountType(list);
		sc.close();
		//double[] value = service.findInterest(list);
		//for(double eachValue:value) {
			//System.out.println(eachValue);
		
		}
		//for each
	}

