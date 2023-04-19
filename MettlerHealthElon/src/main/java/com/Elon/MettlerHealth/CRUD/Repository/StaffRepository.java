package com.Elon.MettlerHealth.CRUD.Repository;


import org.springframework.data.mongodb.repository.MongoRepository;


import com.Elon.MettlerHealth.CRUD.Model.Staff;


public interface StaffRepository extends MongoRepository <Staff, Integer> {

	Staff findById(int id);
}
