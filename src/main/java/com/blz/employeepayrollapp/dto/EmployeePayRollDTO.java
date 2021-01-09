package com.blz.employeepayrollapp.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class EmployeePayRollDTO {

	@Pattern(regexp="^[A-Z]{1}[a-zA-Z\\s]{2,}$", message="Invalid Employee Name")
	@NotEmpty(message="Employee Name Should not be null")
	public String name;
	@Min(value = 5000, message="Min Employee Wage should be more than 500 ")
	public long salary;
	
	public EmployeePayRollDTO(String name, long salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeePayRollDTO [empName=" + name + ", salary=" + salary + "]";
	}
}
