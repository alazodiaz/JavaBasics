package com.syntax.class09;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr=new int[4];
		
		//store elements inside an array
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		
		//accessing elements from the array
		System.out.println(arr[2]);// 30
		
		System.out.println(arr[1]+arr[2]); //50
		
		
		//let's create an array and store your classmates
		
		String [] names=new String[5];
		names[0]="Andrea";
		names[1]="Kylo";
		names[2]="Cassie";
		names[3]="Daniel";
		names[4]="Draco";
		
		System.out.println("hello "+names[1]);

	}

}
