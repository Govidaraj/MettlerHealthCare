package com.Elon.MettlerHealth.CRUD.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Elon.MettlerHealth.CRUD.Model.PatientInsurance;

public interface PatientInsuranceRepository extends MongoRepository<PatientInsurance, Integer> {
	PatientInsurance findById(int id);

}
