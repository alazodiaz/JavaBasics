package com.syntax.class05;

import java.util.Scanner;

public class Replit36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   Scanner scan=new Scanner(System.in);

		    System.out.println("Please enter a word");
		    String word1=scan.nextLine();
		    System.out.println("Please enter another word");
		    String word2=scan.nextLine();


		    
		    System.out.println("Please enter a number");
		    int num1=scan.nextInt();
		    System.out.println("Please enter a second number");
		    int num2=scan.nextInt();

		    if (num1==num2 && word1.equals(word2)){
		      System.out.println("AND");
		      
		    }else if (num1==num2)
		      if (word1!=word2) {
		        System.out.println("OR");
		      }
		    else if (num1!=num2)
		      if (word1!=word2){
		        System.out.println("NONE");
		      }
	}

}
