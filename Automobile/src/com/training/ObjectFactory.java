package com.training;
import com.training.AutoMobile;
import com.training.Maruticar;
import com.training.ToyotaCar;

public class ObjectFactory {
	public AutoMobile getObject(int key) {
		switch (key) {
		case 1:
			return new Maruticar("maruticar");
		case 2:
			return new ToyotaCar("Toyotacar");

		default:
			return null;
		}
		}

	public void printQuote(AutoMobile poly) {
		if(poly!=null) {
		System.out.println(poly.carColor());
		System.out.println(poly.carName());
		System.out.println(poly.carPrice());
		}
		else
		{
			System.out.println("Invaild inupt ");
			System.out.println("Enter either 1 or 2");
		}
		
	}

}
