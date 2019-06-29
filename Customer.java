package com.lti.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "TBL_CUST")

public class Customer {

	@Id //pk
	@GeneratedValue
	@Column(name= "CUST_ID")
	
	private int id;
	private String name;
	
	@Column(unique= true)
	private String email;
	
	
	private Date DateofBirth;
	private String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDateofBirth() {
		return DateofBirth;
	}
	public void setDateofBirth(Date dateofBirth) {
		DateofBirth = dateofBirth;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
