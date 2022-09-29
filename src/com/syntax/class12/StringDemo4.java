package com.syntax.class12;

public class StringDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Shah";
		
		if(str.equals("Shah")) {
			System.out.println("I found it");
		}
		/*
		 * equals method checks if two strings are exactly the same with exact same case
		 * equalsIgnoreCase checks if two Strings are exactly the same but does not care about the case of letters
		 */
		
		if(str.equalsIgnoreCase("Shah")) {
			System.out.println("I found it");
		}

	}

}
