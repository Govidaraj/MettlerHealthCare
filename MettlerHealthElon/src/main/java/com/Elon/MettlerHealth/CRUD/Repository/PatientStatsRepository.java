package com.Elon.MettlerHealth.CRUD.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Elon.MettlerHealth.CRUD.Model.PatientStats;

public interface PatientStatsRepository extends MongoRepository<PatientStats, Integer> {
	PatientStats findById(int id);

}