package com.lti.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

		public class DatabaseRegister {

			public void insert(Register rg) {
			Connection con = null;
			PreparedStatement st = null;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");

				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
				 String sql="insert into register values(?,?,?,?)";
					
				    st=con.prepareStatement(sql);
				    
				    st.setString(1,rg.getName());
					st.setString(2, rg.getEmail());
					st.setString(3, rg.getCity());
					st.setString(4, rg.getPassword());
				System.out.println("Running");
					st.executeUpdate();
					System.out.println("Inserted Succesfully");
				
			

				// st.executeQuery();
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
			public void display(Register rg) {
				Connection con = null;
				PreparedStatement st = null;
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");

					con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
					 String sql="select * from register";
						
					    st=con.prepareStatement(sql);
					    ResultSet rs = st.executeQuery();
					   
				
					// st.executeQuery();
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
			
				
				

				
