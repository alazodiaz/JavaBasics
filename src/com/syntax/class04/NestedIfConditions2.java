package com.syntax.class04;

public class NestedIfConditions2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double moneyInMyAccount=100000;
		String season="spring";
		
		if(season.equals("spring"))
		{
			
			if(moneyInMyAccount>30000)
			{
				System.out.println("let's go on vacation");
			}
			else
			{
				System.out.println("I need to save more");
			}
		}

	}

}
