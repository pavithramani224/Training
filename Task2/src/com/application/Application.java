package com.application;

import com.customer.*;
import com.employee.*;
import com.hotel.*;
public class Application {
	public static void main (String args[]) {
		Customer pavi = new Customer(1,"pavi",98841,"perambalur");
		Employee abu= new Employee(11,"abu",30000,9,7);
		Hotel Ruthra = new Hotel("Ruthra","Chennai","multi","8778301020");
		System.out.println("Customer Id:"+pavi.getCustomerId());
		System.out.println("Customer Name:"+pavi.getCustomerName());
		System.out.println("Customer number:"+pavi.getCustomerNumber());
		System.out.println("Customer place:" +pavi.getCustomerAddress());
		System.out.println("Employee Id:"+abu.getEmployeeId());
		System.out.println("Employee Name:"+abu.getEmployeeName());
		System.out.println("Employee Salary:" +abu.getEmployeeSalary());
		System.out.println("Employee Shift Start:" +abu.getShiftStart());
		System.out.println("Employee Shift End:" +abu.getShiftEnd());
		System.out.println("Hotel Name:" +Ruthra.getHotelName());
		System.out.println("Hotel Place:" +Ruthra.getHotelPlace());
		System.out.println("Hotel Type:" +Ruthra.getHotelType());
		System.out.println("Hotel Info:" +Ruthra.getHotelInfo());
		EmployeeService anu = new EmployeeService();
		System.out.println(anu.calculateBonus(abu));
	}

}
