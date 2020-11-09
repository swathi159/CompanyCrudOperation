package com.opennidus.company.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.beans.factory.annotation.Value;

@Entity
@Table(name = "on_company")
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long company_id;
	@Enumerated(EnumType.STRING)
	private BusinessType business_type;
	@Enumerated(EnumType.STRING)
	private NatureOfBusiness nature_of_business;
	private String address;
	private String person_name;
	private Long contact_no;
	private String email;
	private Long whatsapp;
	private String website;
	@Temporal(TemporalType.DATE)
	private Date financial_year_from;
	@Temporal(TemporalType.DATE)
	private Date financial_year_to;
	@Temporal(TemporalType.DATE)
	private Date business_start_date;

	@Value("${currency.type}")
	private String currency_type;

	private Float currency_value;
	private Boolean status;

	public Long getCompany_id() {
		return company_id;
	}

	public void setCompany_id(Long company_id) {
		this.company_id = company_id;
	}

	public BusinessType getBusiness_type() {
		return business_type;
	}

	public void setBusiness_type(BusinessType business_type) {
		this.business_type = business_type;
	}

	public NatureOfBusiness getNature_of_business() {
		return nature_of_business;
	}

	public void setNature_of_business(NatureOfBusiness nature_of_business) {
		this.nature_of_business = nature_of_business;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPerson_name() {
		return person_name;
	}

	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}

	public Long getContact_no() {
		return contact_no;
	}

	public void setContact_no(Long contact_no) {
		this.contact_no = contact_no;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getWhatsapp() {
		return whatsapp;
	}

	public void setWhatsapp(Long whatsapp) {
		this.whatsapp = whatsapp;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Date getFinancial_year_from() {
		return financial_year_from;
	}

	public void setFinancial_year_from(Date financial_year_from) {
		this.financial_year_from = financial_year_from;
	}

	public Date getFinancial_year_to() {
		return financial_year_to;
	}

	public void setFinancial_year_to(Date financial_year_to) {
		this.financial_year_to = financial_year_to;
	}

	public Date getBusiness_start_date() {
		return business_start_date;
	}

	public void setBusiness_start_date(Date business_start_date) {
		this.business_start_date = business_start_date;
	}

	public String getCurrency_type() {
		return currency_type;
	}

	public void setCurrency_type(String currency_type) {
		this.currency_type = currency_type;
	}

	public Float getCurrency_value() {
		return currency_value;
	}

	public void setCurrency_value(Float currency_value) {
		this.currency_value = currency_value;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

}
