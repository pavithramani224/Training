package com.training.services;

import com.training.ifaces.Function;
import com.training.ifaces.CheckCondition;
import com.training.ifaces.*;
//a class can allowed only one 
//class Dummy Extends Function{
//	
//}

public  class CurrencyConverter implements Function,CheckCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public double apply(double value) {
		return value*100;
	}
	@Override
	public boolean test(int value) {
		return value>5000;
	}

}
