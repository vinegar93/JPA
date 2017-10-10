package cn.hwd.jpa.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

import cn.hwd.jpa.entity.Department;
import cn.hwd.jpa.entity.Employee;

public class ManyToOneTest {

	@Test
	public void save() {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA07");
	   	EntityManager entitymanager = emfactory.createEntityManager();
	   	entitymanager.getTransaction().begin();
	   	Department department = new Department();
	   	department.setName("Development");
	   	entitymanager.persist(department);
	   	Employee employee1 = new Employee();
	   	employee1.setName("Tom");
	   	employee1.setDepartment(department);
	   	entitymanager.persist(employee1);
	   	Employee employee2 = new Employee();
	   	employee2.setName("Jerry");
	   	employee2.setDepartment(department);
	   	entitymanager.persist(employee2);
	   	entitymanager.getTransaction().commit();
	   	entitymanager.close();
	   	emfactory.close();
	}

}
