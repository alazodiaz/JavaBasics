package com.syntax.class06;

public class SwitchDemo2 {

	public static void main(String[] args) {
		// matching cases must be same data type as a variable
		//no duplicate case in switch
		
		char choice='Y';
		String answer;
		
		switch(choice) {
		
		case 'Y':
			answer="Yes";
			break;
		case 'N':
			answer="No";
			break;
		case 'M':
			answer="Maybe";
			break;
		default:
			answer="Unkown";
			break;
		
		}
		System.out.println(answer);	
		
		//Limitations of WITCH CASES
		/*
		 * switch case cannot use logical operators
		 * switch case cannot use relational operators
		 * cannot work w/ boolean values
		 * Cannot work w/ double/float and long data types
		 */

	}

}
