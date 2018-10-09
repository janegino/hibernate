package com.sample.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import java.util.List;


public class ReadStudent {

	public static void main(String[] args) 
	{
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session =sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("from STUDENTINFO");
		List<Stud> students =query.list();
		for(Stud stud: students) 
		{
			System.out.println("Student Name"+stud.getName()+"Student Course"+stud.getCourse());
		}
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

}
