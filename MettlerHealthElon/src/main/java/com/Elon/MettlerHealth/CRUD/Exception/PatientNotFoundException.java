package com.Elon.MettlerHealth.CRUD.Exception;

	public class PatientNotFoundException  extends Exception{
		private static final long serialVersionUID = 1L;

		public PatientNotFoundException(int id) {
	        super("Patient not found with id : " + id);
	     
	    }

		public PatientNotFoundException(String id) {
			super("Patient not found with id : " + id);
			
		}
}
