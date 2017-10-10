package cn.hwd.jpa.test;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

import cn.hwd.jpa.entity.Cla;
import cn.hwd.jpa.entity.Teacher;

public class OneToOneTest {

	@Test
	public void save() {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA10");
	   	EntityManager entitymanager = emfactory.createEntityManager();
	   	entitymanager.getTransaction().begin();
	   	Cla cla1=new Cla(0, "1st", null);
	   	Cla cla2=new Cla(0, "2nd", null);
	   	entitymanager.persist(cla1);
	   	entitymanager.persist(cla2);
	   	Set<Cla> clas1 = new HashSet<Cla>();
	   	clas1.add(cla1);
	   	clas1.add(cla2);
	   	Set<Cla> clas2 = new HashSet<Cla>();
	   	clas2.add(cla1);
	   	clas2.add(cla2);
	   	Teacher teacher1 = new Teacher(0, "Tom", clas1);
	   	Teacher teacher2 = new Teacher(0, "Jerry", clas2);
	   	entitymanager.persist(teacher1);
	   	entitymanager.persist(teacher2);
	   	entitymanager.getTransaction().commit();
	   	entitymanager.close();
	   	emfactory.close();
	}

}
