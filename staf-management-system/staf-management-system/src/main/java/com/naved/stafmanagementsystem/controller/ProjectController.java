package com.naved.stafmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naved.stafmanagementsystem.entity.Project;

import com.naved.stafmanagementsystem.service.ProjectService;


@RestController
@RequestMapping("api/projects")
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	 // build save Project REST API
	
	@PostMapping
	public ResponseEntity<Project> saveProject(@RequestBody Project project){
		
	Project savedProject=projectService.saveProject(project);
	
	return new ResponseEntity<>(savedProject,HttpStatus.CREATED);
	}
	
	
	// build get  Project REST API
	
	
	@GetMapping
	public ResponseEntity<List<Project>> getProject(){
		List<Project> project = projectService.getAllProject();
		return new ResponseEntity<>(project,HttpStatus.OK);
	}

}
