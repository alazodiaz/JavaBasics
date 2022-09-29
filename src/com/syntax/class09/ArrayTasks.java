package com.syntax.class09;

public class ArrayTasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a grade B (use 2 different ways of creating an array).
		
		char [] grades= {'A', 'B', 'C', 'D', 'E', 'F'};
		System.out.println(grades[1]);
		
		
char[] grade=new char[7];
		
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[4]='D';
		grade[5]='E';
		grade[6]='F';
		
		System.out.println(grade[1]);

		//Create an array of names and store all names of your group. Then print your name from that array. (use 2 different ways of creating an array).
		
		String [] names=new String[5];
		names[0]="Andrea";
		names[1]="Kylo";
		names[2]="Cassie";
		names[3]="Daniel";
		names[4]="Draco";
		
		System.out.println(names[0]);
		
		
		String[] name= {"Andrea", "Kylo", "Draco","Daniel","Cassie"};
		
		System.out.println(name[0]);

		//Create an array of words: Java, Saturday, day, coding, is. Print the following sentence using elements of array: 
		//“Saturday is Java coding Day”.
		
		String [] words=new String[5];
		words[0]="Java";
		words[1]="Saturday";
		words[2]="Day";
		words[3]="coding";
		words[4]="is";
		
		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);

	}

}
