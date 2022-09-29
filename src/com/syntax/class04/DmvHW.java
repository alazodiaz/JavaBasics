package com.syntax.class04;

import java.util.Scanner;

public class DmvHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("What is your age?");
		Scanner scanner= new Scanner(System.in);
		int age=scanner.nextInt();
		
		if (age>=18) {
			System.out.println("Issue License");
		}
		else {
			System.out.println("Issue Learners Permit");
		}
	}

}
