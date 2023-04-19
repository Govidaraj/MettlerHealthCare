package com.Elon.MettlerHealth.CRUD.Dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.NotBlank;

public class PatientInsuranceRequest {

	private Integer id;
	@NotBlank(message = "primaryInsuranceProvider shouldn't be null")
	private String primaryInsuranceProvider;
	@NotBlank(message = "planName shouldn't be null")
	private String planName;
	@NotBlank(message = "subscriber shouldn't be null")
	private String subscriber;
	@NotBlank(message = "effectiveDate shouldn't be null")
	private String effectiveDate;
	@NotBlank(message = "relationship shouldn't be null")
	private String relationship;
	@NotBlank(message = "policyNumber shouldn't be null")
	private String policyNumber;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date birthDate;
	@NotBlank(message = "groupNumber shouldn't be null")
	private String groupNumber;
	@NotBlank(message = "subscriberEmployer shouldn't be null")
	private String subscriberEmployer;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPrimaryInsuranceProvider() {
		return primaryInsuranceProvider;
	}

	public void setPrimaryInsuranceProvider(String primaryInsuranceProvider) {
		this.primaryInsuranceProvider = primaryInsuranceProvider;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getSubscriber() {
		return subscriber;
	}

	public void setSubscriber(String subscriber) {
		this.subscriber = subscriber;
	}

	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(String groupNumber) {
		this.groupNumber = groupNumber;
	}

	public String getSubscriberEmployer() {
		return subscriberEmployer;
	}

	public void setSubscriberEmployer(String subscriberEmployer) {
		this.subscriberEmployer = subscriberEmployer;
	}

}
