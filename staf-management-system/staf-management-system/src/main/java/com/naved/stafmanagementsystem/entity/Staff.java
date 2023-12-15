package com.naved.stafmanagementsystem.entity;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "empl")
public class Staff {
	// taking 
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String staffName;
	private Long staffSalary;
	private int joiningYear;
	
	// Foreign key used for fetching data from Staff Class
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "Staff_Id")
	private List<Project> project;
	
	
	public Staff() {
		super();
	}
	
	
	public Staff(Long id, String staffName, Long staffSalary, int joiningYear, List<Project> project) {
		super();
		this.id = id;
		this.staffName = staffName;
		this.staffSalary = staffSalary;
		this.joiningYear = joiningYear;
		this.project = project;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public Long getStaffSalary() {
		return staffSalary;
	}
	public void setStaffSalary(Long staffSalary) {
		this.staffSalary = staffSalary;

}
	public int getJoiningYear() {
		return joiningYear;
	}
	public void setJoiningYear(int joiningYear) {
		this.joiningYear = joiningYear;
	}
	public List<Project> getProject() {
		return project;
	}
	public void setProject(List<Project> project) {
		this.project = project;
	}
	
	}
