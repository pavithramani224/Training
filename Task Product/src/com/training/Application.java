package com.training;
import java.util.*;

public class Application {
	public static void main(String[] args) {
		Product soap = new Product(101,"soap",55);
		Product dress = new Product(102,"dress",97);
		Product cookies = new Product(103,"cookies",60);
		Product juice = new Product(104,"juice",90);
		Product pen = new Product(105,"pen",15);
		Product chocoalte= new Product(106,"chocoalte",55);
		Product nuts = new Product(107,"nuts",100);
		Product butter= new Product(108,"butter",75);
		
		TreeSet<Product> products= new TreeSet();
		products.add(butter);
		products.add(pen);
		products.add(dress);
	    products.add(cookies);
		products.add(nuts);
	
	}

}
