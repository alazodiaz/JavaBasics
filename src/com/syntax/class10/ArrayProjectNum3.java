package com.syntax.class10;

public class ArrayProjectNum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a 2D array of integer values. Print the sum of
		//all numbers.
		
		int [] [] arr= {
			{10,20,30,40,50,60,70,80,90,100},
			{100,200,300,400,500},
			{5,10,15,20,25}
			
		};
		
		int sum=0;
		
		for (int c=0; c<arr.length; c++) {
			for (int r=0; r<arr[c].length; r++ ) {
				sum= sum+ arr[c][r];
			}
			
		}
		
		System.out.println(sum);
		
		
		
		System.out.println("-------------another way----------");
		
		int sum1=0;
		
		for(int [] ar:arr) {
			for(int num:ar) {
				sum1+=num;
			}
		}
		System.out.println(sum1);

	}

}
