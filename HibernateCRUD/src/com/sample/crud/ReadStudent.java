package com.sample.crud;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.sample.crud.dto.Student;

public class ReadStudent {

	public static void main(String[] args) 
	{
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("from Student");
		List<Student> students = query.list();
		for(Student student : students) 
		{
			System.out.println("Roll No: " +student.getId()+" Student Name: "+student.getName()+ "Student Course: "+student.getCourse());
		}
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

}
