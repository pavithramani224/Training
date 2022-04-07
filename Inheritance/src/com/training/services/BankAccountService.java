package com.training.services;
import com.training.model.BankAccount;
public class BankAccountService {
	public double calculateInterest(BankAccount account) {
		double simpleInterest = 0.05;
		if(account.getAccountNumber()<5000) {
			simpleInterest=0.06;
		}
		return account.getAccountBalance()*2*simpleInterest;
		
	}
	

	public BankAccountService() {
		super();
		// TODO Auto-generated constructor stub
	}
	//overloaded Method
	public void calculateInterest(BankAccount[] accounts) {
		//for each loop concept using void(retrun nothing so we using 
		for(BankAccount eachAccount : accounts) {  
			System.out.println(calculateInterest(eachAccount));
		}
	}
	public double[] findInterest(BankAccount[] accounts) {
		// for each loop for concept using double its return something so we declare
		//function does not retrun more than one value
		//so we use array concept
		double[] values = new double[9];
		int i =0;
		for(BankAccount eachAccount:accounts){   //each account for our convnient as per we want
			values[i] = calculateInterest(eachAccount);
			i++;
			 }
		return values;
		}
		//for(int i=0;i<value.length;i++) {
			//System.out.println(eachAccount);
		//}
	private double calculateByAccountType(BankAccount account,double rateOfInterest) {
		String type = account.getAccountType();
		//double rateOfInterest = 0.07;
//		
//				if(type.equals("saving")) {
//					rateOfInterest = 0.05;
//				}
//				if(type.equals("Fixed"))||(type.equals("recurring")){
//					rateOfInterest=0.06;
//				}
//				return rateOfInterest;
		return account.getAccountBalance()*1*rateOfInterest;
	}
	
//public double[]=findInterestByAccountType(BankAccount account){
//		for(BankAccount eachAccount:accounts) {
//			String key = eachAccount.getAccountType();
//			switch (key) {
//			case "savings":
//				double value = calculateByAccountType(eachAccount);
//				values[i]=value;
//				
//				break;
//			case "fixed":
//				values[i] = calculateByAccountType(eachAccount);
//				break;
//			case "recurring":
//				values[i] = calculateByAccountType(eachAccount);
//				break;
//
//			default:
//				break;
//			}
//	}
	public double[] findInterestbyAccountType(BankAccount[] accounts) {
		
		//using the
		System.out.println("Account Type"+accounts.length);
		double [] values = new double[accounts.length];
		for(BankAccount eachAccount:accounts) {
			int i=0;
		
			String key = eachAccount.getAccountType();
			switch (key) {
			case "savings":
				values[i] = calculateByAccountType(eachAccount,0.05);
				break;
			case "fixed":
				values[i] = calculateByAccountType(eachAccount,0.07);
				break;
			case "recurring":
				values[i] = calculateByAccountType(eachAccount,0.07);
				break;

			default:
				break;
			}
		
	}
		return values;
	}


	public double CaluclateInterest(BankAccount account) {
		// TODO Auto-generated method stub
		return 0;
	}


	public double caluclateInterest(BankAccount account) {
		// TODO Auto-generated method stub
		return 0;
	}
	}
