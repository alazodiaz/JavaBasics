package com.syntax.class04;

public class NestedIfConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int time=5;
		String day="Monday";
		/*
		 * it is called outer if condition if it is true then only inner conditions will be checked
		 * if it is false nothing from inner if conditions will be executed is is like the main door
		 * if main door is closed, we can't enter the building
		 */
		//Outer if-condition
		if(day.equals("Monday")) { //as String is non primitive we can't use == sign we have to use .equals method
			
			// inner if-conditions
			if(time>7) {
				System.out.println("Let's go to office");
			}
			
			if (time<6) {
				System.out.println("Let's sleep more");
			}
		}
	}

}
