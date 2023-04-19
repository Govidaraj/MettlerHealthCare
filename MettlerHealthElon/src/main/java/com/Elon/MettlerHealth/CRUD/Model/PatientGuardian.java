package com.Elon.MettlerHealth.CRUD.Model;

import org.springframework.data.mongodb.core.mapping.Document;

import com.Elon.MettlerHealth.CRUD.Dto.PatientGuardianRequest;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Document(collection="PatientGuardian")
public class PatientGuardian {
	
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private Integer id;
    private String name;
	private String relationship;
    private String gender;
    private String address;
    private String city;
    private String state;
    private String country;
    private String phoneNo;
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
	public PatientGuardian(Integer id,String name,String relationship,String gender,String address,String city,String state
				,String country,String phoneNo,String email) {
		super();
		this.id=id;
		this.name=name;
		this.relationship=relationship;
		this.gender=gender;
		this.address=address;
		this.city=city;
		this.state=state;
		this.country=country;
		this.email=email;
		this.phoneNo=phoneNo;		
	}
    
	public static PatientGuardian build(Integer id,String name,String relationship,String gender,String address,String city,String state
	,String country,String phoneNo,String email) {
		return new PatientGuardian(id,name, relationship, gender, address, city, state, country, phoneNo, email);
	}
	public void update(PatientGuardianRequest patientGuardianRequest) {
		this.setId(patientGuardianRequest.getId());
		this.setName(patientGuardianRequest.getName());
	    this.setRelationship(patientGuardianRequest.getRelationship());
	    this.setGender(patientGuardianRequest.getGender());
	    this.setAddress(patientGuardianRequest.getAddress());
	    this.setCity(patientGuardianRequest.getState());
	    this.setCountry(patientGuardianRequest.getCountry());
	    this.setState(patientGuardianRequest.getCountry());
	    this.setPhoneNo(patientGuardianRequest.getPhoneNo());
	    this.setEmail(patientGuardianRequest.getEmail());
	}

}
