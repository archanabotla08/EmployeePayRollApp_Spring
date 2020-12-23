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

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayRollController {
	//http://localhost:8080/employeepayrollservice/get
	@RequestMapping("/get")
	public ResponseEntity<String> getEmployeePayRollData() {
		return new ResponseEntity<String>("Get Call Success !!!",HttpStatus.OK);
	}
	//http://localhost:8080/employeepayrollservice/get/1
	@RequestMapping("/get/{empId}")
	public ResponseEntity<String> getEmployeePayRollData(@PathVariable("empId") int empId){
		return new ResponseEntity<String>("Get Call Success for id: "+empId,HttpStatus.OK);
	}

	//http://localhost:8080/employeepayrollservice/create (body : {})
	@PostMapping("/create")
	public ResponseEntity<String> addEmployeePayrollData(@RequestBody EmployeePayRollDTO employeePayrollDTO){
		return new ResponseEntity<String>("Created Employee payroll data for:"+employeePayrollDTO,HttpStatus.OK);
	}
	
	//http://localhost:8080/employeepayrollservice/update (body: {})
	@PutMapping("/update")
	public ResponseEntity<String> updateEmployeePayrollData(@RequestBody EmployeePayRollDTO employeePayrollDTO){
		return new ResponseEntity<String>("Updated Employee payroll Data for: "+employeePayrollDTO,HttpStatus.OK);
	}
	//http://localhost:8080/employeepayrollservice/delete/1
	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<String> deleteEmployeePayrollData(@PathVariable("empId") int empId){
		return new ResponseEntity<String>("Delete Call Success for id: "+empId,HttpStatus.OK);
	}
	
	

}
