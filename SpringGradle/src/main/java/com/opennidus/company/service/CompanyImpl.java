package com.opennidus.company.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opennidus.company.Exception.UserDefinedException;
import com.opennidus.company.model.Company;
import com.opennidus.company.repository.CompanyRepo;

@Service
public class CompanyImpl implements ICompany {

	@Autowired
	private CompanyRepo companyRepo;

	@Override
	public Company saveCompany(Company company) {

		company.setCurrency_type("rs");
		Company company1 = companyRepo.save(company);

		return company1;

	}

	@Override
	public Long deleteCompany(Long id) {
		companyRepo.deleteById(id);
		return id;
	}

	@Override
	public Company updateCompany(Company company) {
		Company company1 = companyRepo.save(company);
		return company1;
	}

	@Override
	public Optional<Company> getByIdCompany(Long id) {
		Optional<Company> company = companyRepo.findById(id);
		return company;
	}

}
