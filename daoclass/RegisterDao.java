package com.lti.daoclass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.lti.entity2.Register;

public class RegisterDao {

	public void save(Register register) {
		Connection conn = null;
		 PreparedStatement stmt = null;
		 
		   try {
			   Class.forName("oracle.jdbc.driver.OracleDriver");
			   String url = "jdbc:oracle:thin:@localhost:1521:XE";
			   String user = "hr";
			   String password = "hr";
			   conn = DriverManager.getConnection(url,user,password);
			   System.out.println("the database is connected successfully");
			   String sql = "insert into register values(?,?,?,?)";
			   stmt = conn.prepareStatement(sql);
			   
			   stmt.setString(1,register.getName());
			   stmt.setString(2, register.getEmail());
			   stmt.setString(3,register.getUsername());
			   stmt.setString(4,register.getPassword());
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
	

}
