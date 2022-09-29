package com.syntax.class04;

import java.util.Scanner;

public class ReplitThirtyOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner scan=new Scanner(System.in);


		    System.out.println("Is it sunny outside?");
		    boolean isSunny=scan.nextBoolean();
		  if (isSunny) {
		    System.out.println("It is a sunny day, I should go somewhere");
		 
		  System.out.println("What is the temperature outside?");
		    double temp=scan.nextDouble();
		  
		
		  if (temp>85) {
		    System.out.println("I am going to the beach!");
		  } else {
		  System.out.println("I am going to the park");
		  }
		  } else {
	    System.out.println("I should stay home and practice Java");
		  }
	}



	}	    

		 

	

	


