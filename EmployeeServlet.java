package com.lti.assignment;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lti.assignment.EmployeeException;
import com.lti.assignment.Employee;


@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  
		 // Employee e= new Employee(empno,ename,job,mgr,hiredate,sal,comm,deptno);
		
		  EmployeeDao dr= new EmployeeDao();
		  
		  int  employeeno = Integer.parseInt(request.getParameter("empno"));
		  
		  
		  Employee  employee= dr.display(employeeno);
	
		
			   try {
				//	List<Employee> employees = dr.display(ep);
							
					HttpSession session = request.getSession();
					
					session.setAttribute("currentEmps",employee);
					
					response.sendRedirect("EmployeeSearch.jsp");
				}
			   catch (Exception e1) {
				     throw new ServletException("problem encountered while accessing  DAO",e1);
				}
               
			
	}

	
	
}
