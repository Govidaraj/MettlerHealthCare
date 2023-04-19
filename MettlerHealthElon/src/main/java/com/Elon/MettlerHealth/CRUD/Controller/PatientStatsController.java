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

import com.Elon.MettlerHealth.CRUD.Dto.PatientStatsRequest;
import com.Elon.MettlerHealth.CRUD.Exception.PatientStatsNotFoundException;
import com.Elon.MettlerHealth.CRUD.Model.PatientStats;
import com.Elon.MettlerHealth.CRUD.Service.PatientStatsService;

@RestController
@RequestMapping("/PatientStats")
public class PatientStatsController {
	
	@Autowired
	private PatientStatsService patientStatsService;

	 @PostMapping("/addPatientStats")
	    public ResponseEntity<PatientStats> savePatientStats(@RequestBody @Validated PatientStatsRequest patientStatsRequest){
	        return new ResponseEntity<PatientStats>(patientStatsService.savePatientStats(patientStatsRequest), HttpStatus.CREATED);
	    }
	@GetMapping("/getAllPatientStats")
	public ResponseEntity<List<PatientStats>> getAllPatientStats() {
	    List<PatientStats> patientStatsList = patientStatsService.getALlPatientStats();
	    return ResponseEntity.ok(patientStatsList);
	}

	@GetMapping("/getPatientStats/{id}")
	public ResponseEntity<PatientStats> getPatientStats(@PathVariable int id) throws PatientStatsNotFoundException {
		PatientStats patientStats = patientStatsService.getPatientStats(id);
	    return ResponseEntity.ok(patientStats);
	}

	@PutMapping("/updatePatientStats/{id}")
	public ResponseEntity<PatientStats> updatePatientStats(@PathVariable int id, @RequestBody @Validated PatientStatsRequest patientStatsRequest) {
	    try {
	    	PatientStats updatedPatientStats = patientStatsService.updatePatientStats(id, patientStatsRequest);
	        return ResponseEntity.ok(updatedPatientStats);
	    } catch (PatientStatsNotFoundException e) {
	        return ResponseEntity.notFound().build();
	    }
	}

	@DeleteMapping("/deletePatientStats/{id}")
	public ResponseEntity<Void> deletePatientStats(@PathVariable int id) throws PatientStatsNotFoundException {
		patientStatsService.deletePatientStats(id);
	    return ResponseEntity.noContent().build();
	}

}
