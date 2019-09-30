package com.faceprep.jfs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.util.Scanner;

public class Insert {

	public void insert() {
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");  //searching for jdbc driver class
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "bhidoni2812#"); //getting connection with msql database
			Scanner in = new Scanner(System.in);
			
			System.out.println("Enter the criminal details");
			String  name = in.next();
			String  crime = in.next();
			String  bloodGroup = in.next();
			String  jailName = in.next();
			int cellNo = in.nextInt();
			
			String sql = " INSERT INTO criminal_record VALUES(?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, crime);
			ps.setString(3, bloodGroup);
			ps.setString(4, jailName);
			ps.setInt(5, cellNo);
			ps.setTimestamp(6, new Timestamp(System.currentTimeMillis()));
			
			int status = ps.executeUpdate();
			if(status > 0)
				System.out.println("Sucessfully Inserted");
			else
				System.out.println("do it again");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

 }

