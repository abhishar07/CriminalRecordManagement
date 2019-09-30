package com.faceprep.jfs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Delete {

	public void delete() {
		Scanner in = new Scanner(System.in);
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");  //searching for jdbc driver class
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "bhidoni2812#"); //getting connection with msql database
			Statement st = conn.createStatement();
			
			System.out.println("Enter jailName & cellNo to DELETE RECORD");
			String jailName = in.next();
			int cellNo = in.nextInt();
			
			String q = "DELETE from criminal_record WHERE jailName = '" + jailName + "' AND cellNo = " + cellNo + " ";
			
			int c = st.executeUpdate(q);
			
			if(c > 0)
			     System.out.println("Deleted successfully");
			else
				 System.out.println("Invalid input");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
