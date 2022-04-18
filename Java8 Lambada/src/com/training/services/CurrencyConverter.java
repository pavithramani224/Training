package com.training.services;

import com.training.ifaces.Converter;

public class CurrencyConverter implements Converter<Double, Double> {

	@Override
	public Double Convert(Double value) {
		// TODO Auto-generated method stub
		return 100*value;
	}

	

	

	
	

}
