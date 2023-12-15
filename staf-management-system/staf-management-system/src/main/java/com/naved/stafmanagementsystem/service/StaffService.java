package com.naved.stafmanagementsystem.service;

import java.util.List;


import com.naved.stafmanagementsystem.entity.Staff;

public interface StaffService {
	Staff saveStaff(Staff staff);
	
	
// get all staff list 
	List<Staff> getAllStaff();
	
// get Staff With Year,Salary And Project Criteria
	List<Staff> getStaffWithYearSalaryAndProjectCriteria(int joiningyear,long salary);

}
