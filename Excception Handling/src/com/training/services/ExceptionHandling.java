package com.training.services;

public class ExceptionHandling {
	public void usingArrayIndexExpection(String[] args)
	{
		try {
			System.out.println(args[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("method requires three values to be passed a,b,c");
			//e.printStackTrace();
		}
	}
	public void usingNumberForamtExcpetion(String value) {
		// TODO Auto-generated method stub
		int age=0;
		
		try {
			  Integer.parseInt(value);
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println(age);
			e.printStackTrace();
		}
	}
		public void usingFinallyBlock() {
			int denominator=0;
			try {
				System.out.println(4/denominator);
			}catch(ArithmeticException e) {
				System.err.println("Denominator should not be zero");
			}
			finally {
			
			System.out.println("INSIDE FINAL===");
			}
			System.out.println("thank,bye,bye");
			
			
			
		}
		public String understandingFinallyBlock()  {
			int denominator=4;
			try {
				System.out.println(4/denominator);
			}catch(ArithmeticException e) {
				System.err.println("Denominator should not be zero");
				return "welcome";
			}
			finally {
				System.out.println("INSIDE FINAL===");
			}
			System.out.println("thank,bye,bye");
			return "thanks";
		}
			
		
	}
	
