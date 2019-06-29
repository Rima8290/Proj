package com.lti.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.lti.entity.Register;

public class RegisterDao {

	public void save(Register register) {
		Connection con = null;
		PreparedStatement st = null;
			try {
				InputStream is = this.getClass().getClassLoader().getResourceAsStream("dev-db.properties");
			    Properties dbprops = new Properties();
			  
			    try {
					dbprops.load(is);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    
			    Class.forName(dbprops.getProperty("driver"));
			    	con = DriverManager.getConnection(dbprops.getProperty("url"),
			    			                                               dbprops.getProperty("user"),
			    			                                               dbprops.getProperty("pass"));
			                                                                                      
			    	                           
			 String sql="insert into Reg(name,email,username,password) values(?,?,?,?)";
			      st=con.prepareStatement(sql);
			 	  st.setString(1,register.getName()); 
			      st.setString(2,register.getEmail());
			      st.setString(3,register.getUsername());
			      st.setString(4,register.getPassword());
			      
                         
			 	    st.executeUpdate(); 
			 	    
			 	    
			 	    System.out.println("Success");
			 		
				}
		catch(ClassNotFoundException ex){
					
					System.out.println("JDBC driver not found");
					
				}
				catch(SQLException ex) {
					ex.printStackTrace();
				}
				finally {
					
					try {
						con.close();
					}
					catch(Exception ex) {
						
					
				}
		
		
				}
	}

	}
