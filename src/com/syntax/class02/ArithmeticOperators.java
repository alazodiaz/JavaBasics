package com.syntax.class02;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
		// +,-,*,/,%  
		// % = remainder 
		
		int a=900;
		int b=100;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);

		
		//Example
		
		int e=10;
		int f=5;
		
		System.out.println("division ="+e/f); //2
		System.out.println("remainder="+e%f); //0
		
		System.out.println(20%7);
		
		
		//EXAMPLE
		int c=10;
		int d=3;
		
		int sum=c+d;
		int sub=c-d;
		int remainder=c%d; //10%3 = 1
		int div=c/d; //10/3 =3
		
		System.out.println("Sum is ="+sum);
		System.out.println("Sub is ="+sub);
		System.out.println("Remainder is ="+remainder);//1
		System.out.println("Div is ="+div);//3
		
		
		
		//EXAMPLE
		double num1=10.0;
		double num2=3.0;
		
		System.out.println("Divison of double="+num1/num2);
		System.out.println(num1%num2);
		
		// EXAMPLE
		System.out.println("using float data type---");
		
		float number1=10.0f;
		float number2=3.0f;
		
		System.out.println("Division of float="+number1/number2);
		
		System.out.println("    remainder examples    ");
		//Remainder-%-mod operator
		System.out.println(16%13);
		
		
		System.out.println("     what is the ouput   ");
		System.out.println(10+10/10); //11
		System.out.println((10+10)/10); //2
		
	}

}
