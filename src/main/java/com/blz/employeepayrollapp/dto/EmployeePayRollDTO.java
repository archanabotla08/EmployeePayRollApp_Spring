package com.blz.employeepayrollapp.dto;

public class EmployeePayRollDTO {

	public String name;
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
