package com.Elon.MettlerHealth.CRUD.Exception;

public class StaffNotFoundException  extends Exception{
	private static final long serialVersionUID = 1L;

	public StaffNotFoundException(String id) {
        super("Staff not found with id : " + id);
     
    }
}
