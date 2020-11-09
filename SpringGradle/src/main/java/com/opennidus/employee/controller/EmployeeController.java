package com.opennidus.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.opennidus.employee.model.Employee;
import com.opennidus.employee.service.EmployeeImpl;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeImpl empService;
	
	
	@RequestMapping(value = "/role", method = RequestMethod.POST)
	public ResponseEntity<?> saveEmployee(@RequestBody Employee emp) {
		Employee employee = empService.saveEmployee(emp);
		return new ResponseEntity<>(employee, HttpStatus.OK);
	}

}
