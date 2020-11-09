package com.opennidus.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opennidus.employee.model.Employee;
import com.opennidus.employee.repository.EmployeeRepo;


@Service
public class EmployeeImpl implements IEmployee{

	@Autowired
	private EmployeeRepo emprepo;
	
	@Override
	public Employee saveEmployee(Employee emp) {
		 emp = emprepo.save(emp);
		return emp;
		
	}

	

	



	

}


