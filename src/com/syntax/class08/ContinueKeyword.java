package com.syntax.class08;

import java.util.Scanner;

public class ContinueKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=1; i<5; i++) {
			
			if(i==3) {
			continue;
			}
			System.out.println("hello");
			System.out.println("how are you");
			System.out.println(i);
		}
	
		
		//I want to print numbers 1 to 20 except number 3,7, and 11
		
		for (int i=1; i<=20; i++) {
            if (i==3 || i==7 || i==11) {
                continue;
            }
            System.out.println(i+" ");
        }

        //continue - continues to the next iteration/cycle
        // moment Java sees continue -> it goes back to the beginning of the loop
        //it usually used inside some type of conditions
		
		//print numbers 1-50 except those diviable by 3
		
		for (int b=1; b<=50; b++) {
			if (b %3==0) {
				continue;
			}
		}
		/*
		 *  Write a program to ask a user to enter item they want to buy and the price of that item. 
		 *  Every time user enters money, accumulate the amount and tell the user how much is left to pay off.
		 *   If user give more money program should return a change. Whenever user done with payments program should say
		 *    "Thank you for shopping!"
		 */
	
		Scanner input=new Scanner(System.in);
		System.out.println("What do you want to buy?");
		String item=input.nextLine();
		
		System.out.println("What is the price of the item?");
		double price=input.nextDouble();
		
		double money;
		double total = 0;
		
		do {
			System.out.println("How much money do you have?");
			money=input.nextDouble();
			
			total+=money; //accumulate all money
			double need;
			double change;
			
			if (total<price) {
				need=price-total;
				System.out.println("you need to pay more $"+need);
				
			}else if (total>=price) { //double check if it works with the = sign
				change=total-price;
				System.out.println("Here is you change $"+change);
				break;
			}
		} while (total!=price);
		System.out.println("Thank you for shopping");
	}

}
