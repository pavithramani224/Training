package com.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
	public static void main(String args[]) {
		List<String> names = new ArrayList<>();
		names.add("ammu");
		names.add("zana");
		names.add("kavi");
		names.add("sush");
		names.add("punnya");
		System.out.println(names);
		Collections.sort(names);
		System.out.println("########");
		System.out.println(names);
		
		
	}

}
