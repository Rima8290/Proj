package com.lti.minorProject;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.lti.minorProject.Student;


@WebServlet("/studentServlet.com")
public class studentServlet extends HttpServlet {
	
    public studentServlet() {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 
		 int  rollno = Integer.parseInt(request.getParameter("rollno"));
		  String fname= request.getParameter("fname");
		  String lname = request.getParameter("lname");
		  String course = request.getParameter("course");
		  String result = request.getParameter("result");
		  //-----------To add details of student
		  Student st = new Student();
		  StudentDao dr= new StudentDao();
	      dr.add(st);
	      
	      
	      
		//	dr.fetchAll();
	      //display the records of the student
			 List<Student>  st1= dr.fetchAll();
			
			try {
							
					HttpSession session = request.getSession();
					
					session.setAttribute("currentStudents",st);
					
					response.sendRedirect("student.jsp");
				}
			   catch (Exception e1) {
				     throw new ServletException("problem encountered while accessing  DAO",e1);
				}
               
			
	}
			
			
			
		}


