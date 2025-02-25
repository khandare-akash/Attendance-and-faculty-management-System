package com.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.com.Dao.DepartmentDao;
import com.com.Entity.Department;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentDao departmentDao;

	public Department createDepartment(Department department) {
		return departmentDao.createDepartment(department);
	}

	public Department getdepartmentById(int id) {
		return departmentDao.getdepartmentById(id);
	}

	public List<Department> getAllDepartment() {
		return departmentDao.getAllDepartment();
	}

	public Department updateDepartment(Department department) {
		return departmentDao.updateDepartment(department);
	}

	public Department deleteDepartment(int id) {
		return departmentDao.deleteDepartment(id);
	}

}
