package com.syntax.class09;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//only when we deal with arrays or collections
		//we can use for each loop, enhanced for loop, advanced for loop
		
		String[] iceCream= {"vannila", "chocolate", "moosetracks", "stawberry", "Mango", "Peach"};
		
		for (String flavor:iceCream) {
			System.out.println(flavor);
		}
		
		System.out.println("-----------------------");
		
		char [] letters={'A', 'B', 'C', 'D', 'F'};
		
		for(char letter:letters) {
			System.out.println(letter);
		}
		
		System.out.println("-----------------------");
		
		int[] numbers = {12, 26, 345, 1, 0, 9};
		
		//get all elements together using regular for loop
		
		for (int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
			
		}
		System.out.println("-----------------------");
		
		//get all values using enhanced for loop
		// this loop always loops ONLY 1 way: from start to end
		
		for (int num:numbers) {
			System.out.println(num);
		}

	}

}
