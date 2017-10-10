package cn.hwd.jpa.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

import cn.hwd.jpa.entity.Department;
import cn.hwd.jpa.entity.Employee;

public class OneToOneTest {

	@Test
	public void save() {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA09");
	   	EntityManager entitymanager = emfactory.createEntityManager();
	   	entitymanager.getTransaction().begin();
	   	Department department = new Department();
	   	department.setName("Development");
	   	entitymanager.persist(department);
		Employee employee = new Employee();
	   	employee.setName("Tom");
	   	employee.setDepartment(department);
	   	entitymanager.persist(employee);
	   	entitymanager.getTransaction().commit();
	   	entitymanager.close();
	   	emfactory.close();
	}

}
