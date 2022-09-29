package com.syntax.class04;

import java.util.Scanner;

public class CreditCardHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Do you have a credit card?");
		Scanner scanner = new Scanner (System.in);
		
		boolean credit=scanner.nextBoolean();
		
		if (credit) {
			System.out.println("What is the balance of the credit card?");
			int balance=scanner.nextInt();
			if (balance>1000) {
				System.out.println("Pay ba;ance off immediatley");
				
			}
			else {
				System.out.println("Spend more!");
			}
			}
			else {
				System.out.println("Do you want a credit card?");
			}
		}
	}


