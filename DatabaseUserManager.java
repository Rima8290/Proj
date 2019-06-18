package com.lti.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DatabaseUserManager {

	public boolean isValidUser(String username, String password) {

		Connection con = null;
		PreparedStatement st = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
			String sql = "select username, password from TBL_USER where active=1";

			st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();

			// st.executeQuery();

			while (rs.next()) {
				// Retrieve by column name

				String name = rs.getString(1);
				String pass = rs.getString(2);
				if (rs.getString(1).equals(username))
					if (rs.getString(2).equals(password))
						return true;
				return false;

			}

		} catch (ClassNotFoundException e) {

			System.out.println("JDBC driver not found");

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
