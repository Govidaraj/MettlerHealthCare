package com.Elon.MettlerHealth.CRUD.Exception;


public class PatientContactNotFoundException  extends Exception{
	private static final long serialVersionUID = 1L;

	public PatientContactNotFoundException(String id) {
        super("Patient contact not found with id : " + id);
     
    }
}
