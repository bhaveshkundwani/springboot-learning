package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementExample {

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
		
		int s_id = 103;
	    String s_name = "Mike";
	    int marks = 92;
				
		String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "bhavesh18";
        
        String sql = "INSERT INTO student VALUES (?, ?, ?)";
                
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection established ");	
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setInt(1, s_id);
        preparedStatement.setString(2, s_name);
        preparedStatement.setInt(3, marks);
        preparedStatement.execute();
        
        con.close();
        System.out.println("Connection closed ");

	}

}
