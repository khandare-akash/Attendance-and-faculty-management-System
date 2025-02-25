package com.com.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.com.Entity.Course;

@Repository
public class CourseDao {
	@Autowired
	private SessionFactory sessionFactory;

	public Course createCourse(Course course) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(course);
		session.getTransaction().commit();
		return course;
	}

	public Course getcourseById(int id) {
		Session session = sessionFactory.openSession();
		Course course = session.get(Course.class, id);

		if (course != null) {
			return course;
		} else {
			session.close();
			return null;

		}
	}

	public List<Course> getAllCourse() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Course.class);
		return criteria.list();

	}

	public Course updateCourse(Course course) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.saveOrUpdate(course);
		session.getTransaction().commit();
		return course;
	}

	public Course deleteCourse(int id) {
		Session session = sessionFactory.openSession();
		Course course = session.load(Course.class, id);
		if (course != null) {
			session.beginTransaction();
			session.delete(course);
			session.getTransaction().commit();
		} else {
			return null;

		}
		return course;
	}

}
