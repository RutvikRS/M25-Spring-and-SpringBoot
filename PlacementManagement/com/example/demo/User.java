package com.example.demo;

import jakarta.persistence.Entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Id;

@Entity
public class User {
	
	@Id
	private Integer id;
	private String name;
	private Integer type;
	private String password;
	

//  Default Constructor
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// parameterized constructor
	public User(Integer id, String name, Integer type, String password) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
	}
