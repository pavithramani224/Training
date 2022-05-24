package com.example.demo.ifaces;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Product;

public interface CrudRepository<T>{
	public int add(Product T);
	public List<T> findAll();
	public T findById(int id);
	public int update(Product t);
	public int remove(int id);
	
	
	

}
