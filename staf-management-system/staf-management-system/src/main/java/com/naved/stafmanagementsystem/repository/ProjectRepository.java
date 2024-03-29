package com.naved.stafmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.naved.stafmanagementsystem.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long>{

}
