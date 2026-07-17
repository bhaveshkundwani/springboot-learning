package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ProblemsWithStatement {

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
		
		int s_id = 101;
	    String s_name = "Max";
	    int marks = 48;
				
		String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "bhavesh18";
        
        String sql = "INSERT INTO student VALUES (" + s_id + " , ' " + s_name + " '," + marks + " ) ";
        
        //Class.forName("org.postgresql.Driver");
        
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection established ");	
        Statement st = con.createStatement();
        st.execute(sql);
        
        con.close();
        System.out.println("Connection closed");

        
	}

}
