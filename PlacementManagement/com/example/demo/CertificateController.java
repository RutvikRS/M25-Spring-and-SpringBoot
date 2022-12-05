package com.example.demo;


import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CertificateController {
	@Autowired
	private CertificateService service;
	//RESTFUL API method for Create operation
	@PostMapping("/certificate")
	public void add(@RequestBody Certificate c)
	{
		service.create(c);
	}
	//RESTFUL API method for delete operation
	@DeleteMapping("/certificate/{id}")
	public void remove(@PathVariable Integer id)
	{
		service.delete(id);
	}
	
	//RESTFUL API method for update operation
	@PutMapping("/certificate/{id}")
	public ResponseEntity<?> update(@RequestBody Certificate c,@PathVariable Integer id)
	{
		try
		{
			@SuppressWarnings("unused")
			Certificate existObject=service.retrieve(id);
			service.create(c);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
		//RESTFUL API method for retrieve operation
		@GetMapping("/certificate/(id)")
		public ResponseEntity<Certificate> get(@PathVariable Integer id)
		{
			try
			{
				@SuppressWarnings("unused")
				Certificate s =service.retrieve(id);
				return new ResponseEntity<Certificate>(s,HttpStatus.OK);
			}
			catch(NoSuchElementException e)
			{
				return new ResponseEntity<Certificate>(HttpStatus.NOT_FOUND);
			}
			
			
		}
		//RESTFUL API method for retrieveAll operation
		@GetMapping("/certificate")
		public List<Certificate>listAll()
		{
			return service.retrieveAll();
		}
	

}
