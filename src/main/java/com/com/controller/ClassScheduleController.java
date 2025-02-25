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

import com.com.Entity.ClassSchedule;
import com.com.service.ClassScheduleService;

@RestController
@RequestMapping("/api/ClassSchedules")
public class ClassScheduleController {

	@Autowired
	private ClassScheduleService classScheduleService; 
	
	@PostMapping
	public ClassSchedule createClassSchedule(@RequestBody ClassSchedule classSchedule) {
		return classScheduleService.createClassSchedule(classSchedule);
	}
	
	@GetMapping("/{id}")
	public ClassSchedule getclassScheduleById(@PathVariable int id) {
		return classScheduleService.getclassScheduleById(id);
	}
	
	@GetMapping
	public List<ClassSchedule> getAllClassSchedule(){
		return classScheduleService.getAllClassSchedule();
	}
	@PutMapping("/{id}")
	public ClassSchedule  updateClassSchedule(@RequestBody ClassSchedule classSchedule) {
		return classScheduleService.updateClassSchedule(classSchedule);
	}
	
	@DeleteMapping("/{id}")
	public ClassSchedule deleteClassSchedule(@PathVariable int id) {
		return classScheduleService.deleteClassSchedule(id);
	}

}
