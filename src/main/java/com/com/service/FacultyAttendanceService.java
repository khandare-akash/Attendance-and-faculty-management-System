package com.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.com.Dao.FacultyAttendanceDao;
import com.com.Entity.FacultyAttendance;

@Service
public class FacultyAttendanceService {
	@Autowired
	private FacultyAttendanceDao facultyAttendanceDao;

	public FacultyAttendance createFacultyAttendance(FacultyAttendance facultyAttendance) {
		return facultyAttendanceDao.createFacultyAttendance(facultyAttendance);
	}

	public FacultyAttendance getfacultyAttendanceById(int id) {
		return facultyAttendanceDao.getfacultyAttendanceById(id);
	}

	public List<FacultyAttendance> getAllFacultyAttendance() {
		return facultyAttendanceDao.getAllFacultyAttendance();
	}

	public FacultyAttendance updateFacultyAttendance(FacultyAttendance facultyAttendance) {
		return facultyAttendanceDao.updateFacultyAttendance(facultyAttendance);
	}

	public FacultyAttendance deleteFacultyAttendance(int id) {
		return facultyAttendanceDao.deleteFacultyAttendance(id);
	}

}
