package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.lti.entity.Customer;

public class CustomerDao {
	

	public void databaseMeAddKaro(Customer customer) {
		//Step 1. Load/Create EntityManagerFactory object
		//During this step, META-INF/persistence.xml is read
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("oracleTest");
		
		//Step 2. Load/create EntityManager object 
		EntityManager em=emf.createEntityManager();
		
		//Step 3. Start/Participate in a transaction 
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		
		//Now we can insert/update/delete/select whatever you want
		em.persist(customer);	//persist method generate insert query
		tx.commit();
		
		//below code should be in finally block
		em.close();
		emf.close();
		
		}
	public Customer databaseIlVangudhal(int custId) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("oracleTest");
		EntityManager em=emf.createEntityManager();
		
		Customer c=em.find(Customer.class, custId);
		
		em.close();
		emf.close();
		return c;
	}
	public void databaseIlMembaduthu(Customer customer) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("oracleTest");
		EntityManager em=emf.createEntityManager();
		
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		
		em.merge(customer);
		tx.commit();
		
		em.close();
		emf.close();
		
	}
}
