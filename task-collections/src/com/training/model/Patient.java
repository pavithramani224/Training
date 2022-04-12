package com.training.model;
public class Patient {
	private int patientId;
	private String patientName;
	private String Location;
	private long mobileumber;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(int patientId, String patientName, String location, long mobileumber) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		Location = location;
		this.mobileumber = mobileumber;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public long getMobileumber() {
		return mobileumber;
	}
	public void setMobileumber(long mobileumber) {
		this.mobileumber = mobileumber;
	}
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", Location=" + Location
				+ ", mobileumber=" + mobileumber + "]";
	}
	

}
