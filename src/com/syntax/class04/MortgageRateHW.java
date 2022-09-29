package com.syntax.class04;

import java.util.Scanner;

public class MortgageRateHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("What is the Mortgage rate?");
		
		double rates=scanner.nextDouble();
		
		if (rates>4.5) {
			System.out.println("Will not buy a house");
		}
		else{
			System.out.println("What is the house price?");
			int house=scanner.nextInt();
			
			if (house>200000) {
				System.out.println("Will take loan");
			}
			else {
				System.out.println("Pay cash");
			}
		}

	}

}
