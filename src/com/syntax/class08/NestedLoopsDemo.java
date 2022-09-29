package com.syntax.class08;

public class NestedLoopsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=1; i<3; i++){ //-->> outter loop
				System.out.println("hello");
				
				for (int j=1; j<=3; j++){ //---> nested loop
				System.out.println("bye");
				}
			}
		
		System.out.println("-------------------------");
		
		for (int i=0; i<=2; i++) {
			for (int j=1; j<4; j++) {
				System.out.println(i+" "+j);
			}
		}
	}

}
