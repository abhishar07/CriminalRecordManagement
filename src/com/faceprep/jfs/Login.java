package com.faceprep.jfs;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		
		{
			String take = null;
			Scanner in = new Scanner(System.in);
			
			do
			{
			int choice = 0 ;
			
			System.out.println("Welcome to Login Page:\n\nEnter Your GmailID");
			String user = in.next();
			Pattern p = Pattern.compile("^[a-z0-9._]{5,45}$");
			Matcher m = p.matcher(user);
			if(m.find())
			{
				System.out.println("Enter your Password:");
				String password = in.next();
				Pattern p1 = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})");
				Matcher m1 = p1.matcher(password);
				if(m1.find() && m1.group().equals(password))
				{
					System.out.println("Sucessfully Completed login\n\n1) Check Connection\n2) Insert Data\n3)TO View  Records4)Update Records\n5)Delete Records");
					choice = in.nextInt();
					switch(choice)
					{
					case 1:
						  JDBC con = new JDBC();
						  con.Connection();
						  System.out.println("\n");
					break;
					
					case 2 :
						Insert into = new Insert();
						into.insert();
						System.out.println("\n");
						break;
					
					case 3 :
						View vw = new View();
						vw.view();
						System.out.println("\n");
						break;
						
					case 4 :
						Update u = new Update();
						u.update();
						System.out.println("\n");
						break;
						
					case 5 :
						Delete d = new Delete();
						d.delete();
						System.out.println("\n");
						break;
						
						default :
							System.out.println("Incorrect option");
							System.out.println("\n");
							break;
					
					}
				}
				else
				{
					System.out.println("Invalid password");
				}
			}
			else
			{
				System.out.println("Invalid Username ");
			}
			System.out.println("TO continue type yes\n");
	           take = in.next();
		}while(take.equals("yes"));
		
		in.close();
		}
		

	}

}
