package com.sample.crud;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.sample.crud.dto.Student;

public class CreateStudent {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setId(3);
		student.setName("Devika");
		student.setCourse("MCA");
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(student);
		System.out.println("Inserted Successfully");
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

	
}
