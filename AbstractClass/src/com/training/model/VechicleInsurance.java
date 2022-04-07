package com.training.model;
public class VechicleInsurance extends Insurance {
	private String vechicleName;
	private int yearOfManufacture;
	
	public VechicleInsurance(int policyNumber, String policyHolderName) {
		super(policyNumber, policyHolderName);
		// TODO Auto-generated constructor stub
	}
	public VechicleInsurance(int policyNumber, String policyHolderName, String vechicleName,int yearOfManufacture) {
		super(policyNumber,policyHolderName);
		this.vechicleName = vechicleName;
		this.yearOfManufacture = yearOfManufacture;
	}
    
	public String getVechicleName() {
		return vechicleName;
	}
    public void setVechicleName(String vechicleName) {
		this.vechicleName = vechicleName;
	}
    public int getYearOfManufacture() {
		return yearOfManufacture;
	}
    public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}
    public VechicleInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}

    @Override
	public double calculatePremimum() {
		
		double premium =1000;
		if(yearOfManufacture<2020 && vechicleName.equals ("car")) {
			premium = 2000;
			
		}
		return premium;
	}
	
}
