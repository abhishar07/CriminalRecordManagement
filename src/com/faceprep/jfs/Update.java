package com.faceprep.jfs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Update {

	public void update() {
		
		Scanner in = new Scanner(System.in);
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");  //searching for jdbc driver class
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "bhidoni2812#"); //getting connection with msql database
			Statement st = conn.createStatement();
			System.out.println("Choose one of the options:-\n1) Add new Crime\n2) Transfer to another Cell");
			int choice = in.nextInt();
			
			switch(choice)
			{
			
			case 1: 
				System.out.println("Enter crime name");
				String newCrime = in.next();
				System.out.println("Enter previous crime name");
				String crime = in.next();
				
				String q1 = "update criminal_record set crime = '" + newCrime + "' where crime = '" + crime + "' ";
	
				
				st.executeUpdate(q1);
				System.out.println("Updation Completed");
				break;
				
			case 2:
				System.out.println("Enter new Jail name");
				String newJail = in.next();
				System.out.println("Enter previous Jail name");
				String jailName = in.next();
				
				String q2 = "update criminal_record set jailName = '" + newJail + "' where jailName = '" + jailName + "' ";
			
				
				st.executeUpdate(q2);
				System.out.println("Updation Completed");
				break;
				
			default:
				System.out.println("Welcome to CRM");
			
			}
		}
		catch(Exception e)
		{
		  System.out.println(e);
					
		}

	}

}
