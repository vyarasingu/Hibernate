package test;

import java.util.List;

import javax.sound.midi.Soundbank;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import beans.Employee;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.conf.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Criteria c = session.createCriteria(Employee.class);
		
		Projection p1=Projections.max("salary");
		c.setProjection(p1);
		
		double average=(double)c.uniqueResult();
		
		System.out.println(average);
	}

}
