package com.lti.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class TblUserDao {
//import com.lti.training.JDBC.Product;
		
		public void insert(TableUser tu) {
			
			Connection con=null;
			PreparedStatement st=null;
			try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
			        
					con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
				    String sql="select count(*) from TBL_USER where active=1";
				   
				    st=con.prepareStatement(sql);
				   /* 
				    st.setString(1,tu.getUsername());
					st.setString(2, tu.getPassword());
					st.setInt(3, tu.getActive());
					*/
					st.executeQuery();
					System.out.println("Total Number Of Active Users:- " + st.executeQuery());
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
