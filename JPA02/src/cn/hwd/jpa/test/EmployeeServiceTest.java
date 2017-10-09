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
	public void commonTest() {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA02");
	   	EntityManager entitymanager = emfactory.createEntityManager();
	   	String sql = "select e.name from Employee e";
	   	Query query = entitymanager.createQuery(sql);
	   	List<String> list = query.getResultList();
	   	for(String e : list) {
	   		System.out.println(e);
	   	}
	}
	
	@Test
	public void maxTest() {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA02");
	   	EntityManager entitymanager = emfactory.createEntityManager();
	   	String sql = "select max(e.salary) from Employee e";
	   	Query query = entitymanager.createQuery(sql);
	   	Double result = (Double) query.getSingleResult();
	   	System.out.println(result);
	}
	
	@Test
	public void betweenTest() {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA02");
	   	EntityManager entitymanager = emfactory.createEntityManager();
	   	String sql = "select e from Employee e where e.salary between 6000 and 7000";
	   	Query query = entitymanager.createQuery(sql);
	   	List<Employee> list = (List<Employee>) query.getResultList();	 
   	   	for(Employee e : list) {
   	   		System.out.println(e);
   	   	}
	}
	
	@Test
	public void likeTest() {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA02");
	   	EntityManager entitymanager = emfactory.createEntityManager();
	   	String sql = "select e from Employee e where e.name like 'J%'";
	   	Query query = entitymanager.createQuery(sql);
	   	List<Employee> list = (List<Employee>) query.getResultList();	 
   	   	for(Employee e : list) {
   	   		System.out.println(e);
   	   	}
	}
	
	@Test
	public void orderTest() {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA02");
	   	EntityManager entitymanager = emfactory.createEntityManager();
	   	String sql = "select e from Employee e order by e.name asc";
	   	Query query = entitymanager.createQuery(sql);
	   	List<Employee> list = (List<Employee>) query.getResultList();	 
   	   	for(Employee e : list) {
   	   		System.out.println(e);
   	   	}
	}
	
}
