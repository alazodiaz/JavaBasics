package com.syntax.class06;

import java.util.Scanner;

public class GradesHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your letter");
		String gradeLetter=scan.nextLine();
		String explanation;
		
		switch (gradeLetter) {
		case "A":
			explanation="Excellent";
			break;
		case "B":
			explanation="Good";
			break;
		case "C":
			explanation="Average";
			break;
		case "D":
			explanation="Bad";
			break;
		default:
			explanation="Not Acceptable";
			break;
				
			
		}
		System.out.println("Your grade was an "+gradeLetter+" which is "+explanation);

	}

}
