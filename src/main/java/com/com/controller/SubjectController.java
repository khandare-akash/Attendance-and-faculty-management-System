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

import com.com.Entity.Subject;
import com.com.service.SubjectService;

@RestController
@RequestMapping("/api/Subjects")
public class SubjectController {

	@Autowired
	private SubjectService subjectService; 
	
	@PostMapping
	public Subject createSubject(@RequestBody Subject subject) {
		return subjectService.createSubject(subject);
	}
	
	@GetMapping("/{id}")
	public Subject getsubjectById(@PathVariable int id) {
		return subjectService.getsubjectById(id);
	}
	
	@GetMapping
	public List<Subject> getAllSubject(){
		return subjectService.getAllSubject();
	}
	@PutMapping("/{id}")
	public Subject  updateSubject(@RequestBody Subject subject) {
		return subjectService.updateSubject(subject);
	}
	
	@DeleteMapping("/{id}")
	public Subject deleteSubject(@PathVariable int id) {
		return subjectService.deleteSubject(id);
	}

}
