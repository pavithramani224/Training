package com.training.services;
import com.training.model.*;

public class Application {
	public static void main(String[] args) {
		BankAccountService service = new BankAccountService();
		BankAccount ram = new BankAccount(4000,"ram",5000);
		BankAccount shayam = new BankAccount(6200,"Shayam",7000);
		BankAccount pavi = new BankAccount(5000,"pavi",8000);
		double simpleIntrest = service.calculateInterest(ram);
		System.out.println("Simple Interest:%5%="+simpleIntrest);
		double simpleIntrest2 = service.calculateInterest(shayam);
		System.out.println("simple Interest:@6%="+simpleIntrest2);
		//creating Array
		//BankAccount[] accounts = new BankAccount[2];
		//accounts[0]=ram;
		//accounts[1]=shayam;
		//service.calculateInterest(accounts);
		BankAccount[] accounts = {ram,shayam}; //initialization and declaration in single place(easy way)
		service.calculateInterest(accounts);
		System.out.println("**********");
		double[] values = service.findInterest(accounts);
		for(double eachvalue:values) {
			System.out.println(eachvalue);
		}
			BankAccount[] accountList= {
					new BankAccount(800,"jay",7000,"saving"),
					new BankAccount(801,"baby",8000,"fixed"),
					new BankAccount(802,"shalu",9000,"recurring")
			};
			double[] interestValues = service.findInterestbyAccountType(accountList);
			//double [] list  =service.findInterestbyAccountType(accounts);
			//int code = service.hashCode();
			for(double eachValue:interestValues) {
				System.out.println(eachValue);
			}
		
	}

}
