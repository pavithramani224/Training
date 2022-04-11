package com.training;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.training.model.Student;
import com.training.model.Student;

public class TreeSetApplication {

	public static void main(String[] args) {
		Student ram = new Student(101,"ram",78);
		Student shyam = new Student(102,"shyam",88);
		Student magesh = new Student(103, "magesh",98);
		Student chinamagesh = new Student(103, "magesh",98);
		//create hash set
		TreeSet<Student> set = new TreeSet<>();
		
		set.add(chinamagesh);
		set.add(magesh);
		set.add(ram);
		set.add(shyam);
		
		for (Student eachStudent:set) {
			System.out.println(eachStudent.getFirstName());
		}
		

	}

}
