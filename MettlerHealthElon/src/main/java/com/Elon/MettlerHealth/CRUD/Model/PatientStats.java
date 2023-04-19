package com.Elon.MettlerHealth.CRUD.Model;

import org.springframework.data.mongodb.core.mapping.Document;

import com.Elon.MettlerHealth.CRUD.Dto.PatientStatsRequest;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Document(collection="PatientStats")
public class PatientStats {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
    private String language;
	private String ethnicity;
    private String race;
    private String familySize;
    private String monthlyIncome;
    private String interpreter;
    private String migrant;
    private String referralSource;
    private String religion;
    private String vfc;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getEthnicity() {
		return ethnicity;
	}
	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getFamilySize() {
		return familySize;
	}
	public void setFamilySize(String familySize) {
		this.familySize = familySize;
	}
	public String getMonthlyIncome() {
		return monthlyIncome;
	}
	public void setMonthlyIncome(String monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}
	public String getInterpreter() {
		return interpreter;
	}
	public void setInterpreter(String interpreter) {
		this.interpreter = interpreter;
	}
	public String getMigrant() {
		return migrant;
	}
	public void setMigrant(String migrant) {
		this.migrant = migrant;
	}
	public String getReferralSource() {
		return referralSource;
	}
	public void setReferralSource(String referralSource) {
		this.referralSource = referralSource;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getVfc() {
		return vfc;
	}
	public void setVfc(String vfc) {
		this.vfc = vfc;
	}
	public PatientStats(Integer id,String language,String ethnicity,String race,String familySize,String monthlyIncome
			,String interpreter,String migrant,String referralSource,String religion,String vfc) {
		super();
		this.id=id;
		this.language=language;
		this.ethnicity=ethnicity;
		this.race=race;
		this.familySize=familySize;
		this.monthlyIncome=monthlyIncome;
		this.interpreter=interpreter;
		this.migrant=migrant;
		this.referralSource=referralSource;
		this.religion=religion;
		this.vfc=vfc;
	}
	public static PatientStats build(Integer id,String language,String ethnicity,String race,String familySize,String monthlyIncome
			,String interpreter,String migrant,String referralSource,String religion,String vfc) {
		return new PatientStats( id, language, ethnicity, race, familySize, monthlyIncome
				, interpreter, migrant, referralSource, religion, vfc);
	}
	public void update(PatientStatsRequest patientStatsRequest) {
		this.setId(patientStatsRequest.getId());
		this.setLanguage(patientStatsRequest.getLanguage());
		this.setEthnicity(patientStatsRequest.getEthnicity());
		this.setRace(patientStatsRequest.getRace());
		this.setFamilySize(patientStatsRequest.getFamilySize());
		this.setMonthlyIncome(patientStatsRequest.getMonthlyIncome());
		this.setInterpreter(patientStatsRequest.getInterpreter());
		this.setMigrant(patientStatsRequest.getMigrant());
		this.setReferralSource(patientStatsRequest.getReferralSource());
		this.setReligion(patientStatsRequest.getReligion());
		this.setVfc(patientStatsRequest.getVfc());
	}    
}
