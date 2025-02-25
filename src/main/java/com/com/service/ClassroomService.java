package com.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.com.Dao.ClassroomDao;
import com.com.Entity.Classroom;

@Service
public class ClassroomService {

	@Autowired
	private ClassroomDao classroomDao;

	public Classroom createClassroom(Classroom classroom) {
		return classroomDao.createClassroom(classroom);
	}

	public Classroom getclassroomById(int id) {
		return classroomDao.getclassroomById(id);
	}

	public List<Classroom> getAllClassroom() {
		return classroomDao.getAllClassroom();
	}

	public Classroom updateClassroom(Classroom classroom) {
		return classroomDao.updateClassroom(classroom);
	}

	public Classroom deleteClassroom(int id) {
		return classroomDao.deleteClassroom(id);
	}
}
