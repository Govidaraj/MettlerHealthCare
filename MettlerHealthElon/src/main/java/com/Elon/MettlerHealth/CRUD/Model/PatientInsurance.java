package com.Elon.MettlerHealth.CRUD.Model;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import com.Elon.MettlerHealth.CRUD.Dto.PatientInsuranceRequest;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Document(collection="PatientInsurance")
public class PatientInsurance {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
    private String primaryInsuranceProvider;
	private String planName;
    private String subscriber;
    private String effectiveDate;
    private String relationship;
    private String policyNumber;
    private Date birthDate;
    private String groupNumber;
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
	public PatientInsurance(Integer id,String primaryInsuranceProvider,Date birthDate,String planName,String subscriber,String effectiveDate,String relationship
			,String policyNumber,String groupNumber,String subscriberEmployer) {
		super();
		
		this.id=id;
	    this.primaryInsuranceProvider=primaryInsuranceProvider;
		this.birthDate=birthDate ;
	    this.subscriber=subscriber;
	    this.effectiveDate= effectiveDate;
	    this.relationship= relationship;
	    this.policyNumber= policyNumber;
	    this.planName= planName;
	    this.birthDate= birthDate;
	    this.groupNumber= groupNumber;
	    this.subscriberEmployer= subscriberEmployer;
	}

	public static PatientInsurance build(Integer id,String primaryInsuranceProvider,Date birthDate,String planName,String subscriber,String effectiveDate,String relationship
			,String policyNumber,String groupNumber,String subscriberEmployer){
		return new PatientInsurance( id, primaryInsuranceProvider,birthDate, planName, subscriber, effectiveDate, relationship
				, policyNumber,  groupNumber, subscriberEmployer);
	}
	public void update(PatientInsuranceRequest patientInsuranceRequest) {
		    this.setId(patientInsuranceRequest.getId());
		    this.setPlanName(patientInsuranceRequest.getPlanName());
		    this.setPrimaryInsuranceProvider(patientInsuranceRequest.getPrimaryInsuranceProvider());
			this.setBirthDate(patientInsuranceRequest.getBirthDate()) ;
		    this.setSubscriber(patientInsuranceRequest.getSubscriber());
		    this.setEffectiveDate(patientInsuranceRequest.getEffectiveDate());
		    this.setRelationship(patientInsuranceRequest.getRelationship());
		    this.setPolicyNumber(patientInsuranceRequest.getPolicyNumber());
		    this.setGroupNumber(patientInsuranceRequest.getGroupNumber());
		    this.setSubscriberEmployer(patientInsuranceRequest.getSubscriberEmployer());
	}
}
