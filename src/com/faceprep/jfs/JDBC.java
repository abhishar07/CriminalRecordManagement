package com.faceprep.jfs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {

	public  void Connection()
	{
		Connection conn = null;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");  //searching for jdbc driver class
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jobportal", "root", "bhidoni2812#"); //getting connection with msql database
			
			if(conn != null)
			{
				System.out.println("connection established sucessfully");
			}
			else
			{
				System.out.println("Not connected");
			}
			
		}
		 catch(ClassNotFoundException e) {
			   System.out.println("Driver class is not Found! Exception occured");
		   }
		   catch(SQLException se) {
			   System.out.println(" Exception occured while creating a connection!!");
			   System.out.println(se);
		   }
		   finally {
			        try
			       {
				       conn.close();
			       }
			       catch(SQLException sqlE) {
				       System.out.println("Exception occured while closing a connection");
			        }
			    }

	}

}
