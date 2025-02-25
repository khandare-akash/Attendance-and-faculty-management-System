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

import com.com.Entity.FacultyAttendance;
import com.com.service.FacultyAttendanceService;

@RestController
@RequestMapping("/api/FacultyAttendances")
public class FacultyAttendanceController {

	@Autowired
	private FacultyAttendanceService facultyAttendanceService; 
	
	@PostMapping
	public FacultyAttendance createFacultyAttendance(@RequestBody FacultyAttendance facultyAttendance) {
		return facultyAttendanceService.createFacultyAttendance(facultyAttendance);
	}
	
	@GetMapping("/{id}")
	public FacultyAttendance getfacultyAttendanceById(@PathVariable int id) {
		return facultyAttendanceService.getfacultyAttendanceById(id);
	}
	
	@GetMapping
	public List<FacultyAttendance> getAllFacultyAttendance(){
		return facultyAttendanceService.getAllFacultyAttendance();
	}
	@PutMapping("/{id}")
	public FacultyAttendance  updateFacultyAttendance(@RequestBody FacultyAttendance facultyAttendance) {
		return facultyAttendanceService.updateFacultyAttendance(facultyAttendance);
	}
	
	@DeleteMapping("/{id}")
	public FacultyAttendance deleteFacultyAttendance(@PathVariable int id) {
		return facultyAttendanceService.deleteFacultyAttendance(id);
	}

}
