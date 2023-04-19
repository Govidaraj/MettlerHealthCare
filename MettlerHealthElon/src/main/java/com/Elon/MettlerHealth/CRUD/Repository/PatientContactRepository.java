package com.Elon.MettlerHealth.CRUD.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Elon.MettlerHealth.CRUD.Model.PatientContact;

public interface PatientContactRepository extends MongoRepository<PatientContact, Integer> {
	PatientContact findById(int id);

}
