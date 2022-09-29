package com.syntax.class07;

public class WhileLoopDemo2 {

	public static void main(String[] args) {
		// print all numbers from 1 to 10
		
		int num=1;
		
		while (num<=10) {
			System.out.println(num);
			num++; //always debug while using loops
			
		}
		
		System.out.println("-------------------------");
		
		//print all numbers from 10 to 25
		
		int a =10;
		
		while(a<=25) {
			System.out.println(a +" ");
			a++;
			
		}
		System.out.println("-------------------------");
		
		int b=10;
		
		while (b>=1) {
			System.out.print(b);
			b--;
		}
		// print all numbers from 50 to 20
		
		int c=50;
		
		while (c>=20) {
			System.out.println(c);
			c--;
			
		}
		
		//print all even numbers from 1-20
		
		int d=20;
		
		while (d<=1) {
			if (d%2==0) {
			System.out.println(d+" ");
			}
		d++;
				
		}
		
		System.out.println("Another way");
		
		int i =1;
		while (i <=20) {
			if (i % 2 ==0) {
				System.out.println(i + " ");
			}
			i++;
		}
				

	}

}
