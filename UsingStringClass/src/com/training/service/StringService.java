package com.training.service;

public class StringService {
	public void stringEquals(String str1, String str2) {
		System.out.println("Is value samem:"+str1.equals(str2));
		System.out.println("Are they pointing to the same location "+(str1!=str2));
	}
	public void stringObjectEquals() {
		String ram = new String("Ram");
		String ramudu=new String("Ram");
		System.out.println("Is values same:" +ram.equals(ramudu));
		System.out.println("Are they pointing to same location: "+(ram!=ramudu));
	}
	public void usingTrim(String name) {
	//public String void main(string name){
		System.out.println("Without Trim="+name.trim());
		//return name.trim();
	}
	public void lengthofString(String name) {
		System.out.println("String Length=" +name.length());
		System.out.println("without trim Stirng Length"+name.length());
		//String resp=usingTrim(name);
		System.out.println("String Length: " +name.trim().length());
	}
		public void usingSubStrin(String name) {
			System.out.println(name.substring(0,5));
	}
		public void usingCharcterAndIndexof(String name) {
			System.out.println("Index position of @:"+name.indexOf("@"));
			System.out.println("Character At position 3:" +name.charAt(3));
		}
		public void usingReplace(String str1,String str2) {
			System.out.println(str1.replace(".com",".org"));
			System.out.println(str2.replace('c','m'));
			
		}
		//String immutable 
		public void usingConcat(String str1, String str2) {
			System.out.println(str1.concat(str2));
			//mutable append adding at end
			StringBuilder builder = new StringBuilder(str1);
			builder.append(str2);
			System.out.println(builder.toString());
			
			
		}
		public void usingComapreTo(String str1,String str2) {
			System.out.println(str1.compareTo(str2));
		}
		public void usingStringFormat(String str1, double d) {
			String frmtString = String.format("%S",str1);
			System.out.println(frmtString);
			System.out.println(String.format("Mark %2f",d));
		}
		public void usingStringformat(int mark) {
			System.out.println(String.format("Octal %o",mark));
			System.out.println(String.format("Hexa deciamal %x", mark));
		}
		public void usingStringformated(int mark1,int mark2) {
			System.out.println(String.format("Octal %o",mark1));
			System.out.println(String.format("Hexa deciamal %x", mark2));
		}
		public void usingStringFormat(String str1, String str2) {
			System.out.println(String.format("%`1$s,%2$s",str1,str2));
			
		}
		public void usingStringFormatString(int value) {
			System.out.println(String.format("%+d",value));
		}
}

