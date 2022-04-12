package com.training.model;

import java.util.*;

public class Application1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient raju = new Patient(101,"raju","perambalur",9884380211l);
		Patient anju = new Patient(102,"anju","trichy",98843845611l);
		Patient anu= new Patient(103,"anu","kovai",9884390211l);
		Patient abi = new Patient(104,"abi","chennai",9884389011l);
		Set<Patient> patient1=new HashSet();
		Set<Patient> patient2=new HashSet();
		patient1.add(raju);
		patient1.add(anju);
		patient2.add(anu);
		patient2.add(abi);
		HashMap<Doctor,Set<Patient>>list=new HashMap<>();
		
		Doctor doctor1 = new Doctor(1,"pavi","neuro",patient1);
		Doctor doctor2= new Doctor(1,"pavi","neuro",patient2);
		
		list.put(doctor1, patient1);
		list.put(doctor2,patient2);
		Appointment appointment=new Appointment(12,list);
		System.out.println(appointment.getDetails(doctor1));
		
		
	
	}

}
