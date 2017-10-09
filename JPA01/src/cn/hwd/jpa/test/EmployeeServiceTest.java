package cn.hwd.jpa.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

import cn.hwd.jpa.entity.Employee;

public class EmployeeServiceTest {

	@Test
	public void createEmployee() {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA01");
	   	EntityManager entitymanager = emfactory.createEntityManager();
	   	entitymanager.getTransaction().begin();
	   	
	   	Employee employee = new Employee(); 
	   	employee.setId(1);
	   	employee.setName("Jerry");
	   	employee.setSalary(6999);
	   	entitymanager.persist(employee);
	   	entitymanager.getTransaction().commit();
	   	
	   	entitymanager.close();
	   	emfactory.close();
	}
	
	@Test
	public void deleteEmployee() {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA01");
	   	EntityManager entitymanager = emfactory.createEntityManager();
	   	entitymanager.getTransaction().begin();
	   	
	   	Employee employee=entitymanager.find(Employee.class, 1);
	   	entitymanager.remove(employee);
	   	entitymanager.getTransaction().commit();
	   	
	   	entitymanager.close();
	   	emfactory.close();
	}
	
	@Test
	public void findEmployee() {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA01");
	   	EntityManager entitymanager = emfactory.createEntityManager();
	   	
	   	Employee employee=entitymanager.find(Employee.class, 1);
	   	System.out.println(employee);
	}
	
	@Test
	public void updateEmployee() {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA01");
	   	EntityManager entitymanager = emfactory.createEntityManager();
	   	entitymanager.getTransaction().begin();
	   	
	   	Employee employee=entitymanager.find(Employee.class, 1);
	   	//before update
	   	System.out.println(employee);
	   	employee.setSalary(7200);
	   	entitymanager.getTransaction().commit();
	    //after update
	   	System.out.println(employee);
	   	
	   	entitymanager.close();
	   	emfactory.close();
	}

}
