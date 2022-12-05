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
public class PlacementController {
	@Autowired
	private PlacementService service;
	
	
	//RESTful API
		//creation
		@PostMapping("/placement")
		public void add(@RequestBody Placement p)
		{
			service.create(p);
		}
		//deletion
		@DeleteMapping("/placement/{id}")
		public void remove(@PathVariable Integer id)
		{
			service.delete(id);
		}
		//Retrieve with all the records
		@GetMapping("/placement")
		public List<Placement>list()
		{
			return service.listAll();
			
		}
		//Retrieve with specific id
		@GetMapping("/placement/{id}")
		public ResponseEntity<Placement> get(@PathVariable Integer id)
		{
			try {
				Placement p=service.retrieve(id);
				return new ResponseEntity<Placement>(p,HttpStatus.OK);
			
			}
			catch(NoSuchElementException e)
			{
				return new ResponseEntity<Placement>(HttpStatus.NOT_FOUND);
			}
			
			
		}
		//updation
		@PutMapping("/placement/{id}")
		public ResponseEntity<?> update(@RequestBody Placement p, @PathVariable Integer id)
		{
			try {
				@SuppressWarnings("unused")
				Placement p1=service.retrieve(id);
				service.create(p);
				return new ResponseEntity<Placement>(p,HttpStatus.OK);
			
			}
			catch(NoSuchElementException e)
			{
				return new ResponseEntity<Placement>(HttpStatus.NOT_FOUND);
			}
			
			
		}
}
