package com.com.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.com.Entity.FacultyAttendance;

@Repository
public class FacultyAttendanceDao {

	@Autowired
	private SessionFactory sessionFactory;


	public FacultyAttendance createFacultyAttendance(FacultyAttendance facultyAttendance) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(facultyAttendance);
		session.getTransaction().commit();
		return facultyAttendance;
	}

	public FacultyAttendance getfacultyAttendanceById(int id) {
		Session session = sessionFactory.openSession();
	    FacultyAttendance facultyAttendance = session.get(FacultyAttendance.class, id);

	    if (facultyAttendance != null) {
	        return facultyAttendance;
	    } else {
	        session.close();
		    return null;

	    }
	    }
	public List<FacultyAttendance> getAllFacultyAttendance() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(FacultyAttendance.class);
		return criteria.list();

	}

	public FacultyAttendance updateFacultyAttendance(FacultyAttendance facultyAttendance) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.saveOrUpdate(facultyAttendance);
		session.getTransaction().commit();
		return facultyAttendance;
	}

	public FacultyAttendance deleteFacultyAttendance(int id) {
		Session session = sessionFactory.openSession();
		FacultyAttendance facultyAttendance = session.load(FacultyAttendance.class, id);
		if (facultyAttendance != null) {
			session.beginTransaction();
			session.delete(facultyAttendance);
			session.getTransaction().commit();
		} else {
			return null;

		}
		return facultyAttendance;
	}

}
