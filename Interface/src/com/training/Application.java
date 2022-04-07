package com.training;
import com.training.ifaces.CheckCondition;
import com.training.ifaces.Conditonal;
import com.training.ifaces.Function;
import com.training.services.CurrencyConverter;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//subtype=new subtype
		//CurrencyConverter conv=new CurrencyConverter
		//subtype=subtype
		
		CurrencyConverter conv = new CurrencyConverter();
		double response = conv.apply(200);
		System.out.println(response);
		System.out.println(conv.apply(300));
		//using class
		Function conv1 = new CurrencyConverter();
		double  response1 = conv1.apply(response);
		System.out.println(response1);
	//
		System.out.println(conv.apply(300));
		System.out.println("Count is:"+Function.COUNTER);
		if(conv instanceof CheckCondition) {
			CheckCondition obj = (CheckCondition)conv;
			System.out.println("Is disscount Allowed="+obj.test(300));
			Conditonal condobj = new DiscountCalculator();
			System.out.println(condobj.negative(6000));
			System.out.println(condobj.test(6000));
			
		}
		

	}

}
