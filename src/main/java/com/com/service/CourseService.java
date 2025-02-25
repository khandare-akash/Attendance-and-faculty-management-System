package com.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.com.Dao.CourseDao;
import com.com.Entity.Course;

@Service
public class CourseService {

	@Autowired
	private CourseDao courseDao;

	public Course createCourse(Course course) {
		return courseDao.createCourse(course);
	}

	public Course getcourseById(int id) {
		return courseDao.getcourseById(id);
	}

	public List<Course> getAllCourse() {
		return courseDao.getAllCourse();
	}

	public Course updateCourse(Course course) {
		return courseDao.updateCourse(course);
	}

	public Course deleteCourse(int id) {
		return courseDao.deleteCourse(id);
	}

}
