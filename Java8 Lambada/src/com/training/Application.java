package com.training;

import com.training.ifaces.Converter;
import com.training.services.CurrencyConverter;

public class Application {
	public static void print(Converter<Double,Double> conv) {
		System.out.println(conv.Convert(100.00));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Converter<Double,Double> obj = new CurrencyConverter();
		System.out.println(obj.Convert(29.0));
		
		Converter<Double,Double> lambda = (val)->val*200.0;
		System.out.println(lambda.Convert(20.00));
		print(lambda);
		
		Converter<String,Integer> StrLength =(Str) ->Str.length();
		System.out.println(StrLength.Convert("Chennai"));

	}

}
