package com.Elon.MettlerHealth.CRUD.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Elon.MettlerHealth.CRUD.Dto.PatientRequest;
import com.Elon.MettlerHealth.CRUD.Exception.PatientNotFoundException;
import com.Elon.MettlerHealth.CRUD.Model.Patient;
import com.Elon.MettlerHealth.CRUD.Repository.PatientRepository;

@Service
public class PatientService {
	
		@Autowired
	    private PatientRepository repository;

		public Patient savePatient(PatientRequest PatientRequest) {
	    	Patient patient = Patient.
	                build(PatientRequest.getId(),PatientRequest.getTitle(), PatientRequest.getFirstName(),PatientRequest.getLastName(), PatientRequest.getMaritalStatus(),
	                	 PatientRequest.getGender(), PatientRequest.getGenderIdentity(), PatientRequest.getSexualOrientation());
	        return repository.save(patient);
	    }	    
	    public List<Patient> getALlPatient() {
	        return repository.findAll();
	    }
	    public Patient getPatient(int id) throws PatientNotFoundException {
	    	Patient patient= repository.findById(id);
	        if(patient!=null){
	            return patient;
	        }else{
	            throw new PatientNotFoundException("patient not found with id : "+id);
	        }
	    }

	    public Patient updatePatient(int id, PatientRequest patientRequest) throws PatientNotFoundException {
	        Optional<Patient> patientOptional = Optional.ofNullable(repository.findById(id));	
	        if (patientOptional.isPresent()) {
	        	Patient patient = patientOptional.get();
	        	patient.update(patientRequest);
	            return repository.save(patient);
	        } else {
	            throw new PatientNotFoundException("Staff not found with id: " + id);
	        }
	    }

	    public void deletePatient(int id) throws PatientNotFoundException {
	        if (!repository.existsById((int) id)) {
	            throw new PatientNotFoundException("Patient not found with id: " + id);
	        }
	        repository.deleteById((int) id);
	    }
}

