package com.faceprep.jfs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class View {

	public void view() {
		Scanner in = new Scanner(System.in);
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");  //searching for jdbc driver class
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "bhidoni2812#"); //getting connection with msql database
		Statement stmt = conn.createStatement();
		
		System.out.println("Enter the crime type to view details");
		String crime = in.next();
		String q = "SELECT * FROM criminal_record WHERE crime = '" + crime + "' ";
		ResultSet rs = stmt.executeQuery(q);
		  if (rs.next())
		   {
			  System.out.println("Name : " + rs.getString(1));
			  System.out.println("Crime : " + rs.getString(2));
			  System.out.println("Blood Group : " + rs.getString(3));
			  System.out.println("Jail Name : " + rs.getString(4));
			  System.out.println("Cell Number : " + rs.getInt(5));
			  System.out.println("Date & Time : " + rs.getTimestamp(6));
		   }
		  else
		   {
			  System.out.println("No such Record Found");
		   }
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
