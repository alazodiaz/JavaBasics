package com.syntax.class09;

public class ArrayHW3 {

	public static void main(String[] args) {
		
		// 3. Create an array on integers and calculate the sum of all elements in an array
		
		int [] num ={20, 25, 30,35, 40,45,50};
		
		int sum=0;
		
		for (int i=0; i<num.length; i++) {
			sum=sum+num[i];
		}
		System.out.println(sum);

	}

}
