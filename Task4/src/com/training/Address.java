package com.training;

public class Address {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.doorNumber+","+this.streetName+","+this.villageName+","+this.District ;
	}
	private int doorNumber;
	private String streetName;
	private String villageName;
	private String District;
	public Address(int doorNumber, String streetName, String villageName, String district) {
		super();
		this.doorNumber = doorNumber;
		this.streetName = streetName;
		this.villageName = villageName;
		District = district;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getDoorNumber() {
		return doorNumber;
	}
	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getVillageName() {
		return villageName;
	}
	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		District = district;
	}
	

}
