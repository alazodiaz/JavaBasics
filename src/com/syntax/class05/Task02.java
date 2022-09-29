package com.syntax.class05;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter a number inicating the day of the week");
		int num=scan.nextInt();
		
		if (num<=5 && num>=1) {
			System.out.println("It's a weekday");
		}
		else if (num==6 && num==7) {
			System.out.println("It is a weekend");
		}
		else {
			System.out.println("Invalid day");
		}
	}

}
