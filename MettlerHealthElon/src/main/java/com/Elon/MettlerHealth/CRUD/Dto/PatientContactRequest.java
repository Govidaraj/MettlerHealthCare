package com.Elon.MettlerHealth.CRUD.Dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;


public class PatientContactRequest {
	private int id;
	@NotBlank(message = "address shouldn't be null")
	private String address;
	@NotBlank(message = "address lane2 shouldn't be null")
	private String addressLine2;
	@NotBlank(message = "city shouldn't be null")
    private String city;
	@NotBlank(message = "state shouldn't be null")
    private String state;
	@NotBlank(message = "country shouldn't be null")
    private String country;
	 @NotNull(message = "postal code shouldn't be null")
    private int postalCode;
	 @NotNull
	@Pattern(regexp = "^\\d{10}$",message = "invalid mobile number entered ")
	private String mobileNo;
	@Email(message = "invalid email address")
	private String email;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
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
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
