package com.lti.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lti.entity.Customer;
import com.lti.entity.CustomerDao;

public class CustomerDaoTest {

	@Test
	public void testAdd() {
		Customer c = new Customer();
		c.setName("rima");
		c.setEmail("rima@gmail.com");
		c.setCity("mumbai");
	    //temporalValues.setLocalDate(LocalDate.parse("2017-11-15"));
		
			 c = new Customer();
				c.setName("sneha");
				c.setEmail("sneha@gmail.com");
				c.setCity("ooty");
				
				
					 c = new Customer();
						c.setName("syed");
						c.setEmail("syed@gmail.com");
						c.setCity("chennai");
						
						 c = new Customer();
							c.setName("riya");
							c.setEmail("riya@gmail.com");
							c.setCity("mumbai");
				CustomerDao dao = new CustomerDao();
        dao.databaseAdd(c);
		}
	
	@Test
	public void testFetch() {
		CustomerDao dao = new CustomerDao();
		Customer cust = dao.fetchAll(21);
		
		System.out.println(cust.getName());
		System.out.println(cust.getEmail());
		//System.out.println(cust.getDateOfBirth());
		System.out.println(cust.getCity());
	}
	@Test
	public void testupdate() {
		CustomerDao dao = new CustomerDao();
		Customer cust = dao.fetchAll(1);

		cust.setCity("delhi");
		dao.update(cust);

	}
}
