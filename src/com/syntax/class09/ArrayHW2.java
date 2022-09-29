package com.syntax.class09;

public class ArrayHW2 {

	public static void main(String[] args) {
		// 2. Create an array of animals and store 5 elements into it. 
		//Using 2 different loops print all elements from the array.
		
		String [] animals=new String[5];
		
		animals[0]="Dog";
		animals[1]="Cat";
		animals[2]="Cheetah";
		animals[3]="Bear";
		animals[4]="Elephant";
		
		for (String a:animals)

		System.out.println(a);
		
		
		System.out.println("----------------------------");
		
		String [] animals2= {"Koala", "Sloth", "Dolphin", "Turtle","Giraffe"};
		
		for (String b:animals2)
		
		System.out.println(b);
			

	}

}
