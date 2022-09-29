package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// LOGICAL AND (&&)
		
		//in order for && to work all conditions must be TRUE
		/*
		 * true condition && true condition-->TRUE
		 * true && false --> FLASE
		 * false && true ---> FALSE
		 * false && false -->FALSE
		 * 
		 */
		
		boolean understandJava=true; //can change this from true to false to change outcome
		boolean enjoyJava=false;
		boolean practice=true;
		
		if(understandJava && enjoyJava && practice) {
			System.out.println("This is awesome");
		}
		
		System.out.println(" another example ");		
		// to find largest number
		int n1=100;
		int n2=200;
		int n3=300;
		
		if(n1>n2 && n1>n3) {
			System.out.println("Number 1 is the largest"); 
		
		} else if (n2>n3 && n2>n1) {
			System.out.println(n2+" is the largest");
		}else if (n3>n1 && n3>n2) {
			System.out.println(n3 +" is the largest");
		}
		

	}

}
