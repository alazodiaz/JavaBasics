package com.syntax.class05;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a number between 1 and 10000");
		
		int num=scan.nextInt();
		
		if (num<=10) {
			System.out.println("The number is small");
		}
		else if (num<=100 && num>=11) {
			System.out.println("The number is medium");
			
		} else if (num>=101 && num<=1000) {
			System.out.println("The number is large");
		}

	}

}
