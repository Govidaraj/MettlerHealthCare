package com.Elon.MettlerHealth.CRUD.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Elon.MettlerHealth.CRUD.Model.PatientGuardian;


public interface PatientGuardianRepository extends MongoRepository<PatientGuardian, Integer> {
	PatientGuardian findById(int id);

}

