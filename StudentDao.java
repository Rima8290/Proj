package com.lti.minorProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
	public void add(Student st) { 
	

		 Connection conn = null;
		 PreparedStatement stmt = null;
		 
		   try {
			   Class.forName("oracle.jdbc.driver.OracleDriver");
			   String url = "jdbc:oracle:thin:@localhost:1521:XE";
			   String user = "hr";
			   String password = "hr";
			   conn = DriverManager.getConnection(url,user,password);
			   System.out.println("the database is connected successfully");
			   String sql = "insert into  result values(?,?,?,?,?)";
			   stmt = conn.prepareStatement(sql);
			   
			   stmt.setInt(1,st .getRollno());
			   stmt.setString(2,st .getFname());
			   stmt.setString(3,st .getLname());
			   stmt.setString(4, st.getCourse());
			   stmt.setString(5, st.getResult());
			   stmt.executeUpdate(); 
		   }
		   catch(ClassNotFoundException e) {
			     System.out.println("The driver is not found.....");
			     
		   }
		   catch(SQLException e) {
			   e.printStackTrace( );
		   }
		   finally {
			        try {  conn.close( );}  
			        catch(Exception e)  {    }
		   }
		 }

	public void insert(Student st) {
	
		
	}



	   
	//fetch data

public List<Student> fetchAll() {
		   Connection conn = null; 
		   PreparedStatement stmt = null; 
		   ResultSet rs = null;
		   
		   
		   try {
			   Class.forName("oracle.jdbc.driver.OracleDriver");
			   String url = "jdbc:oracle:thin:@localhost:1521:XE";
			   String user = "hr";
			   String pass = "hr";
			   conn = DriverManager.getConnection(url,user,pass);
			  
			   String sql = "select * from Result where rollno >= ?";
			   stmt = conn.prepareStatement(sql);
			   
			  
			   rs = stmt.executeQuery();		   
			   
			   List<Student> students = new ArrayList<Student>();
			   while(rs.next()) {
				   Student s = new Student();
				    s.setRollno(rs.getInt(1));
				    s.setFname(rs.getString(2));
				    s.setLname(rs.getString(3));
				    s.setCourse(rs.getString(4));
				    s.setResult(rs.getString(5));
				    students.add(s);
			   }
			   return students;
		   }
		   catch(ClassNotFoundException e) {
			     System.out.println("JDBC driver not found");
			     
		   }
		   catch(SQLException e) {
			   e.printStackTrace( );
		   }
		   finally {
			        try {  conn.close( );
			        }  
			        catch(Exception e)  {    }
		   }
		   return null;
		   }

		   



	//delete data

/*	Connection conn = null; 
	PreparedStatement stmt = null;{ 

	try{
		
		   Class.forName("oracle.jdbc.driver.OracleDriver");
		   String url = "jdbc:oracle:thin:@localhost:1521:XE";
		   String user = "hr";
		   String pass = "hr";
		   conn = DriverManager.getConnection(url,user,pass);
	       String sql = "delete from Result where rollno = 23";
	       stmt = conn.prepareStatement(sql);
	       stmt.executeUpdate();
	}
	catch(ClassNotFoundException e2) {
	    System.out.println("JDBC driver not found");
	    
	}
	catch(SQLException e) {
	  e.printStackTrace( );
	}
	finally {
	       try {  conn.close( );}   catch(Exception e)  {    }
	}
	}*/ 
	
	}

