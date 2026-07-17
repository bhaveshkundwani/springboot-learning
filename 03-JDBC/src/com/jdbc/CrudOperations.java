package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudOperations {

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
        
        //String sql = "SELECT * FROM student";
        //String sql = "INSERT INTO student VALUES (5, 'Alia', 91)";
        //String sql = "UPDATE student SET s_name = 'Max' where s_id = 5";
        String sql = "DELETE FROM student WHERE s_id = 5";
        
        //Class.forName("org.postgresql.Driver");
        
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection established ");	
        Statement st = con.createStatement();
        st.execute(sql);
        
        con.close();
        System.out.println("Connection closed");

        
	}

}
