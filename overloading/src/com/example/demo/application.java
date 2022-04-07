package com.example.demo;
import java.util.*;
public class application {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the name");
		
		String name = sc.next();
		
		Converter obj = new Converter();
		
		System.out.println(obj.convert(name));
		
		System.out.println("enter the Farenheit Temp");
		
		double farenTemp=sc.nextDouble();
		
		System.out.println("celcius Temp:"+obj.convert(farenTemp));
		
		System.out.println("Enter the amount");
		double amount = sc.nextDouble();
		
		System.out.println(" enter the amount 1-USD 2-Euro");
		
		int frm = sc.nextInt();
		System.out.println("amt:"+obj.convert(amount,frm));
		
		
		sc.close();

	}

}
