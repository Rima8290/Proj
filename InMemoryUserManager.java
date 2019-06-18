package com.lti.user;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InMemoryUserManager {
	
	private List<User> users;
	
      public InMemoryUserManager() {
              users= new ArrayList<User>();
              users.add(new User("Sanna","123",false));
              users.add(new User("Sriya","12",true));
              users.add(new User("Sam","125",true));
}

  
      public boolean isValidUser(String username, String password) {
    	  for(User user: users)
    		  if(user.getUsername().equals(username))
    			  if(user.getPassword().equals(password))
    				  if(user.isActive())
    					  return true;
    	  return false;    	  
}
    /*  public static void main(String[] args) {
    	  
    	  UserManager mgr= new UserManager();
    	  boolean isValid = mgr.isValidUser("Sanna","120");
    	  System.out.println(isValid);
   
      }*/
		
	}
