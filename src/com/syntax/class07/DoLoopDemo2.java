package com.syntax.class07;

import java.util.Scanner;

public class DoLoopDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		String answer;
		
		do {
			System.out.println("Did you get a job?");
			answer=scan.next();
		} while (!answer.equals("yes"));

	}

}
