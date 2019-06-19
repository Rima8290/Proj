package com.lti.register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegisterServlet.com")
public class RegisterServlet extends HttpServlet {
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		 String name = request.getParameter("name");
		  String email = request.getParameter("email");
		  String city = request.getParameter("city");
		  String password = request.getParameter("password");
		  //-----------To Insert
		  Register rg = new Register(name,email,city,password);
			DaoRegister dr= new DaoRegister();
	
			dr.insert(rg);
			
			
			
		}

	}
			 
	