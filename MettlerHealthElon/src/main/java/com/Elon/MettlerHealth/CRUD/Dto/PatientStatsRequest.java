package com.Elon.MettlerHealth.CRUD.Dto;

import jakarta.validation.constraints.NotBlank;

public class PatientStatsRequest {

	private Integer id;
	@NotBlank(message = "address shouldn't be null")
	private String language;
	@NotBlank(message = "address shouldn't be null")
	private String ethnicity;
	@NotBlank(message = "address shouldn't be null")
	private String race;
	@NotBlank(message = "address shouldn't be null")
	private String familySize;
	@NotBlank(message = "address shouldn't be null")
	private String monthlyIncome;
	@NotBlank(message = "address shouldn't be null")
	private String interpreter;
	@NotBlank(message = "address shouldn't be null")
	private String migrant;
	@NotBlank(message = "address shouldn't be null")
	private String referralSource;
	@NotBlank(message = "address shouldn't be null")
	private String religion;
	@NotBlank(message = "address shouldn't be null")
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

}
