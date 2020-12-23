package com.blz.employeepayrollapp.model;

import com.blz.employeepayrollapp.dto.EmployeePayRollDTO;
import com.blz.employeepayrollapp.dto.ResponseDTO;

public class EmployeePayRollData {
	private int employeeId;
	private String name;
	private long salary;
	
	public EmployeePayRollData() {
		
	}

	public EmployeePayRollData(int employeeId, String name, long salary) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
	}

	public EmployeePayRollData(int employeeId, EmployeePayRollDTO employeePayRollDTO) {
		super();
		this.employeeId = employeeId;
		this.name = employeePayRollDTO.name;
		this.salary = employeePayRollDTO.salary;
	}
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}
	
}
