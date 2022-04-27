package com.example.ifaces;

import java.util.List;
import java.util.Optional;

import com.example.entity.Member;

public interface CrudRepositroy<T> {
	public int add(T obj);
	public List<T>findAll();
	public int remove(int id);
	public Optional<Member> findById(int id);
	public int update(int Id,T obj);
		
	}
