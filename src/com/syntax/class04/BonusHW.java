package com.syntax.class04;

import java.util.Scanner;

public class BonusHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter number of years worked");
		Scanner scanner= new Scanner(System.in);
		
		int work=scanner.nextInt();
		
		System.out.println("Enter anual salary: ");
		int salary=scanner.nextInt();
		
		if (work>=5) {
			System.out.println("Eligable for bonus");
			if (salary>50000) {
				System.out.println("Bonus is $5000");
			}
			else {
				System.out.println("Bonus is $3000");
			
			}
		}
	}

}
