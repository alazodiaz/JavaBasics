package com.syntax.class13;

import java.util.Arrays;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Today is Sunday";
		String day=str.substring(9);
		System.out.println(day);
		System.out.println(str.substring(6,8));
		
		char c=str.charAt(4); //calling the method charAt on str object
		System.out.println();
		
		char[] charArr=str.toCharArray();
		System.out.println(Arrays.toString(charArr)); // show individual characters
		System.out.println(charArr); //prints out as whole sentence
		
		int index=str.indexOf("a");
		System.out.println(index);
		System.out.println(str.indexOf("a", 6)); // start the search from a different point instead of 0

	}

}
