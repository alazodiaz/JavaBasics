package com.syntax.class12;

import java.util.Arrays;

public class StringDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="I love java programming";
		
		/*
		 * to CharArray will convert a String to an array of chars
		 */
		
		char[] charArray=str.toCharArray();
		
		System.out.println(charArray[5]); //only prints out one single letter of array
		
		System.out.println(Arrays.toString(charArray));
		
		
		
		int counter=0;
		for (char c:charArray) {
			if (c=='a') {
				counter++;
			}
		}
		
		System.out.println("letter a has appeared "+counter+" times");

	}

}
