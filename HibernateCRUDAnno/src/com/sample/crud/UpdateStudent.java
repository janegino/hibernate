package com.sample.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateStudent {

	public static void main(String[] args) 
	{
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Stud stud =(Stud)session.get(Stud.class, 2);
		stud.setName("Olivia");
		System.out.println("Updated successfully");
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		
	}

}
