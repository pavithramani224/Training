package com.training;

public class Application {
	public static void main(String[] args) {
		
		Customer detials = new Customer(100,"pavi",9884380211l,"pavithramani224@gmail");
		
		try {
			detials.checkemailId();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
