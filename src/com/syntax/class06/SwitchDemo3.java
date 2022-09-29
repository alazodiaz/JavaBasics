package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please tell me where are you from?");
		
		String country=scan.nextLine();
		String favoriteFood = null;
		
		switch (country) {
		
		case "usa":
			favoriteFood="burgers and fries";
			break;
		
		case "Kazakhstan":
			favoriteFood="beshparmak";
			break;
		case "Venezuela":
			favoriteFood="Arepa";
			break;
		case "India":
			favoriteFood="chicken curry";
			break;
		case "Yemen":
			favoriteFood="Mandi";
			break;
		
		}
		
		System.out.println("You are from "+country+" and your favorite food is "+favoriteFood);
		
		
		
		   

	}

}
