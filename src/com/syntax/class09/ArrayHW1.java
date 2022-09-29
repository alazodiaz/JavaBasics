package com.syntax.class09;

public class ArrayHW1 {

	public static void main(String[] args) {
		// HW. 1. Create an array of cars and store 6 elements into it. 
		//Using 2 different loops print all values from the array.
		
		
		String [] cars=new String[6];
		
		cars[0]="Toyota";
		cars[1]="BMW";
		cars[2]="Mercedes";
		cars[3]="Kia";
		cars[4]="Subaru";
		cars[5]="Jeep";
		
		for (String makes:cars)
			
		
		System.out.println(makes);

		System.out.println("---------------------------------------------");
		
		String [] cars2= {"Tesla", "Aston Martin", "McLaren", "Haas" , "Redbull", "Ferrari"};
		
		for (String makes2:cars2)
		System.out.println(makes2); //juice
	}

}
