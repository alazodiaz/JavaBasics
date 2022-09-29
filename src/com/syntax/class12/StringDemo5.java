package com.syntax.class12;

public class StringDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="I love Java";
		
		/*
		 * charAt returns us the character at specific index example:(2) will print out what's on 2
		 */
		
		System.out.println(str.charAt(2));
		
		/*
		 * use the method below to print all char's one by one 
		 */
		
		for(int i=0; i<str.length(); i++) {
			if(!(str.charAt(i)==' ')) { //Use this to avoid printing the spaces in between sentences 
			System.out.println(str.charAt(i));
			}
		}
	}

}
