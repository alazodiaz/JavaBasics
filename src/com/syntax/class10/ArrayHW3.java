package com.syntax.class10;

public class ArrayHW3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create an array of integers 
		//and calculate the sum of all elements in array
		
		//REGULAR FOR LOOOP Below
		
		int [] numbers= {10,20,30,40,50,60,70,80,90,100};
		int sum=0;
		System.out.println("Sum of numbers in this array is:=");
		
		for (int i=0; i<numbers.length; i++)
		{
			sum=sum+numbers[i];
			
		}
		System.out.println(sum);
		
		System.out.println("--------------Enhanced For Loop------------");
		
		sum=0;
		
		for (int number : numbers) {
			sum+=number;
		}

		System.out.println(sum);
	}

}
