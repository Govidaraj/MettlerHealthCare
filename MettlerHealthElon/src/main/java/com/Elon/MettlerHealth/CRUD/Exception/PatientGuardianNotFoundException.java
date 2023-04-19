package com.Elon.MettlerHealth.CRUD.Exception;

public class PatientGuardianNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;
	public PatientGuardianNotFoundException(String id) {
        super("PatientGuardian not found with id : " + id);
     
    }
	

}
