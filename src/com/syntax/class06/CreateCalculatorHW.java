package com.syntax.class06;

import java.util.Scanner;

public class CreateCalculatorHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner in=new Scanner(System.in);

	        System.out.println("Please enter first number:");
	        int num1=in.nextInt();

	        System.out.println("Please enter second number:");
	        int num2=in.nextInt();

	        System.out.println("Please use operator:");
	        char oper=in.next().charAt(0);

	        int result=0;

	        if(oper=='+') {
	            System.out.println("The result is "+(num1+num2));
	        }else if(oper=='-') {
	            System.out.println("The result is "+(num1-num2));
	        }else if(oper=='*') {
	            System.out.println("The result is "+(num1*num2));
	        }else if(oper=='/') {
	            System.out.println("The result is "+(num1/num2));
	        }else {
	            System.out.println("Wrong operator");
	        }

	        //using the Switch case:

	        switch (oper) {
	        case '+':
	            result=num1+num2;
	            break;
	        case '-':
	            result=num1-num2;
	            break;
	        case '*':
	            result=num1*num2;
	            break;
	        case '/':
	            result=num1/num2;
	            break;
	            default:
	            System.out.println("Wrong operator");
	        }
	        if (result !=0.0) {
	        System.out.println("(using switch case8)The result is "+result);
	        }
	    }

	
	}


