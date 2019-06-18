package com.lti.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	
    public RegisterServlet() {
          }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		 String name = request.getParameter("name");
		  String email = request.getParameter("email");
		  String city = request.getParameter("city");
		  String password = request.getParameter("password");
		  //-----------To Insert
		  Register rg = new Register();
			DatabaseRegister dbmgr= new DatabaseRegister();
			   dbmgr.insert(rg);
			 
		  
		  /*
 //-----------To Display
	DatabaseRegister dbmgr= new DatabaseRegister();
	  boolean display = dbmgr.display();
	 
			
		  } */


}
}
