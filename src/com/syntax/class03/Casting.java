package com.syntax.class03;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * type casting=> data type casting = converting
		 * converting one data type to another
		 * have to use parenthesis to convert
		 * ex) int number=15.2; //we can't store the decimal number in a box type int
		 * but if you add (int) it will let it passs EXAMPLE IN LINE 23
		 */
		
		byte box1=127; //smallest box
		short box2=3333; //double the size of box1 in terms of bits/ slightly larger box
		int box3=45454545; //32 bits// large box most commonly used
		long box4=45454545; //slightly large box 64 bits
		float box5=456789136; //larger box
		double box6=567891367; //largest 
		
		int number=(int)15.2; //we can't store the decimal number in a box type int
		System.out.println(number);
		
		byte smallerBox=(byte)box2;
		System.out.println(smallerBox);
		
		short biggerBox=box1;
		
		
		long box7=box1; //we can do this bc box7 is lager than box1
		
		//as box6 is larger it is double, we need to type casting to assign the value
		float box8=(float)box6;
		
		char a =(char) 15;
		System.out.println(a);
		
		int box9=(int)box4;
		System.out.println(box9);
		
		//Type Casting: This can be used when merging codes with other team members //to make all the codes compatiable 
		
	}

}
