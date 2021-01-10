package com.blz.employeepayrollapp.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.blz.employeepayrollapp.dto.EmployeePayRollDTO;
import com.blz.employeepayrollapp.exception.EmployeePayRollException;
import com.blz.employeepayrollapp.model.EmployeePayRollData;

@Component("IEmployeePayRollService")
public interface IEmployeePayRollService {
	
	List<EmployeePayRollData> getEmployeePayRollData();
	
	EmployeePayRollData getEmployeePayRollDataById(int empId) throws EmployeePayRollException;
	
	EmployeePayRollData createEmployeePayRollData(EmployeePayRollDTO employeePayRollDTO);
	
	EmployeePayRollData updateEmployeePayRollData(int empId,EmployeePayRollDTO employeePayRollDTO) throws EmployeePayRollException;
	
	void deleteEmployeePayRollData(int empId) throws EmployeePayRollException;
	
}
