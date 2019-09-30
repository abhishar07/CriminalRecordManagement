package com.faceprep.jfs;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration {

	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
		 String take = null;
	      
		 do
		  {
		   System.out.println("Welcome to Registration Page\n\nEnter your Name:");
	       
	       String name = in.nextLine();
	       Pattern p = Pattern.compile("[^0-9]*");
	       Matcher m = p.matcher(name);
	       if(m.find() && m.group().equals(name))
	       {
	    	   System.out.println("Enter Gmail ID:");
	    	   String mail = in.next();
	    	   Pattern p1 = Pattern.compile("^[a-z0-9._]{5,45}$");
	           Matcher m1 = p1.matcher(mail);
	           if(m1.find())
	           {
	        	   
	        	   System.out.println("Enter your Mobile Number :");
	        	   String mobile = in.next();
	        	   Pattern p2 = Pattern.compile("^(?:[0-9] ?){6,14}[0-9]$");
	        	   Matcher m2 = p2.matcher(mobile);
	        	   if(m2.find() && m2.equals(m2))
	        	   {
	        		   System.out.println("Set your password ::\nNOTE:- Must contain Atleast one Uppercase letter, one Lowercase letter, one Special Character ,Except Numbers and Space.");
	        		   String password = in.next();
	        		   Pattern p3 = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})");
	        		   Matcher m3 = p3.matcher(password);
	        		   if(m3.find() && m3.group().equals(password))
	        		   {
	        			   
	        			   System.out.println(" Password  Generated Sucessfully ");
	        		   }
	        		   else
	        		   {
	        		   
	        		   System.out.println("set Your password according to Note!!");
	        	   }
	        	   }
	        	   else
	        	   {
	        		   System.out.println("Enter valid mobile number");
	        	   }
	           }
	           else
	           {
	        	   System.out.println("Please enter Valid Gmail ID");
	           }
	       }
	       else
	       {
	    	   System.out.println("Please enter valid name must contains  only alphabets");
	       }
	       System.out.println("TO continue type yes\n");
           take = in.next();
	}while(take.equals("yes"));
			
		in.close();		
		}

	}




