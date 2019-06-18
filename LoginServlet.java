package com.lti.user;
import java.io.IOException;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/LoginServlet.com")
public class LoginServlet extends HttpServlet {
	
	  
	
	  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//read form data
		  String username = request.getParameter("username");
		  String password = request.getParameter("password");
		/*  
          int sum;
          int x,y;
          String a = request.getParameter("num1");
          String b = request.getParameter("num2");
          x = Integer.parseInt(a);
          y = Integer.parseInt(b);
          
          sum = x + y;
          PrintWriter out = response.getWriter()
          out.println("The sum is" + sum);
      

		  
		  
		  if(username.equals("Riya") && password.equals("123")) {*/
		//  InMemoryUserManager mgr= new InMemoryUserManager();
		DatabaseUserManager dbmgr= new DatabaseUserManager();
		  boolean isValid = dbmgr.isValidUser(username,password);
		  if(isValid==true) {
			  String rememberMe = request.getParameter("hello");
			  if(rememberMe != null && rememberMe.equals("yes")) {
				  
				  String encodedUsername = Base64.getEncoder().encodeToString(username.getBytes("utf-8"));
				  String encodedPassword = Base64.getEncoder().encodeToString(password.getBytes("utf-8"));
				  Cookie c1= new Cookie("username",encodedUsername);
				  Cookie c2 = new Cookie("password",encodedPassword);
				  c1.setMaxAge(60 * 60);            //1 hour
				  c2.setMaxAge(60 * 60);
				  response.addCookie(c1);
				  response.addCookie(c2);
				  
			  }
	   response.sendRedirect("Welcom.html");
			  
		  }  
			  else
				  response.sendRedirect("login.html");
				  
		  
	}
	  
	}


