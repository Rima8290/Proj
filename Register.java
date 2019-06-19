package com.lti.register;
public class Register {
	String name;
	String email;
	String city;
	String password;
	
	public Register(String name, String email, String city, String password) {
		super();
		this.name = name;
		this.email = email;
		this.city = city;
		this.password = password;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getCity() {
		return city;
	}
	
	public String getPassword() {
		return password;
	}
	
}



