package com.training.model;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import com.training.model.Patient;
public class Appointment {
	private int tokenNumber;
	private HashMap<Doctor,Set<Patient>> lists;
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Appointment(int tokenNumber, HashMap<Doctor, Set<Patient>> lists) {
		super();
		this.tokenNumber = tokenNumber;
		this.lists = lists;
	}
	public int getTokenNumber() {
		return tokenNumber;
	}
	public void setTokenNumber(int tokenNumber) {
		this.tokenNumber = tokenNumber;
	}
	public HashMap<Doctor, Set<Patient>> getLists() {
		return lists;
	}
	public void setLists(HashMap<Doctor, Set<Patient>> lists) {
		this.lists = lists;
	}
	@Override
	public String toString() {
		return "Appointment [tokenNumber=" + tokenNumber + ", lists=" + lists + "]";
	}
	Set<Patient> getDetails(Doctor key){
		return this.lists.get(key);
	}
}
