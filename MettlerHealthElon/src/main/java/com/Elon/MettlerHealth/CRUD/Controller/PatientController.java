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

import com.Elon.MettlerHealth.CRUD.Dto.PatientRequest;
import com.Elon.MettlerHealth.CRUD.Exception.PatientNotFoundException;
import com.Elon.MettlerHealth.CRUD.Model.Patient;
import com.Elon.MettlerHealth.CRUD.Service.PatientService;


@RestController
@RequestMapping("/patient")
public class PatientController {

	@Autowired
	private PatientService service;

	@PostMapping("/addPatient")
	public ResponseEntity<Patient> savePatient(@RequestBody @Validated PatientRequest patientRequest) {
		return new ResponseEntity<Patient>(service.savePatient(patientRequest), HttpStatus.CREATED);
	}

	@GetMapping("/getAllPatients")
	public ResponseEntity<List<Patient>> getAllPatient() throws PatientNotFoundException {
		return ResponseEntity.ok(service.getALlPatient());
	}

	@GetMapping("/getPatient/{id}")
	public ResponseEntity<Patient> getPatient(@PathVariable int id) throws PatientNotFoundException {
		return ResponseEntity.ok(service.getPatient(id));
	}

	@PutMapping("/updatePatient/{id}")
	public ResponseEntity<Patient> updatePatient(@PathVariable int id,
			@RequestBody @Validated PatientRequest patientRequest) {
		try {
			Patient updatedPatient = service.updatePatient(id, patientRequest);
			return ResponseEntity.ok(updatedPatient);
		} catch (PatientNotFoundException e) {
			return ResponseEntity.notFound().build();
		}
	}

	@DeleteMapping("/deletePatient/{id}")
	public ResponseEntity<Void> deletePatient(@PathVariable int id) throws PatientNotFoundException {
		service.deletePatient(id);
		return ResponseEntity.noContent().build();
	}
}