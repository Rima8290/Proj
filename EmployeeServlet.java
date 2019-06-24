package com.lti.minor.project2;
  //-----------------------------------------To display
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	 EmployeeDao dr= new EmployeeDao();
		  
		  int  employeeid = Integer.parseInt(request.getParameter("eid"));
		  
		  
		  Employee  employee= dr.display(employeeid);
	
		
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


