package com.training.ifaces;

import java.util.List;
import java.util.Optional;

import com.training.entity.LoanApplication;

public interface CrudRepository<T> {
	public int add(T obj);
	public List<T> findAll();
	public int remove(int id);
	public Optional<LoanApplication> findById(int id);
	public int update(int id, T customer);

}
