package com.Elon.MettlerHealth.CRUD.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Elon.MettlerHealth.CRUD.Dto.PatientGuardianRequest;
import com.Elon.MettlerHealth.CRUD.Exception.PatientGuardianNotFoundException;
import com.Elon.MettlerHealth.CRUD.Model.PatientGuardian;
import com.Elon.MettlerHealth.CRUD.Repository.PatientGuardianRepository;

@Service
public class PatientGuardianService {
	
	@Autowired
    private PatientGuardianRepository repository;

	public PatientGuardian savePatientGuardian(PatientGuardianRequest patientGuardianRequest) {
    	PatientGuardian patientGuardian = PatientGuardian.
                build(patientGuardianRequest.getId(),patientGuardianRequest.getName(),patientGuardianRequest.getRelationship(),patientGuardianRequest.getGender(),patientGuardianRequest.getAddress()
                		,patientGuardianRequest.getState(),patientGuardianRequest.getCountry(),patientGuardianRequest.getCountry(),patientGuardianRequest.getPhoneNo(),patientGuardianRequest.getEmail());
        return repository.save(patientGuardian);
    }	    
    public List<PatientGuardian> getALlPatientGuardian() {
        return repository.findAll();
    }
    public PatientGuardian getPatientGuardian(int id) throws PatientGuardianNotFoundException {
    	PatientGuardian PatientGuardian= repository.findById(id);
        if(PatientGuardian!=null){
            return PatientGuardian;
        }else{
            throw new PatientGuardianNotFoundException("PatientGuardian not found with id : "+id);
        }
    }

    public PatientGuardian updatePatientGuardian(int id, PatientGuardianRequest PatientGuardianRequest) throws PatientGuardianNotFoundException {
        Optional<PatientGuardian> PatientGuardianOptional = Optional.ofNullable(repository.findById(id));	
        if (PatientGuardianOptional.isPresent()) {
        	PatientGuardian PatientGuardian = PatientGuardianOptional.get();
        	PatientGuardian.update(PatientGuardianRequest);
            return repository.save(PatientGuardian);
        } else {
            throw new PatientGuardianNotFoundException("Staff not found with id: " + id);
        }
    }

    public void deletePatientGuardian(int id) throws PatientGuardianNotFoundException {
        if (!repository.existsById((int) id)) {
            throw new PatientGuardianNotFoundException("PatientGuardian not found with id: " + id);
        }
        repository.deleteById((int) id);
    }

}
