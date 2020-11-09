package com.opennidus.employee.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.opennidus.employee.model.Employee;

public interface IEmployee {
	
 Employee saveEmployee(Employee emp);
	 

}