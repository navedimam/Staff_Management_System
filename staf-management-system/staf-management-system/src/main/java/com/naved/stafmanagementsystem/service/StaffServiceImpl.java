package com.naved.stafmanagementsystem.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.naved.stafmanagementsystem.entity.Staff;
import com.naved.stafmanagementsystem.repository.StaffRepository;
import com.naved.stafmanagementsystem.service.StaffService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StaffServiceImpl implements StaffService{
	@Autowired
	StaffRepository staffRepository;
	

	


	@Override
	public Staff saveStaff(Staff staff) {
		
		
		
		Staff savedStaff = staffRepository.save(staff);
		
		return  savedStaff ;
	}





	@Override
	public List<Staff> getAllStaff() {
		
		List<Staff> staff = staffRepository.findAll();
		
				
		return staff;
	}





	@Override
	public List<Staff> getStaffWithYearSalaryAndProjectCriteria(int joiningyear, long salary) {
		List<Staff> staffList = staffRepository.findByJoinDateYearAndSalaryGreaterThan(joiningyear, salary);
		return staffList.stream()
                .filter(staff -> staff.getProject().size() > 1)
                .collect(Collectors.toList());
	}

}
