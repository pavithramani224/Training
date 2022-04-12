package com.training;
import java.util.*;

import com.training.model.Student;
public class HashMapApplication {

	public static void main(String[] args) {
		
		Student ram = new Student(101,"ram",78);
		Student shyam = new Student(102,"shyam",88);
		Student magesh = new  Student(103, "magesh",98);
		Student kavi = new  Student(104, "kavi",48);
		//hashmap declaration
		HashMap<Integer,Student> map =  new HashMap<>();
		//map.put(900, ram);
		//map.put(902,shyam);
		System.out.println(map.put(900, ram));//output is null
		System.out.println(map.put(902, shyam));
		//System.out.println(map.get(902));//output is student details
		//System.out.println(map.get(902));//output student details
		Student added=map.put(902, magesh);
		if(added!=null) {
			map.put(904, added);
		}
			System.out.println(map.get(902));
			System.out.println(map.get(904));
		}
	

}
