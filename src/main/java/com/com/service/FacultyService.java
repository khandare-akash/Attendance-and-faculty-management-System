package com.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.com.Dao.FacultyDao;
import com.com.Entity.Faculty;

@Service
public class FacultyService {
	@Autowired
	private FacultyDao facultyDao;

	public Faculty createFaculty(Faculty faculty) {
		return facultyDao.createFaculty(faculty);
	}

	public Faculty getfacultyById(int id) {
		return facultyDao.getfacultyById(id);
	}

	public List<Faculty> getAllFaculty() {
		return facultyDao.getAllFaculty();
	}

	public Faculty updateFaculty(Faculty faculty) {
		return facultyDao.updateFaculty(faculty);
	}

	public Faculty deleteFaculty(int id) {
		return facultyDao.deleteFaculty(id);
	}

}
