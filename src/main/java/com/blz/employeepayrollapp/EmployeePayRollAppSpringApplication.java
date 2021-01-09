package com.blz.employeepayrollapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class EmployeePayRollAppSpringApplication {

	private static final org.slf4j.Logger log = 
		    org.slf4j.LoggerFactory.getLogger(EmployeePayRollAppSpringApplication.class);
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EmployeePayRollAppSpringApplication.class, args);
		log.info("Address Book Started In App");
	}

}
