package com.blz.employeepayrollapp.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.blz.employeepayrollapp.dto.EmployeePayRollDTO;
import com.blz.employeepayrollapp.model.EmployeePayRollData;

@Component("IEmployeePayRollService")
public interface IEmployeePayRollService {
	
	List<EmployeePayRollData> getEmployeePayRollData();
	
	EmployeePayRollData getEmployeePayRollDataById(int empId);
	
	EmployeePayRollData createEmployeePayRollData(EmployeePayRollDTO employeePayRollDTO);
	
	EmployeePayRollData updateEmployeePayRollData(int empId,EmployeePayRollDTO employeePayRollDTO);
	
	void deleteEmployeePayRollData(int empId);
	
}
