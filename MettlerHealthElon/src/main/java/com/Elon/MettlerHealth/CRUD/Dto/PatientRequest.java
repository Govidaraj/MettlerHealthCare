package com.Elon.MettlerHealth.CRUD.Dto;

import jakarta.validation.constraints.NotBlank;


public class PatientRequest {
	   private int id;
	   @NotBlank(message = "title shouldn't be null")
	   private String title;
	   @NotBlank(message = "firstname shouldn't be null")
	    private String firstName;
	   @NotBlank(message = "lastname shouldn't be null")
	    private String lastName;
	   @NotBlank(message = "marital status shouldn't be null")
	    private String maritalStatus;
	    @NotBlank(message = "gender shouldn't be null")
	    private String gender;
	    private String genderIdentity;
	    private String SexualOrientation;
	    
	    public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
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
			return SexualOrientation;
		}
		public void setSexualOrientation(String SexualOrientation) {
			this.SexualOrientation = SexualOrientation;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	    
	    

}
