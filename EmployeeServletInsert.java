package com.lti.minor.project2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/EmployeeServletInsert")
public class EmployeeServletInsert extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 EmployeeDao dr= new EmployeeDao();
		  Employee emp = new Employee();
		  emp.setEid( Integer.parseInt(request.getParameter("eid")));
		  Employee  employee= dr.insert(emp);
	
       try {
				    HttpSession session = request.getSession();
					session.setAttribute("insertEmps",employee);
					response.sendRedirect("InsertEmployee.jsp");
				}
			   catch (Exception e1) {
				     throw new ServletException("problem encountered while accessing  DAO",e1);
				}
             
			
	}
	

}
