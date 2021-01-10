package com.blz.employeepayrollapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blz.employeepayrollapp.dto.EmployeePayRollDTO;
import com.blz.employeepayrollapp.exception.EmployeePayRollException;
import com.blz.employeepayrollapp.model.EmployeePayRollData;
import com.blz.employeepayrollapp.repository.EmployeePayRollRepository;

@Service
public class EmployeePayRollService implements IEmployeePayRollService {

	@Autowired
	private EmployeePayRollRepository employeePayRollRepository;
	
	private List<EmployeePayRollData> employeePayrollList = new ArrayList<>();
	
	@Override
	public List<EmployeePayRollData> getEmployeePayRollData() {
		return employeePayRollRepository.findAll();
	}

	@Override
	public EmployeePayRollData getEmployeePayRollDataById(int empId) throws EmployeePayRollException {
		return employeePayRollRepository.findById(empId).orElseThrow(
				() -> new EmployeePayRollException("Employee with employee id: " + empId + " does not exists."));
	}

	@Override
	public EmployeePayRollData createEmployeePayRollData(EmployeePayRollDTO employeePayRollDTO) {
		EmployeePayRollData empDataList = null;
		empDataList = new EmployeePayRollData(employeePayRollDTO);
		return employeePayRollRepository.save(empDataList);	
	}

	@Override
	public EmployeePayRollData updateEmployeePayRollData(int empId,EmployeePayRollDTO employeePayRollDTO) throws EmployeePayRollException {
		EmployeePayRollData empDataList = this.getEmployeePayRollDataById(empId);
		empDataList.updateEmployeePayrollData(employeePayRollDTO);
		return employeePayRollRepository.save(empDataList);
	}

	@Override
	public void deleteEmployeePayRollData(int empId) throws EmployeePayRollException {
		EmployeePayRollData empData = this.getEmployeePayRollDataById(empId);
		employeePayRollRepository.delete(empData);
	}


}
