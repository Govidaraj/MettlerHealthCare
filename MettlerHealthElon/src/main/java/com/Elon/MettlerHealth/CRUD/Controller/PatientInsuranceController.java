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

import com.Elon.MettlerHealth.CRUD.Dto.PatientInsuranceRequest;
import com.Elon.MettlerHealth.CRUD.Exception.PatientInsuranceNotFoundException;
import com.Elon.MettlerHealth.CRUD.Model.PatientInsurance;
import com.Elon.MettlerHealth.CRUD.Service.PatientInsuranceService;


@RestController
@RequestMapping("/PatientInsurance")
public class PatientInsuranceController {
	
	@Autowired
	private PatientInsuranceService patientInsuranceService;

	 @PostMapping("/addPatientInsurance")
	    public ResponseEntity<PatientInsurance> savePatientInsurance(@RequestBody @Validated PatientInsuranceRequest patientInsuranceRequest){
	        return new ResponseEntity<PatientInsurance>(patientInsuranceService.savePatientInsurance(patientInsuranceRequest), HttpStatus.CREATED);
	    }
	@GetMapping("/getAllPatientInsurance")
	public ResponseEntity<List<PatientInsurance>> getAllPatientInsurance() {
	    List<PatientInsurance> patientInsuranceList = patientInsuranceService.getALlPatientInsurance();
	    return ResponseEntity.ok(patientInsuranceList);
	}

	@GetMapping("/getPatientInsurance/{id}")
	public ResponseEntity<PatientInsurance> getPatientInsurance(@PathVariable int id) throws PatientInsuranceNotFoundException {
		PatientInsurance patientInsurance = patientInsuranceService.getPatientInsurance(id);
	    return ResponseEntity.ok(patientInsurance);
	}

	@PutMapping("/updatePatientInsurance/{id}")
	public ResponseEntity<PatientInsurance> updatePatientInsurance(@PathVariable int id, @RequestBody @Validated PatientInsuranceRequest patientInsuranceRequest) {
	    try {
	    	PatientInsurance updatedPatientInsurance = patientInsuranceService.updatePatientInsurance(id, patientInsuranceRequest);
	        return ResponseEntity.ok(updatedPatientInsurance);
	    } catch (PatientInsuranceNotFoundException e) {
	        return ResponseEntity.notFound().build();
	    }
	}

	@DeleteMapping("/deletePatientInsurance/{id}")
	public ResponseEntity<Void> deletePatientInsurance(@PathVariable int id) throws PatientInsuranceNotFoundException {
		patientInsuranceService.deletePatientInsurance(id);
	    return ResponseEntity.noContent().build();
	}

}
