package com.lti.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.lti.dao.CustomerDao;
import com.lti.entity.Customer;

public class CustomerTest {
	Calendar cal = Calendar.getInstance();
    
	@Test
	public void testAdd() throws ParseException {
		Customer c=new Customer();
		c.setName("sneha");
		c.setEmail("sne11@gmail.com");
		c.setCity("Mumbai");
		String d="16/10/1995";
		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
		  Date dt=sdf.parse(d);
		    java.sql.Date dob=new java.sql.Date(dt.getTime());
		//c.setDateOfBirth(dateOfBirth); //try this on your own
		c.setDateOfBirth(dob);
		
		CustomerDao dao=new CustomerDao();
		dao.databaseMeAddKaro(c);
	}
@Test
public void testFetch() {
	CustomerDao dao=new CustomerDao();
	Customer cust=dao.databaseIlVangudhal(24);
	
	System.out.println(cust.getName());
	System.out.println(cust.getEmail());
	System.out.println(cust.getDateOfBirth());
	System.out.println(cust.getCity());
}
@Test
public void testUpdate() {
	CustomerDao dao=new CustomerDao();
	Customer cust=dao.databaseIlVangudhal(24);
	cust.setName("Neha");
	dao.databaseIlMembaduthu(cust);
	
	System.out.println(cust.getName());
	System.out.println(cust.getEmail());
	System.out.println(cust.getDateOfBirth());
	System.out.println(cust.getCity());
	
}
}
