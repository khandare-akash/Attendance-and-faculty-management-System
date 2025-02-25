package com.com.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.com.Entity.Subject;

@Repository
public class SubjectDao {

	@Autowired
	private SessionFactory sessionFactory;


	public Subject createSubject(Subject subject) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(subject);
		session.getTransaction().commit();
		return subject;
	}

	public Subject getsubjectById(int id) {
		Session session = sessionFactory.openSession();
	    Subject subject = session.get(Subject.class, id);

	    if (subject != null) {
	        return subject;
	    } else {
	        session.close();
		    return null;

	    }
	    }
	public List<Subject> getAllSubject() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Subject.class);
		return criteria.list();

	}

	public Subject updateSubject(Subject subject) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.saveOrUpdate(subject);
		session.getTransaction().commit();
		return subject;
	}

	public Subject deleteSubject(int id) {
		Session session = sessionFactory.openSession();
		Subject subject = session.load(Subject.class, id);
		if (subject != null) {
			session.beginTransaction();
			session.delete(subject);
			session.getTransaction().commit();
		} else {
			return null;

		}
		return subject;
	}

}
