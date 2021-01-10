package com.blz.employeepayrollapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blz.employeepayrollapp.dto.EmployeePayRollDTO;
import com.blz.employeepayrollapp.dto.ResponseDTO;
import com.blz.employeepayrollapp.exception.EmployeePayRollException;
import com.blz.employeepayrollapp.model.EmployeePayRollData;
import com.blz.employeepayrollapp.service.IEmployeePayRollService;
import java.util.List;

@RestController
@RequestMapping("/employeepayrollservice")
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class EmployeePayRollController {
	
	@Autowired
	private IEmployeePayRollService employeePayRollService;
	
	//http://localhost:8080/employeepayrollservice/get
	@RequestMapping(value={"","/","/get"})
	public ResponseEntity<ResponseDTO> getEmployeePayRollData() {
		List<EmployeePayRollData> empDataList = null;		
		empDataList = employeePayRollService.getEmployeePayRollData();
		ResponseDTO resDTO = new ResponseDTO("Get Call Success!!",empDataList);
		return new ResponseEntity<ResponseDTO>(resDTO,HttpStatus.OK);
	}
	//http://localhost:8080/employeepayrollservice/get/1
	@RequestMapping("/get/{empId}")
	public ResponseEntity<ResponseDTO> getEmployeePayRollData(@PathVariable("empId") int empId) throws EmployeePayRollException{
			EmployeePayRollData empDataList = null;
			empDataList = employeePayRollService.getEmployeePayRollDataById(empId);
			ResponseDTO resDTO = new ResponseDTO("Get Call for id Successful:", empDataList);
			return new ResponseEntity<ResponseDTO>(resDTO, HttpStatus.OK);
	}

	//http://localhost:8080/employeepayrollservice/create (body : {})
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addEmployeePayrollData(@RequestBody EmployeePayRollDTO employeePayrollDTO){
		EmployeePayRollData empDataList = null;
		empDataList = employeePayRollService.createEmployeePayRollData(employeePayrollDTO);
		ResponseDTO resDTO = new ResponseDTO("Created Employee Payroll Data Successfully:", empDataList);
		return new ResponseEntity<ResponseDTO>(resDTO, HttpStatus.OK);
	}
	
	//http://localhost:8080/employeepayrollservice/update (body: {})
	@PutMapping("/update/{empId}")
	public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@PathVariable("empId") int empId,@RequestBody EmployeePayRollDTO employeePayrollDTO) throws EmployeePayRollException{
		EmployeePayRollData empDataList = null;
		empDataList = employeePayRollService.updateEmployeePayRollData(empId,employeePayrollDTO);
		ResponseDTO resDTO = new ResponseDTO("Updated Employee Payroll Data Successfully: ", empDataList);
		return new ResponseEntity<ResponseDTO>(resDTO, HttpStatus.OK);
	}
	//http://localhost:8080/employeepayrollservice/delete/1
	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("empId") int empId) throws EmployeePayRollException{
		employeePayRollService.deleteEmployeePayRollData(empId);
		ResponseDTO resDTO = new ResponseDTO("Deleted Successfully", "Deleted id: " + empId);
		return new ResponseEntity<ResponseDTO>(resDTO, HttpStatus.OK);
	}
	
}
