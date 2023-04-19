package com.Elon.MettlerHealth.CRUD.Model;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import com.Elon.MettlerHealth.CRUD.Dto.StaffRequest;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Document(collection="Staff")
public class Staff {

	@Id
	private Integer id;
	//basic details :
	private String firstName;
    private String lastName;
	private String gender;
	private Date dateOfBirth;
    private String socialSecurityNumber;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private int postalCode;
	private String country;
	private String mobileNumber;
    private String email;
    private String jobTitle;
    private String department;
//    private String workSchedule;
    private String salary;
    private int employeeId;
	private Date startDate;
	private Date endDate;
    private String credentials;
    private String skillsAndQualification;
    // Emergency Contact
    private String emergencyContactName;
    private String relationship;
    private String emergencyMobileNo;
    private String backgroundCheckInformation;
	private String immunizationSatus;
	private String HIPPATraining;
    private String privacyAcknowledgment;
    private String signature;
	
    
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
	public void setEmailId(String email) {
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
	public Staff(int id,String firstName, String lastName, String gender, Date dateOfBirth, String socialSecurityNumber,
			String addressLine1, String addressLine2, String city, String state, int postalCode, String country,
			String mobileNumber, String email, String jobTitle, String department, String salary, int employeeId,
			Date startDate, Date endDate, String credentials, String skillsAndQualification,
			String emergencyContactName, String relationship, String emergencyMobileNo, String backgroundCheckInformation,
			String immunizationSatus, String HIPPATraining, String privacyAcknowledgment, String signature) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.socialSecurityNumber = socialSecurityNumber;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.country = country;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.jobTitle = jobTitle;
		this.department = department;
		this.salary = salary;
		this.employeeId = employeeId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.credentials = credentials;
		this.skillsAndQualification = skillsAndQualification;
		this.emergencyContactName = emergencyContactName;
		this.relationship = relationship;
		this.emergencyMobileNo = emergencyMobileNo;
		this.backgroundCheckInformation = backgroundCheckInformation;
		this.immunizationSatus = immunizationSatus;
		this.HIPPATraining = HIPPATraining;
		this.privacyAcknowledgment = privacyAcknowledgment;
		this.signature = signature;
	} 
	public static Staff build(int id,String firstName, String lastName, String gender, Date dateOfBirth, String socialSecurityNumber,
			String addressLine1, String addressLine2, String city, String state, int postalCode, String country,
			String mobileNumber, String email, String jobTitle, String department, String salary, int employeeId,
			Date startDate, Date endDate, String credentials, String skillsAndQualification,
			String emergencyContactName, String relationship, String emergencyMobileNo, String backgroundCheckInformation,
			String immunizationSatus, String HIPPATraining, String privacyAcknowledgment, String signature) {
		return new Staff (id,firstName, lastName, gender, dateOfBirth, socialSecurityNumber,
			 addressLine1, addressLine2, city,  state, postalCode, country,
			 mobileNumber, email, jobTitle, department, salary, employeeId,
			 startDate, endDate, credentials, skillsAndQualification,
			 emergencyContactName, relationship, emergencyMobileNo, backgroundCheckInformation,
			 immunizationSatus, HIPPATraining, privacyAcknowledgment, signature);
	}
	public void update(StaffRequest staffRequest) {
		
		this.setId(staffRequest.getId());
		this.setFirstName(staffRequest.getFirstName());
		this.setLastName(staffRequest.getLastName());
		this.setGender(staffRequest.getGender());
		this.setDateOfBirth(staffRequest.getDateOfBirth());
		this.setSocialSecurityNumber(staffRequest.getSocialSecurityNumber());
		this.setAddressLine1(staffRequest.getAddressLine1());
		this.setAddressLine2(staffRequest.getAddressLine2());
		this.setCity(staffRequest.getCity());
		this.setState(staffRequest.getState());
		this.setPostalCode(staffRequest.getPostalCode());
		this.setCountry(staffRequest.getCountry());
		this.setMobileNumber(staffRequest.getMobileNumber());
		this.setEmailId(staffRequest.getEmail());
		this.setJobTitle(staffRequest.getJobTitle());
		this.setDepartment(staffRequest.getDepartment());
		this.setSalary(staffRequest.getSalary());
		this.setEmployeeId(staffRequest.getEmployeeId());
		this.setStartDate(staffRequest.getStartDate());
		this.setEndDate(staffRequest.getEndDate());
		this.setCredentials(staffRequest.getCredentials());
		this.setSkillsAndQualification(staffRequest.getSkillsAndQualification());
		this.setEmergencyContactName(staffRequest.getEmergencyContactName());
		this.setRelationship(staffRequest.getRelationship());
		this.setEmergencyMobileNo(staffRequest.getEmergencyMobileNo());
		this.setBackgroundCheckInformation(staffRequest.getBackgroundCheckInformation());
		this.setImmunizationSatus(staffRequest.getImmunizationSatus());
		this.setHIPPATraining(staffRequest.getHIPPATraining());
		this.setPrivacyAcknowledgment(staffRequest.getPrivacyAcknowledgment());
		this.setSignature(staffRequest.getSignature());
	}
	
}