package com.syntax.class06;

import java.util.Scanner;

public class WhatCountryHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("What country are you from?");
		String country=scan.nextLine();
		String language;
		
		switch (country.toLowerCase()) { //enables user to put answers in lower case
		
		case "USA":
			language="American English";
			break;
		case "El Salvador":
			language="Spanish";
			break;
		case "Brazil":
			language="Portuguese";
			break;
		case "China":
			language="Chinese";
			break;
		case "France":
			language="French";
			break;
			
		default:
			language="Unkown";
			break;	
		
		
		}

	}

}
