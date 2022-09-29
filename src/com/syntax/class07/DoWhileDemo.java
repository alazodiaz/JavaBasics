package com.syntax.class07;

public class DoWhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=1;
		while (num<=3) {
			System.out.println("I am while loop");
			num++;
		} // this loop will be exectued 3 times because of the CONDITION USING NUMBER 3

		System.out.println("-------------------------");
		
		int num1=1;
		
		do {
			System.out.println("I am do while lopp");
			num1++;
		}while (num1<=3);
	}

}
