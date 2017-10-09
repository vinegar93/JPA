package cn.hwd.jpa.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.junit.Test;

import cn.hwd.jpa.entity.Employee;

public class EmployeeServiceTest {
	
	@Test
	public void namedQueryTest() {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA03");
	   	EntityManager entitymanager = emfactory.createEntityManager();
	   	Query query = entitymanager.createNamedQuery("findEmployeeById");
	   	query.setParameter("id", 1);
	   	List<Employee> list = query.getResultList();
	   	for(Employee e : list) {
	   		System.out.println(e);
	   	}
	}
	
}
