package postgresql_connect;
import org.hibernate.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class postgresql_first {

	public static void main(String[] args) {
		Student s1 =new Student();
		s1.setName("rowan");
		s1.setAid(1);
		s1.setTech("java");
		
//		to connect we need session 
		
		Configuration config = new Configuration();
		config.addAnnotatedClass(Student.class);
		config.configure("hibernate.cfg.xml");
		SessionFactory  factory = config.buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(s1);
		transaction.commit();
		
		
	}

}
