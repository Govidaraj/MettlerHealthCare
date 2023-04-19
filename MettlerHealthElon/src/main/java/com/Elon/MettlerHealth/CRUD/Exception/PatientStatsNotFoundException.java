package com.Elon.MettlerHealth.CRUD.Exception;

public class PatientStatsNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;
	public PatientStatsNotFoundException(String id) {
        super("Patient stats  not found with id : " + id);
     
    }
}
