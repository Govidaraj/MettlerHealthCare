package com.Elon.MettlerHealth.CRUD.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Elon.MettlerHealth.CRUD.Dto.PatientContactRequest;
import com.Elon.MettlerHealth.CRUD.Exception.PatientContactNotFoundException;
import com.Elon.MettlerHealth.CRUD.Model.PatientContact;
import com.Elon.MettlerHealth.CRUD.Repository.PatientContactRepository;


@Service
public class PatientContactService {
	
	@Autowired
    private PatientContactRepository repository;

	public PatientContact savePatientContact(PatientContactRequest patientContactRequest) {
    	PatientContact patientContact = PatientContact.
                build(patientContactRequest.getId(),patientContactRequest.getAddress(),patientContactRequest.getAddressLine2(),patientContactRequest.getCity(),patientContactRequest.getState(),
                		patientContactRequest.getCountry(),patientContactRequest.getPostalCode(),patientContactRequest.getMobileNo(),patientContactRequest.getEmail());
        return repository.save(patientContact);
    }	    
    public List<PatientContact> getALlPatientContact() {
        return repository.findAll();
    }
    public PatientContact getPatientContact(int id) throws PatientContactNotFoundException {
    	PatientContact patientContact= repository.findById(id);
        if(patientContact!=null){
            return patientContact;
        }else{
            throw new PatientContactNotFoundException("Patient contact not found with id : "+id);
        }
    }

    public PatientContact updatePatientContact(int id, PatientContactRequest PatientContactRequest) throws PatientContactNotFoundException {
        Optional<PatientContact> PatientContactOptional = Optional.ofNullable(repository.findById(id));	
        if (PatientContactOptional.isPresent()) {
        	PatientContact PatientContact = PatientContactOptional.get();
        	PatientContact.update(PatientContactRequest);
            return repository.save(PatientContact);
        } else {
            throw new PatientContactNotFoundException("Staff not found with id: " + id);
        }
    }

    public void deletePatientContact(int id) throws PatientContactNotFoundException {
        if (!repository.existsById((int) id)) {
            throw new PatientContactNotFoundException("PatientContact not found with id: " + id);
        }
        repository.deleteById((int) id);
    }

}
