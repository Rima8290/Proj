package com.lti.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToDB {
	public static void main(String[] args) {
		
		Connection con=null;
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url="jdbc:oracle:thin:@localhost:1521:XE";
			String user="hr";
			String pass="hr";
			con=DriverManager.getConnection(url,user,pass);
			
			System.out.println("Connected Successfully !!!");
			
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
	}

}

		