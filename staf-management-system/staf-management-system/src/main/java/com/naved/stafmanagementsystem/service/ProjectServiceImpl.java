package com.naved.stafmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naved.stafmanagementsystem.entity.Project;
import com.naved.stafmanagementsystem.entity.Staff;
import com.naved.stafmanagementsystem.repository.ProjectRepository;
import com.naved.stafmanagementsystem.repository.StaffRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProjectServiceImpl implements ProjectService {
	
	@Autowired
	ProjectRepository projectRepository;

	@Override
	public Project saveProject(Project project) {
		
		Project savedProject = projectRepository.save(project);
		
		return savedProject;
	}

	// getting all project from project class
	
	@Override
	public List<Project> getAllProject() {
		
		List<Project> project = projectRepository.findAll();
		
		return project;
	}

}
