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

import com.Elon.MettlerHealth.CRUD.Dto.PatientGuardianRequest;
import com.Elon.MettlerHealth.CRUD.Exception.PatientGuardianNotFoundException;
import com.Elon.MettlerHealth.CRUD.Model.PatientGuardian;
import com.Elon.MettlerHealth.CRUD.Service.PatientGuardianService;


@RestController
@RequestMapping("/PatientGuardian")
public class PatientGuardianController {
	
	@Autowired
	private PatientGuardianService patientGuardianService;

	 @PostMapping("/addPatientGuardian")
	    public ResponseEntity<PatientGuardian> savePatientGuardian(@RequestBody @Validated PatientGuardianRequest patientGuardianRequest){
	        return new ResponseEntity<PatientGuardian>(patientGuardianService.savePatientGuardian(patientGuardianRequest), HttpStatus.CREATED);
	    }
	@GetMapping("/getAllPatientGuardian")
	public ResponseEntity<List<PatientGuardian>> getAllPatientGuardian() {
	    List<PatientGuardian> patientGuardianList = patientGuardianService.getALlPatientGuardian();
	    return ResponseEntity.ok(patientGuardianList);
	}

	@GetMapping("/getPatientGuardian/{id}")
	public ResponseEntity<PatientGuardian> getPatientGuardian(@PathVariable int id) throws PatientGuardianNotFoundException {
		PatientGuardian patientGuardian = patientGuardianService.getPatientGuardian(id);
	    return ResponseEntity.ok(patientGuardian);
	}

	@PutMapping("/updatePatientGuardian/{id}")
	public ResponseEntity<PatientGuardian> updatePatientGuardian(@PathVariable int id, @RequestBody @Validated PatientGuardianRequest patientGuardianRequest) {
	    try {
	    	PatientGuardian updatedPatientGuardian = patientGuardianService.updatePatientGuardian(id, patientGuardianRequest);
	        return ResponseEntity.ok(updatedPatientGuardian);
	    } catch (PatientGuardianNotFoundException e) {
	        return ResponseEntity.notFound().build();
	    }
	}

	@DeleteMapping("/deletePatientGuardian/{id}")
	public ResponseEntity<Void> deletePatientGuardian(@PathVariable int id) throws PatientGuardianNotFoundException {
		patientGuardianService.deletePatientGuardian(id);
	    return ResponseEntity.noContent().build();
	}

}
