package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyboard2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		
		System.out.println("Please enter your age");
		int age=scan.nextInt();  //we use nextInt if we want an int type of data from the keyboard
		
		if (age<18)
		{
			System.out.println("You should study");
		}else {
			System.out.println("You should start working");
		}
		
		
	}

}
