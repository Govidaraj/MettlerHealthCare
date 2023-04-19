package com.Elon.MettlerHealth.CRUD.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Elon.MettlerHealth.CRUD.Dto.PatientInsuranceRequest;
import com.Elon.MettlerHealth.CRUD.Exception.PatientInsuranceNotFoundException;
import com.Elon.MettlerHealth.CRUD.Model.PatientInsurance;
import com.Elon.MettlerHealth.CRUD.Repository.PatientInsuranceRepository;

@Service
public class PatientInsuranceService {
	@Autowired
    private PatientInsuranceRepository repository;

	public PatientInsurance savePatientInsurance(PatientInsuranceRequest patientInsuranceRequest) {
    	PatientInsurance patientInsurance = PatientInsurance.
                build(patientInsuranceRequest.getId(),patientInsuranceRequest.getPrimaryInsuranceProvider(),patientInsuranceRequest.getBirthDate(),patientInsuranceRequest.getSubscriber(),
                		patientInsuranceRequest.getEffectiveDate(),patientInsuranceRequest.getRelationship(),patientInsuranceRequest.getPlanName(),patientInsuranceRequest.getPolicyNumber(),patientInsuranceRequest.getGroupNumber()
                		,patientInsuranceRequest.getSubscriberEmployer());
        return repository.save(patientInsurance);
    }	    
    public List<PatientInsurance> getALlPatientInsurance() {
        return repository.findAll();
    }
    public PatientInsurance getPatientInsurance(int id) throws PatientInsuranceNotFoundException {
    	PatientInsurance PatientInsurance= repository.findById(id);
        if(PatientInsurance!=null){
            return PatientInsurance;
        }else{
            throw new PatientInsuranceNotFoundException("PatientInsurance not found with id : "+id);
        }
    }

    public PatientInsurance updatePatientInsurance(int id, PatientInsuranceRequest PatientInsuranceRequest) throws PatientInsuranceNotFoundException {
        Optional<PatientInsurance> PatientInsuranceOptional = Optional.ofNullable(repository.findById(id));	
        if (PatientInsuranceOptional.isPresent()) {
        	PatientInsurance PatientInsurance = PatientInsuranceOptional.get();
        	PatientInsurance.update(PatientInsuranceRequest);
            return repository.save(PatientInsurance);
        } else {
            throw new PatientInsuranceNotFoundException("Staff not found with id: " + id);
        }
    }

    public void deletePatientInsurance(int id) throws PatientInsuranceNotFoundException {
        if (!repository.existsById((int) id)) {
            throw new PatientInsuranceNotFoundException("PatientInsurance not found with id: " + id);
        }
        repository.deleteById((int) id);
    }

}
