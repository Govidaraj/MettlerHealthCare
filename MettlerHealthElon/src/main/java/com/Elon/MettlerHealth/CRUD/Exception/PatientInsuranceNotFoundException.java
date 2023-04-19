package com.Elon.MettlerHealth.CRUD.Exception;

public class PatientInsuranceNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;
	public PatientInsuranceNotFoundException(String id) {
        super("Patient insurance  not found with id : " + id);
     
    }
}