package com.mapping2;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Emp {
	@Id
	private int eId;
	private String name;
	
	@ManyToMany
	private List<Project> project;

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}

	public Emp(int eId, String name, List<Project> project) {
		super();
		this.eId = eId;
		this.name = name;
		this.project = project;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
