package com.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.com.Dao.SubjectDao;
import com.com.Entity.Subject;

@Service
public class SubjectService {
	@Autowired
	private SubjectDao subjectDao;

	public Subject createSubject(Subject subject) {
		return subjectDao.createSubject(subject);
	}

	public Subject getsubjectById(int id) {
		return subjectDao.getsubjectById(id);
	}

	public List<Subject> getAllSubject() {
		return subjectDao.getAllSubject();
	}

	public Subject updateSubject(Subject subject) {
		return subjectDao.updateSubject(subject);
	}

	public Subject deleteSubject(int id) {
		return subjectDao.deleteSubject(id);
	}

}
