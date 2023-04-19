package com.Elon.MettlerHealth.CRUD.Dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class PatientGuardianRequest {

	private Integer id;
	@NotBlank(message = "title shouldn't be null")
	private String name;
	@NotBlank(message = "title shouldn't be null")
	private String relationship;
	@NotBlank(message = "title shouldn't be null")
	private String gender;
	@NotBlank(message = "title shouldn't be null")
	private String address;
	@NotBlank(message = "title shouldn't be null")
	private String city;
	@NotBlank(message = "title shouldn't be null")
	private String state;
	@NotBlank(message = "title shouldn't be null")
	private String country;
	@Pattern(regexp = "^\\d{10}$", message = "invalid mobile number entered ")
	private String phoneNo;
	@Email(message = "invalid email address")
	private String email;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
