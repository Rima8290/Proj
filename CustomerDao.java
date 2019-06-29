package com.lti.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CustomerDao {

	 public void databaseAdd(Customer customer) {
		 //step 1 (load/create EntityManagerFactory object)
		 //during this step persistence.xml is read
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracleTest");
		 
		 //step 2 (load/create EntityManager object)
		 EntityManager em = emf.createEntityManager();
	     
		 //step 3 (start/participate in a transaction)
		 EntityTransaction tx = em.getTransaction();
		 tx.begin();
		 
		 // now we can insert/update/delete/select whatever we want
		 em.persist(customer);  // persist method generates insert query
		 
		 tx.commit();
		 
		 //below code should in finally block
		 em.close();
		 emf.close();
	 }
	 public Customer fetchAll(int custId) {
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracleTest");
		 EntityManager em = emf.createEntityManager();
		 Customer c = em.find(Customer.class, custId);
		 em.close();
		 emf.close();
		 
		 return c;
		 
		 	 }
	 public Customer update( Customer customer) {
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracleTest");
		 EntityManager em = emf.createEntityManager();
		 EntityTransaction tx = em.getTransaction();
		 tx.begin();
		 em.merge(customer);
		 tx.commit();
		 em.close();
		 emf.close();
		 
	 return customer;

	 }
}