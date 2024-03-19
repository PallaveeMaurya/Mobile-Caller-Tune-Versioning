package in.pwskills.nitin.test;

import java.io.IOException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import in.pwskills.nitin.entity.CallerTune;
 

public class TestApp {
	public static void main(String[] args) throws IOException{
		 
		
		SessionFactory sessionFactory= new Configuration().configure().addAnnotatedClass(CallerTune.class).buildSessionFactory();
		
		Session session= sessionFactory.openSession();
		Transaction transaction= session.beginTransaction();
		 
		CallerTune tune=new CallerTune();
		tune.setCallerTune("JAILER");
		tune.setCallerTuneId(1);
		tune.setMobileNo(9998887776L);
		tune.setProvider("JIO");
		
		session.save(tune);
		
		System.out.println("Record inserted successfully...");
		transaction.commit();
		session.close();
	}

}
