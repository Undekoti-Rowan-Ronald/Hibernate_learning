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
		
//		this is for insert data 
//		session.persist(s1);
// this is to fetch 
		Student d1 =session.get(Student.class, 1); //this is old method removed on version 6
		Student d2 =session.find(Student.class, 2);//new method //this method is called eager loading where we need to use print statement to print the data 
		Student d3 =session.byId(Student.class).getReference(3);//for this method  we dont have to use print statement this is called lazy loading 
		
		System.out.println(d2);
		
		transaction.commit();
		
		
		
	}

}
