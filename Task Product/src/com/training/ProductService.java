package com.training;

import java.util.*;
public class ProductService {
	private Set<Product> products;
	public boolean getTopThree(){
		Iterator<Product> itr = this.products.iterator();
		int count=0;
		return true;
	}
	public ProductService() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductService(Set<Product> products) {
		super();
		this.products = products;
	}
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
	

	
	
	
}
