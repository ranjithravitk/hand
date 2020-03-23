package com.modal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="country")
public class Country {

	@Id
	private String country_code;
	private String country_name;
	
	public Country() {
		super();
	}

	public Country(String country_code, String country_name) {
		super();
		this.country_code = country_code;
		this.country_name = country_name;
	}

	public String getCountry_code() {
		return country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public String getCountry_name() {
		return country_name;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}

	@Override
	public String toString() {
		return "Country [co_code=" + country_code + ", co_name=" + country_name + "]";
	}
}
