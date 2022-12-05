package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CollegeService {
	@Autowired
	private CollegeRepository repo;
	
	//to retrieve all the data of college class
	public List<College> listAll()
	{
		return repo.findAll();
	}

	//insert/create a data
	public void create(College c)
	{
	   repo.save(c);
	}
	
	//to retrieve a single record
	public College retrieve(Integer college_id)
	{
		return repo.findById(college_id).get();
		
	}
	
	//to delete a data
	public void delete(Integer college_id)
	{
		repo.deleteById(college_id);
	}
}