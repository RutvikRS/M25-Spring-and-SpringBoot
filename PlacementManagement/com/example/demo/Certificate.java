package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Certificate {
	@Id
	
	private Integer id;
	private Integer year;
	
	// Default Constructor
	public Certificate() {
		
	}
	// Parameter Constructor
	public Certificate(Integer id, Integer year, String college) {
		super();
		this.id = id;
		this.year = year;
		
	}
	// getter and Setter
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	
	// To String method
	@Override
	public String toString() {
		return "Certificate [id=" + id + ", year=" + year +  "]";
	}

	}
