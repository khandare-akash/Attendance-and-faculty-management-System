package com.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.com.Dao.ClassScheduleDao;
import com.com.Entity.ClassSchedule;
@Service
public class ClassScheduleService {


	@Autowired
	private ClassScheduleDao classScheduleDao;

	public ClassSchedule createClassSchedule(ClassSchedule classSchedule) {
		return classScheduleDao.createClassSchedule(classSchedule);
	}

	public ClassSchedule getclassScheduleById(int id) {
		return classScheduleDao.getclassScheduleById(id);
	}

	public List<ClassSchedule> getAllClassSchedule() {
		return classScheduleDao.getAllClassSchedule();
	}

	public ClassSchedule updateClassSchedule(ClassSchedule classSchedule) {
		return classScheduleDao.updateClassSchedule(classSchedule);
	}

	public ClassSchedule deleteClassSchedule(int id) {
		return classScheduleDao.deleteClassSchedule(id);
	}

}
