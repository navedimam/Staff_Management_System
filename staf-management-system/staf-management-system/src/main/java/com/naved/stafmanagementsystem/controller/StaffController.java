package com.naved.stafmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.naved.stafmanagementsystem.entity.Staff;
import com.naved.stafmanagementsystem.service.StaffService;

@RestController
@RequestMapping("api/staffs")
public class StaffController {
	@Autowired
	private StaffService staffService;
	private final int joiningYear=2023;
	private final long salary=30000;

	
	
	// build save staff REST API
	
	@PostMapping
	public ResponseEntity<Staff> saveStaff(@RequestBody Staff staff){
		
	Staff savedStaff=staffService.saveStaff(staff);
	
	return new ResponseEntity<>(savedStaff,HttpStatus.CREATED);
	}
	
	// build get staff REST API
	
	@GetMapping
	public ResponseEntity<List<Staff>> getStaffByCriteria(){
		List<Staff> staff = staffService.getStaffWithYearSalaryAndProjectCriteria(joiningYear,salary);
		return new ResponseEntity<>(staff,HttpStatus.OK);
	}
	

}
