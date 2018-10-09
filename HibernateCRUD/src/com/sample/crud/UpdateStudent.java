package com.sample.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sample.crud.dto.Student;

public class UpdateStudent {

	public static void main(String[] args) 
	{
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Student student = (Student)session.get(Student.class, 2);
		student.setName("Maneesha");
		System.out.println("Updated Successfully");
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

}	
