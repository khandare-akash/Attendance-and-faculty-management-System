package com.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.com.Entity.Faculty;
import com.com.service.FacultyService;

@RestController
@RequestMapping("/api/Facultys")
public class FacultyController {
	@Autowired
	private FacultyService facultyService; 
	
	@PostMapping
	public Faculty createFaculty(@RequestBody Faculty faculty) {
		return facultyService.createFaculty(faculty);
	}
	
	@GetMapping("/{id}")
	public Faculty getfacultyById(@PathVariable int id) {
		return facultyService.getfacultyById(id);
	}
	
	@GetMapping
	public List<Faculty> getAllFaculty(){
		return facultyService.getAllFaculty();
	}
	@PutMapping("/{id}")
	public Faculty  updateFaculty(@RequestBody Faculty faculty) {
		return facultyService.updateFaculty(faculty);
	}
	
	@DeleteMapping("/{id}")
	public Faculty deleteFaculty(@PathVariable int id) {
		return facultyService.deleteFaculty(id);
	}

}
