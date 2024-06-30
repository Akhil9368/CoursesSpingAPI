package com.springrest.SpringRest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Courses {
	@Id
	private long id;
	private String tittle;
	private String Description;
	public Courses(long id, String tittle, String description) {
		super();
		this.id = id;
		this.tittle = tittle;
		this.Description = description;
	}
	
	

	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTittle() {
		return tittle;
	}
	
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	@Override
	public String toString() {
		return "Courses [id=" + id + ", tittle=" + tittle + ", Description=" + Description + "]";
	}

}
