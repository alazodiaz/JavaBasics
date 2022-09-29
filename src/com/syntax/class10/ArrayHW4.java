package com.syntax.class10;

public class ArrayHW4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//From an array of integer elements find the largest number:
		
		int[] num= {10,20,30,40,50,60};
		int largestnum=0;
		
		for (int i=0; i<num.length; i++) {
			
			if (num[i]>largestnum) {
				largestnum=num[i];
			}
		}
		System.out.println(largestnum);

	}
	

}
