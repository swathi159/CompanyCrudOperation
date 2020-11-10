package com.opennidus.company.service;

import java.util.Optional;

import com.opennidus.company.Exception.UserDefinedException;
import com.opennidus.company.model.Company;

public interface ICompany {

	Company saveCompany(Company company);

	Long deleteCompany(Long id);

	Company updateCompany(Company company);

	Optional<Company> getByIdCompany(Long id);

}
