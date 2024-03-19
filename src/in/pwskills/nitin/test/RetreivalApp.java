package in.pwskills.nitin.test;

import java.io.IOException;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.pwskills.nitin.entity.CallerTune;


public class RetreivalApp {

	public static void main(String[] args) throws IOException {
		 

		SessionFactory sessionFactory= new Configuration().configure().addAnnotatedClass(CallerTune.class).buildSessionFactory();
		Session session= sessionFactory.openSession();
		
		CallerTune tune=session.get(CallerTune.class, 1);
		if(tune==null) {
			System.out.println("Object/Record not found for updation...");
		}else {
			Transaction transaction = session.beginTransaction();
			tune.setProvider("Airtel");
			transaction.commit();
			System.out.println("Object is updated for:: " + tune.getVersionCount()+"times.");
			session.close();
		}
		System.out.println("Application is stopping");
	}

}
