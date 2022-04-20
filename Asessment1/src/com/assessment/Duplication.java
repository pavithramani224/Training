package com.assessment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Duplication {
	public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list)
    {
		ArrayList<T> newList = new ArrayList<T>();
		for (T element : list) {
			if (!newList.contains(element)) {
				newList.add(element);
				}
        }
   return newList;
    }
  public static void main(String args[])
    {
    	ArrayList<String>list = new ArrayList<>(Arrays.asList("apple", "orange", "apple", "pineapple", "orange", "banana"));
    	System.out.println(list);
    	System.out.println(Collections.frequency(list, "orange"));
        ArrayList<String>newList = removeDuplicates(list);
        Collections.sort(newList);
        System.out.println(newList);
    }
}
