package com.lti.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
	
    
	
	public Employee display(int empno) {
	 
		
		Connection con = null;
		PreparedStatement st = null;
		 ResultSet rs = null;
		
		
	    //    List<Employee> list=new ArrayList<Employee>();  
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
			 String sql="select * from emp where empno=?";
				
			 
			   st=con.prepareStatement(sql);
			   
			   st.setInt(1, empno);
			   rs = st.executeQuery();
			   
			   rs.next();
			   
			   Employee emp = new Employee();
			   
			   emp.setEmpno(rs.getInt(1));
			   emp.setEname(rs.getString(2));
			   emp.setJob(rs.getString(3));
			   emp.setMgr(rs.getInt(4));
			   emp.setHiredate(rs.getString(5));
			   emp.setSal(rs.getInt(6));
			   emp.setDeptno(rs.getInt(7));
			   
			   return emp;
			
		}
		catch(ClassNotFoundException e){
					
					System.out.println("JDBC driver not found");
					
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
				finally {
					
					try {
						con.close();
					}
					catch(Exception e) {
						
					}
				}
		return null;
		
	}
}
		
