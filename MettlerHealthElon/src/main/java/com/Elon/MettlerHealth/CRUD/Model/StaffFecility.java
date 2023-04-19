package com.Elon.MettlerHealth.CRUD.Model;


import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
@Document(collection="Staff_Fecility")
public class StaffFecility {
	
	@Id
	@GeneratedValue
	private String facilityName;
    private String facilityType;
	private String address;
	private long phoneNumber;
    private String email;
    private String website;
    private String nationalProviderIdentifier;
    private String typeOfOwnership;
    private String serviceProvided;
    private String bedsRoomsAvailable;
	private String EmergencyContactInfo;
	private String disasterRecoveryPlanDocuentation;
    private String riskAssessmentDocumentation;
    private String HIPAAPoliciesAndDocumentation;
    private String BAAWithCoveredEntities;
	
    public String getFacilityName() {
		return facilityName;
	}
	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
	}
	public String getFacilityType() {
		return facilityType;
	}
	public void setFacilityType(String facilityType) {
		this.facilityType = facilityType;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getNationalProviderIdentifier() {
		return nationalProviderIdentifier;
	}
	public void setNationalProviderIdentifier(String nationalProviderIdentifier) {
		this.nationalProviderIdentifier = nationalProviderIdentifier;
	}
	public String getTypeOfOwnership() {
		return typeOfOwnership;
	}
	public void setTypeOfOwnership(String typeOfOwnership) {
		this.typeOfOwnership = typeOfOwnership;
	}
	public String getServiceProvided() {
		return serviceProvided;
	}
	public void setServiceProvided(String serviceProvided) {
		this.serviceProvided = serviceProvided;
	}
	public String getBedsRoomsAvailable() {
		return bedsRoomsAvailable;
	}
	public void setBedsRoomsAvailable(String bedsRoomsAvailable) {
		this.bedsRoomsAvailable = bedsRoomsAvailable;
	}
	public String getEmergencyContactInfo() {
		return EmergencyContactInfo;
	}
	public void setEmergencyContactInfo(String emergencyContactInfo) {
		EmergencyContactInfo = emergencyContactInfo;
	}
	public String getDisasterRecoveryPlanDocuentation() {
		return disasterRecoveryPlanDocuentation;
	}
	public void setDisasterRecoveryPlanDocuentation(String disasterRecoveryPlanDocuentation) {
		this.disasterRecoveryPlanDocuentation = disasterRecoveryPlanDocuentation;
	}
	public String getRiskAssessmentDocumentation() {
		return riskAssessmentDocumentation;
	}
	public void setRiskAssessmentDocumentation(String riskAssessmentDocumentation) {
		this.riskAssessmentDocumentation = riskAssessmentDocumentation;
	}
	public String getHIPAAPoliciesAndDocumentation() {
		return HIPAAPoliciesAndDocumentation;
	}
	public void setHIPAAPoliciesAndDocumentation(String HIPAAPoliciesAndDocumentation) {
		this.HIPAAPoliciesAndDocumentation = HIPAAPoliciesAndDocumentation;
	}
	public String getBAAWithCoveredEntities() {
		return BAAWithCoveredEntities;
	}
	public void setBAAWithCoveredEntities(String bAAWithCoveredEntities) {
		BAAWithCoveredEntities = bAAWithCoveredEntities;
	}
    
    

}
