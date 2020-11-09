package com.opennidus.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.opennidus.company.Exception.UserDefinedException;
import com.opennidus.company.model.Company;
import com.opennidus.company.service.CompanyImpl;
import com.opennidus.employee.model.Employee;

@Controller
public class CompanyController {

	@Autowired
	private CompanyImpl companyimpl;

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ResponseEntity<?> saveCompany(@RequestBody Company company) throws UserDefinedException {
		Company company1 = companyimpl.saveCompany(company);
		return new ResponseEntity<>(company1, HttpStatus.OK);
	}

	@RequestMapping(value = "/delete/{company_id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteCompany(@PathVariable Long company_id) {
		companyimpl.deleteCompany(company_id);
		return new ResponseEntity<>(company_id, HttpStatus.OK);
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public ResponseEntity<?> updateCompany(@RequestBody Company company) {
		Company company1 = companyimpl.updateCompany(company);
		return new ResponseEntity<>(company1, HttpStatus.OK);
	}

	@RequestMapping(value = "/findById/{company_id}", method = RequestMethod.GET)
	public ResponseEntity<?> findByIdCompany(@PathVariable Long company_id) {
		Company company1 = companyimpl.getByIdCompany(company_id);
		return new ResponseEntity<>(company1, HttpStatus.OK);
	}
}
