package com.syntax.class06;

import java.util.Scanner;

public class CreateCalculatorHw2 {

	public static void main(String[] args) {
		
		// Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/). Based on operator provide the result to user.
		//Please complete this assignment in 2 ways: using if statement and switch case.
		
		//IF STATEMENT
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number");
		double num1=scan.nextDouble();
		
		System.out.println("Please enter a second number");
		double num2=scan.nextDouble();
		
		System.out.println("Please enter an operator");
		char Opp=scan.next().charAt(0);
		
		 double result = 0;
		
		if (Opp=='+') {
		System.out.println((num1+num2));
		
		}else if (Opp=='-') {
			System.out.println((num1-num2));
			
		}else if (Opp=='/') {
			System.out.println((num1/num2));
			
		}else if (Opp=='*') {
			System.out.println((num1*num2));
		}

		
		
		//SWITCH CASE
		
	switch (Opp) {
		case '+':
			result=((num1+num2));
			break;
			
		case '-':
			result=((num1-num2));
			break;
			
		case '/':
			result=((num1/num2));
			break;
			
		case '*':
			result=((num1*num2));
			break;
			
			default:
				System.out.println("Wrong Opperator");
					
	}
	
	System.out.println("The result is "+result);
	
	}

}
