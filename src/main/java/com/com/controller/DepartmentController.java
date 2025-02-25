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

import com.com.Entity.Department;
import com.com.service.DepartmentService;

@RestController
@RequestMapping("/api/Departments")
public class DepartmentController {


	@Autowired
	private DepartmentService departmentService; 
	
	@PostMapping
	public Department createDepartment(@RequestBody Department department) {
		return departmentService.createDepartment(department);
	}
	
	@GetMapping("/{id}")
	public Department getdepartmentById(@PathVariable int id) {
		return departmentService.getdepartmentById(id);
	}
	
	@GetMapping
	public List<Department> getAllDepartment(){
		return departmentService.getAllDepartment();
	}
	@PutMapping("/{id}")
	public Department  updateDepartment(@RequestBody Department department) {
		return departmentService.updateDepartment(department);
	}
	
	@DeleteMapping("/{id}")
	public Department deleteDepartment(@PathVariable int id) {
		return departmentService.deleteDepartment(id);
	}

}
