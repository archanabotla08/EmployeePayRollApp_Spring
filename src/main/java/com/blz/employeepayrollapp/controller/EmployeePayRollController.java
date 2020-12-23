package com.blz.employeepayrollapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blz.employeepayrollapp.dto.EmployeePayRollDTO;
import com.blz.employeepayrollapp.dto.ResponseDTO;
import com.blz.employeepayrollapp.model.EmployeePayRollData;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayRollController {
	
	//http://localhost:8080/employeepayrollservice/get
	@RequestMapping(value={"","/","/get"})
	public ResponseEntity<ResponseDTO> getEmployeePayRollData() {
		EmployeePayRollData empData = null;
		empData = new EmployeePayRollData(1,new EmployeePayRollDTO("Priti",90000));
		ResponseDTO resDTO = new ResponseDTO("Get Call Success!!",empData);
		return new ResponseEntity<ResponseDTO>(resDTO,HttpStatus.OK);
	}
	//http://localhost:8080/employeepayrollservice/get/1
	@RequestMapping("/get/{empId}")
	public ResponseEntity<ResponseDTO> getEmployeePayRollData(@PathVariable("empId") int empId){
		EmployeePayRollData empData = null;
			empData = new EmployeePayRollData(2, new EmployeePayRollDTO("saneeya", 400000));
			ResponseDTO resDTO = new ResponseDTO("Get Call for id Successful:", empData);
			return new ResponseEntity<ResponseDTO>(resDTO, HttpStatus.OK);
	}

	//http://localhost:8080/employeepayrollservice/create (body : {})
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addEmployeePayrollData(@RequestBody EmployeePayRollDTO employeePayrollDTO){
		EmployeePayRollData empData = null;
		empData = new EmployeePayRollData(3, employeePayrollDTO);
		ResponseDTO resDTO = new ResponseDTO("Created Employee Payroll Data Successfully:", empData);
		return new ResponseEntity<ResponseDTO>(resDTO, HttpStatus.OK);
	}
	
	//http://localhost:8080/employeepayrollservice/update (body: {})
	@PutMapping("/update")
	public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@RequestBody EmployeePayRollDTO employeePayrollDTO){
		EmployeePayRollData empData = null;
		empData = new EmployeePayRollData(3, employeePayrollDTO);
		ResponseDTO resDTO = new ResponseDTO("Updated Employee Payroll Data Successfully: ", empData);
		return new ResponseEntity<ResponseDTO>(resDTO, HttpStatus.OK);
	}
	//http://localhost:8080/employeepayrollservice/delete/1
	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("empId") int empId){
		ResponseDTO resDTO = new ResponseDTO("Deleted Successfully", "Deleted id: " + empId);
		return new ResponseEntity<ResponseDTO>(resDTO, HttpStatus.OK);
	}
	
	

}
