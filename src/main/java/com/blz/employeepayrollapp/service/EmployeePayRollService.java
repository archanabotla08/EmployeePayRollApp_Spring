package com.blz.employeepayrollapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.blz.employeepayrollapp.dto.EmployeePayRollDTO;
import com.blz.employeepayrollapp.model.EmployeePayRollData;

@Service
public class EmployeePayRollService implements IEmployeePayRollService {

	private List<EmployeePayRollData> employeePayrollList = new ArrayList<>();
	
	@Override
	public List<EmployeePayRollData> getEmployeePayRollData() {
		List<EmployeePayRollData> empDataList = new ArrayList<>();
		return employeePayrollList;
	}

	@Override
	public EmployeePayRollData getEmployeePayRollDataById(int empId) {
		EmployeePayRollData empDataList = null;
		return employeePayrollList.get(empId - 1);
	}

	@Override
	public EmployeePayRollData createEmployeePayRollData(EmployeePayRollDTO employeePayRollDTO) {
		EmployeePayRollData empDataList = null;
		empDataList = new EmployeePayRollData(employeePayrollList.size() + 1,employeePayRollDTO);
		employeePayrollList.add(empDataList);
		return empDataList;
	}

	@Override
	public EmployeePayRollData updateEmployeePayRollData(int empId,EmployeePayRollDTO employeePayRollDTO) {
		EmployeePayRollData empDataList = this.getEmployeePayRollDataById(empId);
		empDataList.setName(employeePayRollDTO.name);
		empDataList.setSalary(employeePayRollDTO.salary);
		employeePayrollList.set(empId - 1, empDataList);
		return empDataList;
	}

	@Override
	public void deleteEmployeePayRollData(int empId) {
		employeePayrollList.remove(empId - 1);
	}


}
