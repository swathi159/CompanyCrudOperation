package com.opennidus.company.Exception;

public class UserDefinedException extends Exception {
	
	public UserDefinedException()
	{
		super("finanacial_year_from should be less than financial_year_to");
	}

}
