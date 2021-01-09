package com.blz.employeepayrollapp.dto;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonFormat;

public class EmployeePayRollDTO {

	@Pattern(regexp="^[A-Z]{1}[a-zA-Z\\s]{2,}$", message="Invalid Employee Name")
	@NotEmpty(message="Employee Name Should not be null")
	public String name;
	@Min(value = 5000, message="Min Employee Wage should be more than 500 ")
	public long salary;
	
	@Pattern(regexp = "Male|Female", message = "Gender should to be Male or Female")
	public String gender;

	@JsonFormat(pattern = "dd MMM yyyy")
	@NotNull(message = "start date should not be Empty")
	@PastOrPresent(message = "startDate should be past or present date")
	public LocalDate startDate;

	@NotBlank(message = "Note cannot be Empty")
	public String note;
	
	@NotBlank(message = "ProfilePic cannot be Empty")
	public String profilePic;
	
	@NotNull(message = "Department should not be Empty")
	public List<String> departments;

}
