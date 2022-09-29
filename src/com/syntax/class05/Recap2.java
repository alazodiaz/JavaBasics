package com.syntax.class05;

public class Recap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//NESTED IF CONDITION EXAMPLE
		
		/*
		 * to format code
		 * for mac cmd
		 */
		
		boolean allergy=true;
		
		String allergyType="Peanuts";
		
		if (allergy) {
			System.out.println("Let's check what allergy you have");
			
			if (allergyType.equals("pollen")) {
				System.out.println("Try to stay indoors when trees are blooming");
			}
			
		}else {
			System.out.println("You are lucky");
		}

	}

}
