package com.training.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.training.model.Student;

public class StudentService {
	private List<Student> studentList=new ArrayList();


	public StudentService() {
		super();
		// TODO Auto-generated constructor stub
		studentList=new ArrayList();
		
	}
	public boolean add(Student student){
		return studentList.add(student);
	}
	
	
	public List<Student> getAll(){
		return this.studentList;
		
	}
	public Optional<Student> findById(int id){
		return this.studentList
				.stream()
				.filter(e->e.getRollNumber()==id)
				.findFirst();
		
	}
	public boolean remove(int id) {
		return this.studentList.removeIf(e->e.getRollNumber()==id);
		
	}
	public Student update(Student oldvalue,Student newvalue) {
		int idxpos = this.studentList.indexOf(oldvalue);
		return this.studentList.set(idxpos, newvalue);
	}

}
