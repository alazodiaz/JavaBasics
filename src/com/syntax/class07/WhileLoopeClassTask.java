package com.syntax.class07;

public class WhileLoopeClassTask {

	public static void main(String[] args) {
		// Print numbers from 100 to 1
		
		int a=100;
		
		while (a>=1) {
			System.out.println(a+ " ");
	
		a--;
		}
		
		System.out.println("-------------------------");

		//Print even numbers from 20 to 100 
		
		int b = 100;
		
		while (b>=20) {
			if  (b % 2 ==0) {
			System.out.println(b+" ");
			}
			b++;
		}
		

		//Print only odd numbers from 100 to 1
		//(2 different ways)
		
		int c=100;
		
		while (c>=1) {
			if(c%2==1) {
				System.out.println(c+ " ");
			}
			c--;
		}
		System.out.println("-----Another way----");
		
		int d=99;
		while (d>=1) {
			System.out.println(a+" ");
			b-=2;
			
		}

	}

}
