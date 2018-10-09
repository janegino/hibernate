package com.sample.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudent {

	public static void main(String[] args)
	{
		Stud stud = new Stud();
		Stud stud1 = new Stud();
		Stud stud2 = new Stud();
		Stud stud3 = new Stud();
		stud.setName("Neha");
		stud.setCourse("BCA");
		stud1.setName("Nevin");
		stud1.setCourse("Bcom.");
		stud2.setName("Kate");
		stud2.setCourse("BSc");
		stud3.setName("Cerin");
		stud3.setCourse("MCA");
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(stud);
		session.save(stud1);
		session.save(stud2);
		session.save(stud3);
		System.out.println("Inserted Successfully");
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		
	}

}
