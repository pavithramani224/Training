package com.training;
import com.training.model.BankAccount;
import com.training.services.BankAccountService;
import com.training.services.SavingsAccountService;

public class Application {
	

	public static void main(String[] args) {
		BankAccount account = new BankAccount(1010,"pavi",50000,"savings");
		System.out.println(account.toString());
		//SavingsAccount account = new SavingsAccount();
		SavingsAccount account1 = new SavingsAccount(650,"anu",2000,"joint","rajesh");
		System.out.println(account1.getAccountNumber());
		System.out.println(account1.getNominee());
		SavingsAccountService Service = new SavingsAccountService();
		System.out.println(Service.getCustomerInfo(account1));
		System.out.println(Service.calculateInterest(account));
		BankAccountService service2 = new SavingsAccountService();
		//cannot access the sub class method with super class reference
		//service2.getCustomerInf0(account);
		SavingsAccountService savingService2 = (SavingsAccountService)service2;
		SavingsAccountService sc2 = new SavingsAccountService();
		System.out.println(savingService2.getCustomerInfo(account1));
		
	}
}
