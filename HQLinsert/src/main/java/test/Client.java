package test;

import org.hibernate.Transaction;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.OldStudent;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Configuration cfg=new Configuration();
			cfg.configure("hibernate.cfg.xml");
			
			SessionFactory sf=cfg.buildSessionFactory();
			Session session=sf.openSession();
			
			Transaction transaction=session.beginTransaction();
			
		
			
			String hql="update NewStudent set id=121 where name='mohan'";
			Query  q=session.createQuery(hql);
			int i=q.executeUpdate();
			System.out.println(i+"records updated");
			transaction.commit();
			
			session.close();
			sf.close();
			
	}

}
