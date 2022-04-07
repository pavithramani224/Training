package com.application;
import com.employee.*;

public class EmployeeService {
	public double calculateBonus(Employee object) {
		Employee abu = new Employee();
		double updateSalary = object.getEmployeeSalary();
		double bonus = (updateSalary+(0.33*updateSalary));
		return bonus;
	}
}
