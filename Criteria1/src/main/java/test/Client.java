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

import beans.AdminEmployee;
import beans.Employee;
import beans.HardwareEmployee;
import beans.SoftwareEmployee;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.conf.xml");
		SessionFactory sf = cfg.buildSessionFactory();

		Session session=sf.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		SoftwareEmployee soft1=new SoftwareEmployee(101, "vinod", "vinod@gmail.com", 10000, "eclipse");
		SoftwareEmployee soft2=new SoftwareEmployee(103, "Ashish", "Ashish@gmail.com", 20000, "sts");
		HardwareEmployee hard1=new HardwareEmployee(102, "mohan", "mohandoss@gmail.com", 30000, 8);
		HardwareEmployee hard2=new HardwareEmployee(106, "Ashok", "Ashok@gmail.com", 15000, 9);
		AdminEmployee admin1=new AdminEmployee(105, "divya", "divya@gmail.com", 25000, "chennai");
		AdminEmployee admin2=new AdminEmployee(104, "vijaya", "vijaya@gmail.com", 32000, "Bangalore");
		
		session.save(soft1);
		session.save(soft2);
		session.save(hard1);
		session.save(hard2);
		session.save(admin1);
		session.save(admin2);
		
		transaction.commit();
		
		session.close();
		sf.close();
		
	}

}
