package com.EmployeeService;
import com.EmployeeService.*;
public class application1 {
	public static void main(String args[]) {
	EmployeeService abu= new EmployeeService(11,"abu",30000,9,7);
	System.out.println("Employee Id:"+abu.getEmployeeId());
	System.out.println("Employee Name:"+abu.getEmployeeName());
	System.out.println("Employee Salary:" +abu.getEmployeeSalary());
	System.out.println("Employee Shift Start:" +abu.getShiftStart());
	System.out.println("Employee Shift End:" +abu.getShiftEnd());
	System.out.println("Employee Updated salary:"+calculateBonus(abu));
	
}
}
	
