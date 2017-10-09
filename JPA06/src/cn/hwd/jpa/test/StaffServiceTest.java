package cn.hwd.jpa.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

import cn.hwd.jpa.entity.NonTeachingStaff;
import cn.hwd.jpa.entity.TeachingStaff;

public class StaffServiceTest {

	@Test
	public void save() {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA06");
	   	EntityManager entitymanager = emfactory.createEntityManager( );
	   	entitymanager.getTransaction( ).begin( );
	   	TeachingStaff ts = new TeachingStaff(1, "Gopal", "MSc MEd", "Maths");
	   	NonTeachingStaff nts = new NonTeachingStaff(2, "Satish", "Accounts");
	   	entitymanager.persist(ts);
	   	entitymanager.persist(nts);
	   	entitymanager.getTransaction().commit();
	   	entitymanager.close();
	   	emfactory.close();
	}

}
