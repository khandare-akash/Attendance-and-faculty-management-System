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

import com.com.Entity.Classroom;
import com.com.service.ClassroomService;

@RestController
@RequestMapping("/api/classrooms")
public class ClassroomController {

	@Autowired
	private ClassroomService classroomService; 
	
	@PostMapping
	public Classroom createClassroom(@RequestBody Classroom classroom) {
		return classroomService.createClassroom(classroom);
	}
	
	@GetMapping("/{id}")
	public Classroom getclassroomById(@PathVariable int id) {
		return classroomService.getclassroomById(id);
	}
	
	@GetMapping
	public List<Classroom> getAllClassroom(){
		return classroomService.getAllClassroom();
	}
	@PutMapping("/{id}")
	public Classroom  updateClassroom(@RequestBody Classroom classroom) {
		return classroomService.updateClassroom(classroom);
	}
	
	@DeleteMapping("/{id}")
	public Classroom deleteClassroom(@PathVariable int id) {
		return classroomService.deleteClassroom(id);
	}
}
