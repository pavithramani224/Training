package com.training;

import com.training.model.Student;
import java.util.*;
public class HashSetApplication {

	public static void main(String[] args) {
		Student ram = new Student(101,"ram",78);
		Student shyam = new Student(102,"Shyam",88);
		Student magesh = new Student(103, "magesh",98);
		Student chinamagesh = new Student(103, "magesh",98);
		//create hash set
		HashSet<Student> set = new HashSet<>();
		
		set.add(chinamagesh);
		set.add(magesh);
		set.add(ram);
		set.add(shyam);
		System.out.println(set);
		System.out.println(set.size());
		
	}
}
