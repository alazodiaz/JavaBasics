package com.syntax.class04;

import java.util.Scanner;

public class LoanSpecialistHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Is the loan or equal or less than $200,000?");
		
		Scanner scanner=new Scanner(System.in);
		int loan=scanner.nextInt();
		
		if (loan<2000000) {
			System.out.println("Will lend money");
		}
		
		else {
			System.out.println("Reject loan");
		}

	}

}
