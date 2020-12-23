package com.blz.employeepayrollapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.blz.employeepayrollapp.dto.EmployeePayRollDTO;
import com.blz.employeepayrollapp.model.EmployeePayRollData;

@Service
public class EmployeePayRollService implements IEmployeePayRollService {

	@Override
	public List<EmployeePayRollData> getEmployeePayRollData() {
		List<EmployeePayRollData> empDataList = new ArrayList<>();
		empDataList.add(new EmployeePayRollData(1,new EmployeePayRollDTO("akashata", 90000)));
		return empDataList;
	}

	@Override
	public EmployeePayRollData getEmployeePayRollDataById(int empId) {
		EmployeePayRollData empDataList = null;
		empDataList = new EmployeePayRollData(2, new EmployeePayRollDTO("shivani", 400000));
		return empDataList;

	}

	@Override
	public EmployeePayRollData createEmployeePayRollData(EmployeePayRollDTO employeePayRollDTO) {
		EmployeePayRollData empDataList = null;
		empDataList = new EmployeePayRollData(3, employeePayRollDTO);
		return empDataList;
	}

	@Override
	public EmployeePayRollData updateEmployeePayRollData(EmployeePayRollDTO employeePayRollDTO) {
		EmployeePayRollData empDataList = null;
		empDataList = new EmployeePayRollData(3, employeePayRollDTO);
		return empDataList;
	}

	@Override
	public void deleteEmployeePayRollData(int empId) {
		
	}
	

}
