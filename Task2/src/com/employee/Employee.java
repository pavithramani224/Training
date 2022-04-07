package com.employee;

public class Employee {
	private int employeeId;
	private String employeeName;
	private int employeeSalary;
	private double shiftStart;
	private double shiftEnd;
	public Employee(int employeeId, String employeeName, int employeeSalary, double shiftStart, double shiftEnd) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.shiftStart = shiftStart;
		this.shiftEnd = shiftEnd;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public double getShiftStart() {
		return shiftStart;
	}
	public void setShiftStart(double shiftStart) {
		this.shiftStart = shiftStart;
	}
	public double getShiftEnd() {
		return shiftEnd;
	}
	public void setShiftEnd(double shiftEnd) {
		this.shiftEnd = shiftEnd;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
