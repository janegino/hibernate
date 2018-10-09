package com.sample.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteStudent 
{

	public static void main(String[] args) 
	{
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Stud stud = (Stud)session.load(Stud.class, 2);
		session.delete(stud);
		session.getTransaction().commit();
		System.out.println("Deleted Successfully");
		session.close();
		sessionFactory.close();
		
	
	
	}

}
