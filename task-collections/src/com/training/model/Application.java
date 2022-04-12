package com.training.model;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient raju = new Patient(101,"raju","perambalur",9884380211l);
		Patient anju = new Patient(102,"anju","trichy",98843845611l);
		Patient anu= new Patient(103,"anu","kovai",9884390211l);
		Patient abi = new Patient(104,"abi","chennai",9884389011l);
		HashSet<Patient> patients = new HashSet<>();
		
		patients.add(abi);
		patients.add(anu);
		patients.add(anju);
		patients.add(raju);
		Doctor doctor = new Doctor(1,"pavithra","heart",patients);
		
		
		for(Patient eachpatient:doctor.getPatients()) {
			System.out.println(eachpatient);
		}
		
		
	}

}
