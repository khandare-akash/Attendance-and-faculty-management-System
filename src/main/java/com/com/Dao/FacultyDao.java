package com.com.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.com.Entity.Faculty;

@Repository
public class FacultyDao {
	@Autowired
	private SessionFactory sessionFactory;


	public Faculty createFaculty(Faculty faculty) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(faculty);
		session.getTransaction().commit();
		return faculty;
	}

	public Faculty getfacultyById(int id) {
		Session session = sessionFactory.openSession();
	    Faculty faculty = session.get(Faculty.class, id);

	    if (faculty != null) {
	        return faculty;
	    } else {
	        session.close();
		    return null;

	    }
	    }
	public List<Faculty> getAllFaculty() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Faculty.class);
		return criteria.list();

	}

	public Faculty updateFaculty(Faculty faculty) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.saveOrUpdate(faculty);
		session.getTransaction().commit();
		return faculty;
	}

	public Faculty deleteFaculty(int id) {
		Session session = sessionFactory.openSession();
		Faculty faculty = session.load(Faculty.class, id);
		if (faculty != null) {
			session.beginTransaction();
			session.delete(faculty);
			session.getTransaction().commit();
		} else {
			return null;

		}
		return faculty;
	}

}
