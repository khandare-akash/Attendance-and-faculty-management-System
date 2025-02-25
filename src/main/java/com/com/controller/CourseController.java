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

import com.com.Entity.Course;
import com.com.service.CourseService;

@RestController
@RequestMapping("/api/Courses")
public class CourseController {
	@Autowired
	private CourseService courseService; 
	
	@PostMapping
	public Course createCourse(@RequestBody Course course) {
		return courseService.createCourse(course);
	}
	
	@GetMapping("/{id}")
	public Course getcourseById(@PathVariable int id) {
		return courseService.getcourseById(id);
	}
	
	@GetMapping
	public List<Course> getAllCourse(){
		return courseService.getAllCourse();
	}
	@PutMapping("/{id}")
	public Course  updateCourse(@RequestBody Course course) {
		return courseService.updateCourse(course);
	}
	
	@DeleteMapping("/{id}")
	public Course deleteCourse(@PathVariable int id) {
		return courseService.deleteCourse(id);
	}

}
