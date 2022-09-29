package com.syntax.class02;

public class NonPrimitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String is just one example of non primitive data types
		
		String name="Andrea";
		
		String address="123 address street";
		
		String phone="123 4567 890";
		
		//if you have double quotes " " it is considered a String
		
		int age=17;
		//String age "17"; //anything you put inside " "-->becomes string
		
		String character="A";
		
		//ctr+space->auto completes the statement
		 //syso+ctlr+space
		
		System.out.println(name);
		
		//"My name is" + Andrea 
		
		System.out.println("My Name is "+name);
		
		// Andrea is 17
		
		System.out.println(name+ " is " +age);
		
		String fruit= "apple";
		double price=1.99;
		
		System.out.println("The price of the "+fruit +" is "+price);
		/*to attach any value (int,double,boolen,char,String etc)
		 * to a String we use the + sign
		 * +sign next to the String acts as Concatenation
		 */

		fruit="mango";
		price=5.99;
		
		System.out.println("The price of the "+fruit +" is "+price);

		
		//price of the mango is 5.99
		
				
	}

}
