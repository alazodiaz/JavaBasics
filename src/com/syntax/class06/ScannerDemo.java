package com.syntax.class06;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int day=5;
		
		if(day==1) {
			System.out.println("monday");
		}else if (day==2) {
			System.out.println("tuesday");
		}else if (day==3) {
			System.out.println("wednesday");
		}else if(day==4) {
			System.out.println("Thursday");
		}else if (day==5) {
			System.out.println("Friday");
		}else if (day==6) {
			System.out.println("saturday");
		}else if (day==7) {
			System.out.println("sunday");
		}else {
			System.out.println("please enter a valid day numner(1-7)");
		}
			
		System.out.println("----------------------------------");	
		
		String name;
		// switch case is values base
		// it knows the value and it jumps to the matching case
		
		switch(day) {
		
		case 1:
			name="Monday";
			break;
		case 2:
			name="Tuesday";
			break;
		case 3:
			name="Wednesday";
			break;
		case 4:
			name="Thursday";
			break;
		case 5:
			name="Friday";
			break;
		case 6:
			name="Saturday";
			break;
		case 7:
			name="Sunday";
			break;
		default:
			name="Invalid";
			break;
		
		}

		
		

	}

}
