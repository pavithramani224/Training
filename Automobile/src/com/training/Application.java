package com.training;

public class Application {
	public static void main(String[] args) {
		ObjectFactory obj = new ObjectFactory();
		AutoMobile maruti=obj.getObject(1);
		AutoMobile toyota=obj.getObject(3);
		obj.printQuote(toyota);
		obj.printQuote(maruti);
		}

}
