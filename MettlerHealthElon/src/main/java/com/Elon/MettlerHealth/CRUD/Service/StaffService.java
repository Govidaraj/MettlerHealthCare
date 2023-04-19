package com.Elon.MettlerHealth.CRUD.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Elon.MettlerHealth.CRUD.Dto.StaffRequest;
import com.Elon.MettlerHealth.CRUD.Exception.StaffNotFoundException;
import com.Elon.MettlerHealth.CRUD.Model.Staff;
import com.Elon.MettlerHealth.CRUD.Repository.StaffRepository;

@Service
public class StaffService {
	
	@Autowired
    private StaffRepository repository;

	public Staff saveStaff(StaffRequest staffRequest) {
		Staff staff = Staff.
                build(staffRequest.getId(),staffRequest.getFirstName(),staffRequest.getLastName(),staffRequest.getGender(),staffRequest.getDateOfBirth(),staffRequest.getSocialSecurityNumber(),staffRequest.getAddressLine1(),staffRequest.getAddressLine2(),
                		staffRequest.getCity(),staffRequest.getState(),staffRequest.getPostalCode(),staffRequest.getCountry(),staffRequest.getMobileNumber(),staffRequest.getEmail(),staffRequest.getJobTitle(),staffRequest.getDepartment(),
                		staffRequest.getSalary(),staffRequest.getEmployeeId(),staffRequest.getStartDate(),staffRequest.getEndDate(),staffRequest.getCredentials(),staffRequest.getSkillsAndQualification(),staffRequest.getEmergencyContactName(),
                		staffRequest.getRelationship(),staffRequest.getEmergencyMobileNo(),staffRequest.getBackgroundCheckInformation(),staffRequest.getImmunizationSatus(),staffRequest.getHIPPATraining(),staffRequest.getPrivacyAcknowledgment(),staffRequest.getSignature());
        return repository.save(staff);
    }	    
	public List<Staff> getALlStaff() {
        return repository.findAll();
    }
    public Staff getStaff(int id) throws StaffNotFoundException {
    	Staff staff= repository.findById(id);
        if(staff!=null){
            return staff;
        }else{
            throw new StaffNotFoundException("Staff not found with id : "+id);
        }
    }

    public Staff updateStaff(int id, StaffRequest staffRequest) throws StaffNotFoundException {
        Optional<Staff> staffOptional = Optional.ofNullable(repository.findById(id));	
        if (staffOptional.isPresent()) {
            Staff staff = staffOptional.get();
            staff.update(staffRequest);
            return repository.save(staff);
        } else {
            throw new StaffNotFoundException("Staff not found with id: " + id);
        }
    }

    public void deleteStaff(int id) throws StaffNotFoundException {
        if (!repository.existsById((int) id)) {
            throw new StaffNotFoundException("Staff not found with id: " + id);
        }
        repository.deleteById((int) id);
    }

}
