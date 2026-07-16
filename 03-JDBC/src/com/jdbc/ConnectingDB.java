package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectingDB {

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
        // Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection established ");		
		
	}

}
