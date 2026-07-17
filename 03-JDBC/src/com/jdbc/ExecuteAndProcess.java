package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteAndProcess {

	public static void main(String[] args) throws SQLException {
		
		// steps to connect with database
		
		/*
		 * import package 
		 * load and register 
		 * create connection 
		 * create statement 
		 * execute statement 
		 * process the results 
		 * close
		 */
				
		String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "bhavesh18";
        String sql = "SELECT s_name FROM student WHERE s_id = 1";
        // Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection established ");	
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        String name = rs.getString("s_name");
        System.out.println("Name of the student is " + name);
        con.close();
        System.out.println("Connection closed");

		
	}

}
