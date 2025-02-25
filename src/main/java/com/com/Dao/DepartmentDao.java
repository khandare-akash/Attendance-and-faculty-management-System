package com.com.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.com.Entity.Department;

@Repository
public class DepartmentDao {

	@Autowired
	private SessionFactory sessionFactory;


	public Department createDepartment(Department department) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(department);
		session.getTransaction().commit();
		return department;
	}

	public Department getdepartmentById(int id) {
		Session session = sessionFactory.openSession();
	    Department department = session.get(Department.class, id);

	    if (department != null) {
	        return department;
	    } else {
	        session.close();
		    return null;

	    }
	    }
	public List<Department> getAllDepartment() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Department.class);
		return criteria.list();

	}

	public Department updateDepartment(Department department) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.saveOrUpdate(department);
		session.getTransaction().commit();
		return department;
	}

	public Department deleteDepartment(int id) {
		Session session = sessionFactory.openSession();
		Department department = session.load(Department.class, id);
		if (department != null) {
			session.beginTransaction();
			session.delete(department);
			session.getTransaction().commit();
		} else {
			return null;

		}
		return department;
	}

}
