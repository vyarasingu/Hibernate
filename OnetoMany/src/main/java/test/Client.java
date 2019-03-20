package test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Actor;
import beans.Movie;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Configuration cfg=new Configuration();
			cfg.configure("hibernate.cfg.xml");
			SessionFactory sf=cfg.buildSessionFactory();
			Session session=sf.openSession();
			
			Transaction transaction=session.beginTransaction();
			
			Actor a1=new Actor();
			a1.setAid(1);
			a1.setAname("Kamal");

			Actor a2=new Actor();
			a2.setAid(2);
			a2.setAname("Nagarjuna");
			
			Movie m1=new Movie();
			m1.setMid(101);
			m1.setMname("Indian");
			m1.setActor(a1);
			
			Movie m2=new Movie();
			m2.setMid(103);
			m2.setMname("Swathi Muthyam");
			m2.setActor(a1);
			
			Movie m3=new Movie();
			m3.setMid(102);
			m3.setMname("Shiva");
			m3.setActor(a2);
			
			Movie m4=new Movie();
			m4.setMid(104);
			m4.setMname("Mass");
			m4.setActor(a2);



			session.save(m1);
			session.save(m2);
			session.save(m3);
			session.save(m4);
			
			
			transaction.commit();
			session.close();
			sf.close();
	}
		
}
