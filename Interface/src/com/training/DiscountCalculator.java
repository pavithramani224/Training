package com.training;
import com.training.ifaces.CheckCondition;
import com.training.ifaces.Conditonal;

public class DiscountCalculator implements Conditonal {

	@Override
	public boolean negative(int value) {
		// TODO Auto-generated method stub
		return value>500;
	}

	@Override
	public boolean test(int value) {
		// TODO Auto-generated method stub
		return value<500;
	}

}
