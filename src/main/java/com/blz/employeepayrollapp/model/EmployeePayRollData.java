package com.blz.employeepayrollapp.model;

import java.time.LocalDate;
import java.util.List;

import com.blz.employeepayrollapp.dto.EmployeePayRollDTO;
import com.blz.employeepayrollapp.dto.ResponseDTO;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class EmployeePayRollData {
	
	private int employeeId;
	private String name;
	private long salary;

	public String gender;

	@JsonFormat(pattern = "dd MMM yyyy")
	public LocalDate startDate;

	public String note;

	public String profilePic;

	public List<String> departments;

	public void updateEmployeePayrollData(EmployeePayRollDTO employeePayrollDTO) {
		this.name = employeePayrollDTO.name;
		this.salary = employeePayrollDTO.salary;
		this.gender = employeePayrollDTO.gender;
		this.startDate = employeePayrollDTO.startDate;
		this.note = employeePayrollDTO.note;
		this.profilePic = employeePayrollDTO.profilePic;
		this.departments = employeePayrollDTO.departments;
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
