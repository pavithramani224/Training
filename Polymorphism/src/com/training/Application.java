package com.training;

import com.training.model.NewObjectFactory;
import com.training.service.Conditional;
import com.training.utils.ObjectFactory;

public class Application {
	public static void main(String[] args) {
		//ObjectFactory factory = new ObjectFactory();
		NewObjectFactory factory1 = new NewObjectFactory();
		Conditional profobj = factory1.getConditional(1);
		Conditional studobj = factory1.getConditional(2);
		Conditional prinobj = factory1.getConditional(3);
		System.out.println(profobj.test("Chennai"));
		System.out.println("Allowance:"+factory1.getValue(profobj,"Chennai"));
		System.out.println("Allowance:"+factory1.getValue(studobj, "38"));
		System.out.println("allowance"+factory1.getValue(prinobj, "engg"));
		
	
	}
	

}
