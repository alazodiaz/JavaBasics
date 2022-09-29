package com.syntax.class12;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		// Create a String and print it in reverse order (Sunday → yadnuS).
		//Write a program that reads two people's first names and if they expecting boy or girl? 
		//Based on the input suggests a name for a baby:
		//Example Output:
		//Mom’s first name? Mary
		//Dad’s first name? Daniel
		//Boy or Girl? boy
		//Suggested baby name: DANRY

		//Example Output:
		//Mom’s first name? Mary
		//Dad’s first name? Daniel
		//Boy or Girl? girl
		//Suggested baby name: MAIEL
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter mothers first name");
		String mom=scan.nextLine();
		
		System.out.println("Please enter fathers first name");
		String dad=scan.nextLine();
		
		System.out.println("Are you expecting a boy or girl?");
		String gender=scan.nextLine();
		
		int momIndex= mom.length()/2-1;
		int dadIndex=dad.length()/2-1;
		
		String babyName=null;
		
		if(gender.equalsIgnoreCase("boy")) {
			babyName= dad.substring(0, dadIndex)+ mom.substring(momIndex);
			
		}else if (gender.equalsIgnoreCase("girl")) {
			babyName=mom.substring(0, momIndex) + dad.substring(dadIndex);
		}
System.out.println("Suggested baby name is: "+babyName);

	}

}
