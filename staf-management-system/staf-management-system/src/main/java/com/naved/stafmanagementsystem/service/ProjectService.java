package com.naved.stafmanagementsystem.service;

import java.util.List;

import com.naved.stafmanagementsystem.entity.Project;
import com.naved.stafmanagementsystem.entity.Staff;

public interface ProjectService {
	
	// saving project class
	
	Project saveProject(Project project);
	
	// getting all details of project class 

	List<Project> getAllProject();

}
