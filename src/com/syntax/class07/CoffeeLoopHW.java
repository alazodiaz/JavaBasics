package com.syntax.class07;

import java.util.Scanner;

public class CoffeeLoopHW {

	public static void main(String[] args) {

		//6. Declare a variable to store a price for a coffee. Ask the user to pay for a coffee. 
		//Keep asking to pay for coffee until the user enters the EXACT amount . 
		//If the user gives more than coffee price --> ask them to give less, if the user gives less money then ask to give more. 
		//Once user give EXACT amount print “Please enjoy your coffee
		

	        Scanner input = new Scanner(System.in);
	        
	        double coffee=5.50;
	        double money;
	        
	        
	        do {
	        	System.out.println("Please pay for the coffee");
	        	money=input.nextDouble();
	        	
	        	if (money>coffee) {
	        		System.out.println("Please give less money");
	        	}else if (money<coffee) {
	        		System.out.println("Please pay more money");
	        	}
	        } while (money != coffee);
	        System.out.println("Please enjoy your coffee!");

	}

}
