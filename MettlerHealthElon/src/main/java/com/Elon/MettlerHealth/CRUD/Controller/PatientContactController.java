package com.Elon.MettlerHealth.CRUD.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Elon.MettlerHealth.CRUD.Dto.PatientContactRequest;
import com.Elon.MettlerHealth.CRUD.Exception.PatientContactNotFoundException;
import com.Elon.MettlerHealth.CRUD.Model.PatientContact;
import com.Elon.MettlerHealth.CRUD.Service.PatientContactService;


@RestController
@RequestMapping("/PatientContact")
public class PatientContactController {
	
	@Autowired
	private PatientContactService patientContactService;

	 @PostMapping("/addPatientContact")
	    public ResponseEntity<PatientContact> savePatientContact(@RequestBody @Validated PatientContactRequest patientContactRequest){
	        return new ResponseEntity<PatientContact>(patientContactService.savePatientContact(patientContactRequest), HttpStatus.CREATED);
	    }
	@GetMapping("/getAllPatientContact")
	public ResponseEntity<List<PatientContact>> getAllPatientContact() {
	    List<PatientContact> patientContactList = patientContactService.getALlPatientContact();
	    return ResponseEntity.ok(patientContactList);
	}

	@GetMapping("/getPatientContact/{id}")
	public ResponseEntity<PatientContact> getPatientContact(@PathVariable int id) throws PatientContactNotFoundException {
		PatientContact patientContact = patientContactService.getPatientContact(id);
	    return ResponseEntity.ok(patientContact);
	}

	@PutMapping("/updatePatientContact/{id}")
	public ResponseEntity<PatientContact> updatePatientContact(@PathVariable int id, @RequestBody @Validated PatientContactRequest patientContactRequest) {
	    try {
	    	PatientContact updatedPatientContact = patientContactService.updatePatientContact(id, patientContactRequest);
	        return ResponseEntity.ok(updatedPatientContact);
	    } catch (PatientContactNotFoundException e) {
	        return ResponseEntity.notFound().build();
	    }
	}

	@DeleteMapping("/deletePatientContact/{id}")
	public ResponseEntity<Void> deletePatientContact(@PathVariable int id) throws PatientContactNotFoundException {
		patientContactService.deletePatientContact(id);
	    return ResponseEntity.noContent().build();
	}

}
