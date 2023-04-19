package com.Elon.MettlerHealth.CRUD.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Elon.MettlerHealth.CRUD.Model.Patient;

public interface PatientRepository extends MongoRepository <Patient, Integer> {

	Patient findById(int id);

	Patient findById(String maritalStatus);

}