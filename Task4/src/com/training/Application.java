package com.training;

public class Application {
	public static void main(String[] args) {
		Address address = new Address(38,"southstreet","Sengunam","perambalur");
		System.out.println(MobileBill.BRAND);
		MobileBill anu = new MobileBill("Anu",9884380211l,"prepaid",address);
		System.out.println("Customer Name:"+anu.getCustomerName());
		System.out.println("Customer Mobile Number:"+anu.getMobileNumber());
		System.out.println("Plan name:"+anu.getPlanName());
		System.out.println("Calcualte Amount:"+anu.calculateAmount());
		System.out.println("Adress:"+anu.getAddress());
		
		
		
	}

}
