package com.syntax.class01;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this is an example of storing variables
		
		//storing and representing values;
		
		byte box1 = 20;
		
		short box2=100;
		
		int box3=100000;  //popular
		
		long box4=100000000L;  //ex. a credit card number is considered long
		// add L at the end can be lower/upper case

		
		float variable1=1.99F; //add f at the end to specify it's a float
		
		double variable2=99.99; // don't need to add d at the end
		
		//storing single characters
		
		char container='A'; //char= single character so use single quotes ' '
		char dollar='$';
		
		//storing yes or no values
		
		boolean hot=true;
		boolean tired=false;
		
		//To Print
		
		System.out.println(variable2); //printing value of the variable
		System.out.println("variable2"); //printing text variable/ whatever is in parenthesis 
		
		//System.out.println(Tired); //ex) of something that won't print bc it doesnt match name given 
		System.out.println(tired); // this will print bc matches name
		//System.out.println(variable3); error-variable does not exist
	}

}
