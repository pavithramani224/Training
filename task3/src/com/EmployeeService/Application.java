package com.EmployeeService;
import com.EmployeeService.*;
public class Application {
	public double calculateBonus(EmployeeService object) {
		double updateSalary = object.getEmployeeSalary();
		double bonus = (updateSalary+(0.33*updateSalary));
		return bonus;
	}

}
