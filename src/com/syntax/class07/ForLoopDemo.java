package com.syntax.class07;

public class ForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=1; i<=5 ; i++) {

			System.out.println("Hello");
		}
		
		//Create a for loop that prints out even numbers from 10 to 0

		  int n=2;
	      
		    for (int a=10; a>=n; a-=2) {
		      System.out.println(a);
		    }
		    
		        
		//Create a for loop that prints out even numbers from 2 to 14 using if condition
		    
		    for (int a=2; a<=14; a++) 
		        if (a%2==0)
		      System.out.println(a);
		    
		    
		    //Create a for loop that prints out odd numbers from 5 to 22
		    //Must not include the number 22 in the output 
		    
		    for (int a=5; a<=22; a+=2) {
		        System.out.println(a);
		      }


		    //Using for loop print "Good Morning" 20 times
		    
		    for (int a=1; a<=20; a++) {
		        System.out.println("Good Morning");
		      }
		    
		    //Write a program that prints the string "Hey, it is year: " and the years between 2011 and 2019.
		    //Must include year 2019 in the output 
		    
		    for (int a=2011; a<=2019; a++) {
		        System.out.println("Hey,it is year:");
		        System.out.println(a);
		      }
		    
	}

}
