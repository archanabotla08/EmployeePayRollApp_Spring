package com.blz.employeepayrollapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blz.employeepayrollapp.model.EmployeePayRollData;

@Repository
public interface EmployeePayRollRepository extends JpaRepository<EmployeePayRollData, Integer>{

}
