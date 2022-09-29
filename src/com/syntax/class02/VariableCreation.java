package com.syntax.class02;

public class VariableCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// First way to create a variable
		byte b=10;//create a variable & assigned value
		
		//2nd way to create a variable
		int i; //create a variable
		i=100; //assign value
		/* variable creation only happens once
		 * then we can use it as many times we want/need during the program
		 */
		
		// 3rd way to create a variable
		//create a variable=declare a variable 
		int num1, num2, num3;
		
		num1=100; //assign value or initialize the variable
		num2=200;//assign the value
		num3=300; //to store the value you add the equal sign
		
		//int num1=100;= ex. of error-->duplicate variable (if active it would be red)
		
		/* can i change the value of a variable???
		 * yes you can ex) below
		 */
			num2=2000;	//reassign the value
			
			System.out.println(num2); //2000
			
			//variable can only hold 1 value at 1 time/per line
		
		

	}

}
