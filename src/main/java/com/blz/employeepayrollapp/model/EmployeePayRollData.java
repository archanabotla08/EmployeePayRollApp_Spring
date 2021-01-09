package com.blz.employeepayrollapp.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import com.blz.employeepayrollapp.dto.EmployeePayRollDTO;
import com.blz.employeepayrollapp.dto.ResponseDTO;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Entity
@Table(name="employeePayroll")
public class EmployeePayRollData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "employee_id")
	private int employeeId;
	@Column(name = "name")
	private String name;
	@Column(name = "salary")
	private long salary;
	@Column(name = "gender")
	public String gender;
	@Column(name = "startDate")
	@JsonFormat(pattern = "dd MMM yyyy")
	public LocalDate startDate;
	@Column(name = "note")
	public String note;
	@Column(name = "profilePicURL")
	public String profilePic;

	@ElementCollection
	@CollectionTable(name = "employeeDepartment",joinColumns = @JoinColumn(name = "id"))
	@Column(name = "department")
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
	public EmployeePayRollData(EmployeePayRollDTO employeePayRollDTO) {
	this.updateEmployeePayrollData(employeePayRollDTO);
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
