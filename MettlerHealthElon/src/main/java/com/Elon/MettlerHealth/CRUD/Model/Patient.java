package com.Elon.MettlerHealth.CRUD.Model;

import org.springframework.data.mongodb.core.mapping.Document;

import com.Elon.MettlerHealth.CRUD.Dto.PatientRequest;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Document(collection="Patient")
@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
public class Patient {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	private String title;
    private String firstName;
    private String lastName;
    private String maritalStatus;
    private String gender;
    private String genderIdentity;
    private String sexualOrientation;
	
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGenderIdentity() {
		return genderIdentity;
	}
	public void setGenderIdentity(String genderIdentity) {
		this.genderIdentity = genderIdentity;
	}
	public String getSexualOrientation() {
		return sexualOrientation;
	}
	public void setSexualOrientation(String sexualOrientation) {
		this.sexualOrientation = sexualOrientation;
	}
    
	public Patient(int id,String title, String firstName,String lastName, String maritalStatus, String gender, String genderIdentity, String sexualOrientation) {
		super();
		this.title = title;
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.maritalStatus = maritalStatus;
		this.gender = gender;
		this.genderIdentity = genderIdentity;
		this.sexualOrientation = sexualOrientation;
	}
		public static Patient build(int id,String title, String firstName,String lastName, String maritalStatus, String gender, String genderIdentity,
				String sexualOrientation) {
			return new Patient(id,title, firstName,lastName, maritalStatus, gender, genderIdentity, sexualOrientation);
		}
		public void update(PatientRequest patientRequest) {
			this.setTitle(patientRequest.getTitle());
		    this.setFirstName(patientRequest.getFirstName());
		    this.setLastName(patientRequest.getLastName());
		    this.setGenderIdentity(patientRequest.getGenderIdentity());
		    this.setId(patientRequest.getId());
		    this.setMaritalStatus(patientRequest.getMaritalStatus());
		    this.setGender(patientRequest.getGender());
		    this.setSexualOrientation(patientRequest.getSexualOrientation());
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}		
}
