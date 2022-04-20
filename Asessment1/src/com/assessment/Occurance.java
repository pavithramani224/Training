package com.assessment;
import java.util.*;
public class Occurance {
	public static void main(String[] args)  {

      int A[] = { 1, 5, 2, 1, 2, 6, 7, 1};

      int max = Integer.MIN_VALUE;
      for (int i = 0; i < A.length; i++) {
          if (A[i] > max)
              max = A[i];
      }

      int B[] = new int[max + 1];
      for (int i = 0; i < A.length; i++) {

          B[A[i]]++;
      }
      System.out.println("item = Occurence");
      for (int i = 0; i <= max; i++) {
          
          if (B[i] > 0){
              System.out.println(i + " = " + B[i]);
          }
          
      }
  }
	}

