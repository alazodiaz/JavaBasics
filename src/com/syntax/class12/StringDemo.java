package com.syntax.class12;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//proper way of creating an object
		
		String str=new String("Java");
		
		//simpler and shorter way provided by java creators to make our lives a little easier
		String name="Andrea Lazo The Great"; //Only works for String and Wrapper classes
		
		/*
		 * counts the number of characters in a string including the spaces
		 */
		System.out.println(str.length());
		System.out.println(name.length());
		
		if(name.length()>15) {
			System.out.println("Name can't be more than 15 characters");
		}

	}

}
