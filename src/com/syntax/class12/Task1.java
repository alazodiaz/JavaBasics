package com.syntax.class12;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Accept username, password and confirm 
		 * password from a user and check following 
		 * 
		 * requirements:
		 * 1. Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
		 * 2. Password should be minimum 8 characters, if less → message=”Password is too short”.
		 * 3. Password cannot contain username if so, → message=”Password cannot contain username”.
		 * 4. Password should match confirmed password, if not  → message=“Passwords do not match”.
		 * Only after all requirements met → message “Your username and password has been created”
		 */
		
		String userName="user1";
		String password="pass123";
		String confirmPassword="pass123";
		if (userName.isEmpty() || password.isEmpty()) {
			System.out.println("Username and Password cannot be empty");
		}else if (password.length()<9) {
			System.out.println("Password is too short");
		}else if (password.contains(userName)) {
			System.out.println("Password cannot contain username");
		}else if (!(password.equals(confirmPassword))) {
			System.out.println("Passwords do not match");
		}else
			System.out.println("Your username and password has been created");
		
		System.out.println("--------other way using scanner-----------");	
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter Username");
		userName=scan.next();
		System.out.println("Please enter the password");
		password=scan.next();
		System.out.println("please enter password again");
		confirmPassword=scan.next();
		

	}

}
