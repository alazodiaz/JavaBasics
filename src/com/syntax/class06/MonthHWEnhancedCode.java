package com.syntax.class06;

import java.util.Scanner;

public class MonthHWEnhancedCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("enter yout birth month");
		String month=scan.next();
		String seasonOfBirth;
		
		if (month.equals("March") || month.equals("April") || month.equals("May")) {
			seasonOfBirth="Spring";
		}
		else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			seasonOfBirth="Summer";
		}
		else if (month.equals("October") || month.equals("November") || month.equals("September")) {
			seasonOfBirth="Autumn";
		}
		else if (month.equals("January") || month.equals("Feburary") || month.equals("December")) {
			seasonOfBirth="Autumn";
		}
		else {
			seasonOfBirth="Invalid Month";
		}
		System.out.println(seasonOfBirth);
		
	}

}
