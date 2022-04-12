package com.training;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.training.model.Student;

public class HashMapApplication1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ram = new Student(101,"ram",78);
		Student shyam = new Student(102,"shyam",88);
		Student magesh = new  Student(103, "magesh",98);
		Student kavi = new  Student(104, "kavi",48);
		//hashmap declaration
		HashMap<Integer,Student> map =  new HashMap<>();
		map.put(900, ram);
		map.put(902,shyam);
		map.put(903,magesh);
		map.put(904, kavi);
		//for each for key
		Set<Integer> keys = map.keySet();
		System.out.println("*****using keys******");
		for(Integer key:keys) {
			System.out.println(map.get(key));
		}
		//for each for values
		Collection<Student> list = map.values();
		System.out.println("*****using values*****");
		for(Student eachStudent:list) {
			System.out.println(eachStudent);
		}
		//for each for keys,values
		Set<Map.Entry<Integer,Student>> list2= map.entrySet();
		System.out.println("*****keys and values******");
		for(Map.Entry<Integer, Student> eachEntry:list2) {
			System.out.println(eachEntry.getKey());
			System.out.println(eachEntry.getValue());
		}
		
	}

}
