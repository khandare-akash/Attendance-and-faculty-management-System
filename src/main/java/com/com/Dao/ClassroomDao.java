package com.com.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.com.Entity.Classroom;


@Repository
public class ClassroomDao {

	@Autowired
	private SessionFactory sessionFactory;


	public Classroom createClassroom(Classroom classroom) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(classroom);
		session.getTransaction().commit();
		return classroom;
	}

	public Classroom getclassroomById(int id) {
		Session session = sessionFactory.openSession();
	    Classroom classroom = session.get(Classroom.class, id);

	    if (classroom != null) {
	        return classroom;
	    } else {
	        session.close();
		    return null;

	    }
	    }
	public List<Classroom> getAllClassroom() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Classroom.class);
		return criteria.list();

	}

	public Classroom updateClassroom(Classroom classroom) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.saveOrUpdate(classroom);
		session.getTransaction().commit();
		return classroom;
	}

	public Classroom deleteClassroom(int id) {
		Session session = sessionFactory.openSession();
		Classroom classroom = session.load(Classroom.class, id);
		if (classroom != null) {
			session.beginTransaction();
			session.delete(classroom);
			session.getTransaction().commit();
		} else {
			return null;

		}
		return classroom;
	}

}
