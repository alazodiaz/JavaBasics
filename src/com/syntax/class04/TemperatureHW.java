package com.syntax.class04;

import java.util.Scanner;

public class TemperatureHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("What City do you live in?");
		Scanner scanner=new Scanner(System.in);
		
		String city=scanner.nextLine();
		
		System.out.println("What is the temperature in Fahrenheit?");
		double temp=scanner.nextDouble();
		
		temp=(temp-32)*5/9;
		System.out.println("The temperature of "+city+" "+temp+" Celsius");
		

	}

}
