package com.Elon.MettlerHealth.CRUD.Model;

import org.springframework.data.mongodb.core.mapping.Document;

import com.Elon.MettlerHealth.CRUD.Dto.PatientContactRequest;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Document(collection="PatientContact")
public class PatientContact {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
    private String address;
	private String addressLine2;
    private String city;
    private String state;
    private String country;
    private int postalCode;
    private String mobileNo;
    private String email;
	
    
    public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public PatientContact(int id,String address, String addressLine2,String city,String state,String country
			,int postalCode,String mobileNo,String email) {
		super();
		this.id =id;
	    this.address=address;
		this.addressLine2= addressLine2;
	    this.city=city;
	    this.state=state;
	    this.country= country;
	    this.postalCode= postalCode;
	    this.mobileNo= mobileNo;
	    this.email= email;
	}
	public static PatientContact build(int id,String address, String addressLine2,String city,String state,String country
			,int postalCode,String mobileNo,String email) {
		return new PatientContact(id,address,addressLine2,city,state,country,postalCode,mobileNo,email);
	}
	public void update(PatientContactRequest patientContactRequest) {
		this.setAddress(patientContactRequest.getAddress());
	    this.setAddressLine2(patientContactRequest.getAddressLine2());
	    this.setCity(patientContactRequest.getCity());
	    this.setState(patientContactRequest.getState());
	    this.setId(patientContactRequest.getId());
	    this.setPostalCode(patientContactRequest.getPostalCode());
	    this.setCountry(patientContactRequest.getCountry());
	    this.setMobileNo(patientContactRequest.getMobileNo());
	    this.setEmail(patientContactRequest.getEmail());
	}

}
