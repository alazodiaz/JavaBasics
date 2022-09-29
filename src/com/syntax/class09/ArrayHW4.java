package com.syntax.class09;

public class ArrayHW4 {

	public static void main(String[] args) {
		
		
		// 4. From an array of integer elements find the largest number.
		
		int [] num ={20, -25, 30,350, 40,45,4000};
		int largest=0;
		
		for (int i=0; i<num.length; i++) {
			if (num[i]>largest) {
				largest=num[i];
			}
		}
		System.out.println(largest);


	}

}
