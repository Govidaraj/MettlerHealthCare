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

import com.Elon.MettlerHealth.CRUD.Dto.StaffRequest;
import com.Elon.MettlerHealth.CRUD.Exception.StaffNotFoundException;
import com.Elon.MettlerHealth.CRUD.Model.Staff;
import com.Elon.MettlerHealth.CRUD.Service.StaffService;

@RestController
@RequestMapping("/staff")
public class StaffController {
	
	@Autowired
	private StaffService staffService;

	 @PostMapping("/addStaff")
	    public ResponseEntity<Staff> saveStaff(@RequestBody @Validated StaffRequest staffRequest){
	        return new ResponseEntity<Staff>(staffService.saveStaff(staffRequest), HttpStatus.CREATED);
	    }
	@GetMapping("/getAllStaffs")
	public ResponseEntity<List<Staff>> getAllStaff() {
	    List<Staff> staffList = staffService.getALlStaff();
	    return ResponseEntity.ok(staffList);
	}

	@GetMapping("/getStaff/{id}")
	public ResponseEntity<Staff> getStaff(@PathVariable int id) throws StaffNotFoundException {
	    Staff staff = staffService.getStaff(id);
	    return ResponseEntity.ok(staff);
	}

	@PutMapping("/updateStaff/{id}")
	public ResponseEntity<Staff> updateStaff(@PathVariable int id, @RequestBody @Validated StaffRequest staffRequest) {
	    try {
	        Staff updatedStaff = staffService.updateStaff(id, staffRequest);
	        return ResponseEntity.ok(updatedStaff);
	    } catch (StaffNotFoundException e) {
	        return ResponseEntity.notFound().build();
	    }
	}

	@DeleteMapping("/deleteStaff/{id}")
	public ResponseEntity<Void> deleteStaff(@PathVariable int id) throws StaffNotFoundException {
	    staffService.deleteStaff(id);
	    return ResponseEntity.noContent().build();
	}


}
