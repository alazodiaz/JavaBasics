package com.syntax.class07;

import java.util.Scanner;

public class ForLoopReplitExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a program that prints the count down from 10 up to 1 and then says "Happy New Year!".
		
		 int b=0;
		   
		   for (int a=10; a>b; a--) {
		     System.out.println(a);
		   } if (b==0) {
		     System.out.println("Happy New Year!");
		   }
		   
		  // Write a program that uses for loop to prints multiplication of  number 3 from 1 to 10
		   
		   int c=3;
		   for (int a=1; a<=10; a++) {
		   System.out.println(c+"*"+a+"="+c*a);
		   }

		   
		   //Using for loop Print 1 to 10 Numbers except 5 and 6
		   for (int a=1; a<=10; a++) {
			     if (a==5 || a==6) continue;
			     System.out.println(a);
		   }
		   
		   
		   //Write a for loop that will print out a series of numbers starting at 0 and ending at the 
		   //x(value must be taken from a user), exclusive.
		   
		   Scanner scan=new Scanner(System.in);
		   System.out.println("Please enter a number");
		     int x=scan.nextInt();
		    
		   for(int y=0; y<x; y++) {
		     System.out.print(y+" ");
		   }
		   
		   /*
		    * Write a for loop that will print out a series of numbers starting at 0 and ending at the doubled value of 
		    * end(value must be taken from a user), exclusive.
		    * Each number should be on the same line, separated by a space. 

		    */
		   
		   Scanner scanner=new Scanner(System.in);
		    System.out.println("Please enter a number");
		    int userInput=scanner.nextInt();

		    for(int i=0;i< userInput*2; i++){
		      System.out.print(i+" ");
		    }
		    
		    //Write a for loop that will print out a series of numbers starting at one less than x and ending at 0.
		    
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Please enter a number");
		    int d=sc.nextInt();

		    for (int i=d-1; i>=0; i--) {
		    	System.out.print(i+" ");
    }
    
	}

}
