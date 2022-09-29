package com.syntax.class12;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="I love Java";
		System.out.println(str);
		
		/*
		 * Remove Spaces before and after the String but not the ones which are present in between
		 */
		
		System.out.println(str.trim());
		
		String str2="Java is very easy";
		
		
		  /*startsWith=> checks if a String starts with a specific letter or word
	         * endsWith=> checks if a String Ends with a specific letter or word
	         * contains=> checks if a String Contains a specific letter or word
	         */
		
		System.out.println(str2.startsWith("Java"));
		System.out.println(str2.endsWith("y"));
		
		/*
		 * method chaining -helps us call multiple methods on a single line one method after another
		 * also known as concatenation of methods
		 */
		System.out.println(str2.toLowerCase().contains("very"));

	}

}
