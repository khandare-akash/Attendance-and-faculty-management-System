package com.com.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.com.Entity.ClassSchedule;

@Repository
public class ClassScheduleDao {

	@Autowired
	private SessionFactory sessionFactory;


	public ClassSchedule createClassSchedule(ClassSchedule classSchedule) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(classSchedule);
		session.getTransaction().commit();
		return classSchedule;
	}

	public ClassSchedule getclassScheduleById(int id) {
		Session session = sessionFactory.openSession();
	    ClassSchedule classSchedule = session.get(ClassSchedule.class, id);

	    if (classSchedule != null) {
	        return classSchedule;
	    } else {
	        session.close();
		    return null;

	    }
	    }
	public List<ClassSchedule> getAllClassSchedule() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(ClassSchedule.class);
		return criteria.list();

	}

	public ClassSchedule updateClassSchedule(ClassSchedule classSchedule) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.saveOrUpdate(classSchedule);
		session.getTransaction().commit();
		return classSchedule;
	}

	public ClassSchedule deleteClassSchedule(int id) {
		Session session = sessionFactory.openSession();
		ClassSchedule classSchedule = session.load(ClassSchedule.class, id);
		if (classSchedule != null) {
			session.beginTransaction();
			session.delete(classSchedule);
			session.getTransaction().commit();
		} else {
			return null;

		}
		return classSchedule;
	}

}
