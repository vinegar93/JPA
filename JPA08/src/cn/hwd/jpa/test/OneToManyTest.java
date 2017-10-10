package cn.hwd.jpa.test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

import cn.hwd.jpa.entity.Department;
import cn.hwd.jpa.entity.Employee;

public class OneToManyTest {

	@Test
	public void save() {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA08");
	   	EntityManager entitymanager = emfactory.createEntityManager();
	   	entitymanager.getTransaction().begin();
	   	Employee employee1 = new Employee();
	   	employee1.setName("Tom");
	   	entitymanager.persist(employee1);
	   	Employee employee2 = new Employee();
	   	employee2.setName("Jerry");
	   	entitymanager.persist(employee2);
	   	List<Employee> employees = new ArrayList<Employee>();
	   	employees.add(employee1);
	   	employees.add(employee2);
	   	Department department = new Department();
	   	department.setName("Development");
	   	department.setEmployees(employees);
	   	entitymanager.persist(department);
	   	entitymanager.getTransaction().commit();
	   	entitymanager.close();
	   	emfactory.close();
	}

}
