package com.syntax.class07;

public class LoopHW2 {

	public static void main(String[] args) {
		
		//3. Print even numbers from 20 to 1 (2 ways)
		
		int a=1;
		
		while (a<=20) {
			if (a%2==0) {
				System.out.print(a+" ");
			}
			a++;
		}
		
		System.out.print("-----Another way-------");
				
		for (int b=2; b<=20; b+=2) {
			System.out.print(b+" ");
		}
		
		System.out.println("-----Print odd #'s btwn 20 & 50-------");

		//4. Print odd numbers between 20 and 50 (2 ways)
		
		int c=21;
		
		while (c>=21 && c<=49) {
			System.out.print(c+" ");
			c+=2;
		}
		
	System.out.print("-----Another way-------");
	
	
	for (int d=21; d<=49; d+=2) {
		System.out.println(d+" ");
	}
	
		
		

	}

}
