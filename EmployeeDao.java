package com.lti.minor.project2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDao {

	public Employee display(int eid) {
	 
		
		Connection con = null;
		PreparedStatement st = null;
		 ResultSet rs = null;
		
		//-------To display
	    
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
			 String sql="select * from GlobalTech where empno=?";
				
			 
			   st=con.prepareStatement(sql);
			   
			   st.setInt(1, eid);
			   rs = st.executeQuery();
			   
			   rs.next();
			   
			   Employee emp = new Employee();
			   
			   emp.setEid(rs.getInt(1));
			   emp.setFname(rs.getString(2));
			   emp.setLname(rs.getString(3));
			  
			   emp.setDoj(rs.getString(4));
			   emp.setDept(rs.getString(6));
			 
			   
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
  
//-------To insert
  public Employee insert(Employee e) {
	 
		
		Connection con = null;
		PreparedStatement st = null;
		 ResultSet rs = null;
		// int status=0;
		
	   
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
			 String sql="insert into GlobalTech(eid,fname,lname,doj,dept) values(?,?,?,?,?) ";
			 		        
                           st.setInt(1,e.getEid());   
			 		       st.setString(2,e.getFname()); 
			 		       st.setString(3,e.getLname()); 
			 		       st.setString(4,e.getDoj());  
			 	      st.setString(5,e.getDept());  
			 	    st.executeUpdate(); 
			 		
				
			 
			   st=con.prepareStatement(sql);
			   
			
			   
			   
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
		return null;
}
  
//---------To update


public Employee update(Employee e){  
   
    Connection con = null;
	PreparedStatement st = null;
	 ResultSet rs = null;
	
		try { con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
	 String sql="update GlobalTech set eid =?,fname=?,lname=?,doj=?,dep=? where eid=?";  
	 st.setInt(1,e.getEid());   
      st.setString(2,e.getFname()); 
      st.setString(3,e.getLname()); 
      st.setString(4,e.getDoj());  
      st.setString(5,e.getDept()); 
      
     st.executeUpdate();  
    
     st=con.prepareStatement(sql);

}
 
	catch(SQLException exup) {
		exup.printStackTrace();
	}
	finally {
		
		try {
			con.close();
		}
		catch(Exception exup) {
			
	} 
		
}
		 return null; 
}

//-------To Delete
	
 public Employee delete(Employee e) {
	 
		
		Connection con = null;
		PreparedStatement st = null;
		 ResultSet rs = null;
		
try{  
   
    con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
    String sql="delete from register where id=?";  
    st.setInt(1,e.getEid());  
    st.executeUpdate();  
}catch(Exception exd){System.out.println(exd);}  

return null; 
}  		        
 
}

		