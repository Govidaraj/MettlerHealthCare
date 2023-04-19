package com.Elon.MettlerHealth.CRUD.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Elon.MettlerHealth.CRUD.Dto.PatientStatsRequest;
import com.Elon.MettlerHealth.CRUD.Exception.PatientStatsNotFoundException;
import com.Elon.MettlerHealth.CRUD.Model.PatientStats;
import com.Elon.MettlerHealth.CRUD.Repository.PatientStatsRepository;

@Service
public class PatientStatsService {
	@Autowired
	private PatientStatsRepository repository;

	public PatientStats savePatientStats(PatientStatsRequest patientStatsRequest) {
		PatientStats patientStats = PatientStats.build(patientStatsRequest.getId(), patientStatsRequest.getLanguage(),
				patientStatsRequest.getEthnicity(), patientStatsRequest.getRace(), patientStatsRequest.getFamilySize(),
				patientStatsRequest.getMonthlyIncome(), patientStatsRequest.getInterpreter(),
				patientStatsRequest.getMigrant(), patientStatsRequest.getReferralSource(),
				patientStatsRequest.getReligion(), patientStatsRequest.getVfc());
		return repository.save(patientStats);
	}

	public List<PatientStats> getALlPatientStats() {
		return repository.findAll();
	}

	public PatientStats getPatientStats(int id) throws PatientStatsNotFoundException {
		PatientStats PatientStats = repository.findById(id);
		if (PatientStats != null) {
			return PatientStats;
		} else {
			throw new PatientStatsNotFoundException("PatientStats not found with id : " + id);
		}
	}

	public PatientStats updatePatientStats(int id, PatientStatsRequest PatientStatsRequest)
			throws PatientStatsNotFoundException {
		Optional<PatientStats> PatientStatsOptional = Optional.ofNullable(repository.findById(id));
		if (PatientStatsOptional.isPresent()) {
			PatientStats PatientStats = PatientStatsOptional.get();
			PatientStats.update(PatientStatsRequest);
			return repository.save(PatientStats);
		} else {
			throw new PatientStatsNotFoundException("Staff not found with id: " + id);
		}
	}

	public void deletePatientStats(int id) throws PatientStatsNotFoundException {
		if (!repository.existsById((int) id)) {
			throw new PatientStatsNotFoundException("PatientStats not found with id: " + id);
		}
		repository.deleteById((int) id);
	}

}
