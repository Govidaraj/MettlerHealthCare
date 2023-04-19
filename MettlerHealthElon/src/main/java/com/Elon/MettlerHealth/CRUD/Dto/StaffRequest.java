package com.Elon.MettlerHealth.CRUD.Dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class StaffRequest {
	private int id;
	@NotBlank(message = "firstname shouldn't be null")
	private String firstName;
	 @NotBlank(message = "lastname shouldn't be null")
    private String lastName;
	 @NotBlank(message = "gender shouldn't be null")
	private String gender;
	 @DateTimeFormat (pattern = "yyyy-MM-dd")
	private Date dateOfBirth;
    private String socialSecurityNumber;
    @NotBlank(message = "addressLine1 shouldn't be null")
    private String addressLine1;
    @NotBlank(message = "addressLine2 shouldn't be null")
    private String addressLine2;
    @NotBlank(message = "city shouldn't be null")
    private String city;
    @NotBlank(message = "state shouldn't be null")
    private String state;
    @Min(value = 100000L, message = "postal code must be at least 6 digits")
    private int postalCode;
    @NotBlank(message = "country shouldn't be null")
	private String country;
    @NotNull
   	@Pattern(regexp = "^\\d{10}$",message = "invalid mobile number entered ")
	private String mobileNumber;
    @Email(message = "invalid email address")
    private String email;
    @NotBlank(message = "jobTitle shouldn't be null")
    private String jobTitle;
    @NotBlank(message = "department shouldn't be null")
    private String department;
//    @NotBlank(message = "workSchedule shouldn't be null")
//    private String workSchedule;
    @NotBlank(message = "salary shouldn't be null")
    private String salary;
    private int employeeId;
    @DateTimeFormat (pattern = "yyyy-MM-dd")
	private Date startDate;
	private Date endDate;
    private String credentials;
    private String skillsAndQualification;
    // Emergency Contact
    @NotBlank(message = "emergencyContactName shouldn't be null")
    private String emergencyContactName;
    @NotBlank(message = "relationship shouldn't be null")
    private String relationship;
    @NotNull
   	@Pattern(regexp = "^\\d{10}$",message = "invalid mobile number entered ")
    private String emergencyMobileNo;
    private String backgroundCheckInformation;
	private String immunizationSatus;
	private String HIPPATraining;
    private String privacyAcknowledgment;
    @NotBlank(message = "sign shouldn't be null")
    private String signature;
	
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
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
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getCredentials() {
		return credentials;
	}
	public void setCredentials(String credentials) {
		this.credentials = credentials;
	}
	public String getSkillsAndQualification() {
		return skillsAndQualification;
	}
	public void setSkillsAndQualification(String skillsAndQualification) {
		this.skillsAndQualification = skillsAndQualification;
	}
	public String getEmergencyContactName() {
		return emergencyContactName;
	}
	public void setEmergencyContactName(String emergencyContactName) {
		this.emergencyContactName = emergencyContactName;
	}
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	public String getEmergencyMobileNo() {
		return emergencyMobileNo;
	}
	public void setEmergencyMobileNo(String emergencyMobileNo) {
		this.emergencyMobileNo = emergencyMobileNo;
	}
	public String getBackgroundCheckInformation() {
		return backgroundCheckInformation;
	}
	public void setBackgroundCheckInformation(String backgroundCheckInformation) {
		this.backgroundCheckInformation = backgroundCheckInformation;
	}
	public String getImmunizationSatus() {
		return immunizationSatus;
	}
	public void setImmunizationSatus(String immunizationSatus) {
		this.immunizationSatus = immunizationSatus;
	}
	public String getHIPPATraining() {
		return HIPPATraining;
	}
	public void setHIPPATraining(String hIPPATraining) {
		HIPPATraining = hIPPATraining;
	}
	public String getPrivacyAcknowledgment() {
		return privacyAcknowledgment;
	}
	public void setPrivacyAcknowledgment(String privacyAcknowledgment) {
		this.privacyAcknowledgment = privacyAcknowledgment;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
    
    

}
