package postgresql_connect;
import org.hibernate.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class postgresql_first {

	public static void main(String[] args) {
	
//		to connect we need session 
		
		Configuration config = new Configuration();
		config.addAnnotatedClass(Student.class);
		config.configure("hibernate.cfg.xml");
		SessionFactory  factory = config.buildSessionFactory();
		
		Session session = factory.openSession();
	
		
		Transaction transaction= session.beginTransaction();	 //only need while using ddl quaries like update ,insert..etc 

		Student s1 = new Student();

		s1.setAid(7);
		s1.setName("Ram ");
		s1.setTech("spring");

		Student updated = session.merge(s1);

		System.out.println("After merge:");
		System.out.println(updated);

		transaction.commit();

		session.close();
		factory.close();
	}
 
}