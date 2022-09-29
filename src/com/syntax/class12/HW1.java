package com.syntax.class12;



public class HW1 {

	public static void main(String[] args) {
		// Create a String and if the String is not empty perform the following: 
		//if the String has an odd number of characters and has 3 or more characters, 
		//print the character in the middle of the String.
		
		String arr= "Hello Wonderful World";
		if (arr.isEmpty()) {
			System.out.println("No Input");
			
		}else if (arr.length()%2==1 && arr.length()>=3) {
			System.out.println("The middle character is: "+arr.charAt(arr.length()/2));
			
		}else 
			System.out.println("Unknown");

	}

}
