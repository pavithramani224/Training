package com.training.model;

import com.training.service.Conditional;
import com.training.utils.ObjectFactory;

public class NewObjectFactory extends ObjectFactory {

	@Override
	public Conditional getConditional(int key) {
		// TODO Auto-generated method stub
		Conditional obj =null;
		if(key==3) {
			obj= new Principal("private");
		}
		else
		{
			obj=super.getConditional(key);
		}
		return obj;
	}

}
