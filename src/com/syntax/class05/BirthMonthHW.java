package com.syntax.class05;

import java.util.Scanner;

public class BirthMonthHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a program for user to enter his/hers birth month. Based on the month define the season.
		//Example: if user is born in March, April, May → season =”Spring” 
		//if user is born in June, July, August → 
		//season =”Summer”  etc …

		Scanner scan=new Scanner(System.in);
		System.out.println("What is your birth month?");
		String month=scan.nextLine();
		
		if (month.equals("May") || month.equals("April") || month.equals("March")) {
			System.out.println("Your were born in the Spring");
			
		}else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			System.out.println("You were born in the Summer");
			
		}else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			System.out.println("You were born in the Fall");
			
		}else if (month.equals("December") || month.equals("January") || month.equals("February")) {
			System.out.println("You were born in the Winter"); 
		}
	}

}
