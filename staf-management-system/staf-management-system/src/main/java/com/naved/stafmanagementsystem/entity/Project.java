package com.naved.stafmanagementsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Prj1")
public class Project {
	
	// Taking Project Id(pID) and Project Name(pName) 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long pId;
	private String pName;
	

	public Project() {
		super();
	}
	public Project(long pId, String pName) {
		super();
		this.pId = pId;
		this.pName = pName;
	}
	public long getpId() {
		return pId;
	}
	public void setpId(long pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	

}
