package com.training.model;
import com.training.model.VechicleInsurance;
import com.training.model.LifeInsurance;
import com.training.model.Insurance;
public class Application {

	public static void printPremium(Insurance object) {
		// TODO Auto-generated method stub
		System.out.println("premium:"+object.calculatePremimum());
	}
	public static  void main(String[] args) {
		VechicleInsurance  car = new VechicleInsurance (1010,"ramesh","car",2019);
		printPremium(car);
		LifeInsurance life = new LifeInsurance(1012,"abi",60);
		printPremium(life);
		String[] illness= {"bp","sugar","ent","thyroid"};
		HealthInsurance health=new HealthInsurance(1013,"lala",illness);
		printPremium(health);
		
	}

}
