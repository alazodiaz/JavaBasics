package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Andrea";
		String Last="Lazo";
		char letter='A';
		String city="Falls Church";
		String state="Virginia";
		String phone="703-000-0000";
		
		
		System.out.println("My name is "+ name+" "+Last);
		System.out.println("I am a "+letter+" student");
		System.out.println("I live in a "+city+","+state);
		System.out.println("And my phone number is "+phone);
		
		city="Fairfax";
		state="Montana";
		letter='B';
		phone="202-221-2200";
		
		
		System.out.println("My name is "+ name+" "+Last);
		System.out.println("I am a "+letter+" student");
		System.out.println("and I moved to a new city "+city+",in "+state);
		System.out.println("My new number is "+phone);
				
		
		
		//Rules for Identifiers =names (variables,method
		//1. cannot use keywords as identifiers
		//ex) String new="Hello"; ->error
		
		//2. cannot have spaces in identifiers 
		//ex)String last name="Smith";
		
		//identifiers cannot start w/ numbers
		
		// int 1number=123; ->error
		int number1=123; //number can be anywhere after first character
				
		/*identifiers cannot contain any special characters
		 * boolean hello!=true;-->wrong/error
		 * char #chara='A'; -> not allowed 
		 * 	
		 * except $ or _	
		 */
		double $price=9.98;
		float _price1=1.99F;
		
		
		/*
		 * Naming Conventions
		 * 
		 * class should start with uppercase and follow camelcasing method
		 * 
		 * variables should start w/ lowercase and follow camelcasing
		 */
		
		String Weather="hot";
		String myWeather="cold";

	}

}
