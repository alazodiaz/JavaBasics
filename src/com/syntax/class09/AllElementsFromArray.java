package com.syntax.class09;

public class AllElementsFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] iceCream= {"vannila", "chocolate", "moosetracks", "stawberry"};
		
		System.out.println(iceCream[0]);
		System.out.println(iceCream[1]);
		
		//how to get the value?
		
		for(int i=0; i<iceCream.length; i++) {
			System.out.println(iceCream[i]);
		}
		
		System.out.println("------------------------------");
		
		char [] letters={'A', 'B', 'C', 'D', 'F'};
		
		for (int i=0; i<letters.length; i++) {
			System.out.println(letters[i]+" ");
		}

	}

}
