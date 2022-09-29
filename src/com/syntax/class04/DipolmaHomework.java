package com.syntax.class04;

import java.util.Scanner;

public class DipolmaHomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
        System.out.println("Do you have a degree?");
        boolean degree=scanner.nextBoolean();

        if(degree) {
       
            System.out.println("Congratulations!");
            
            System.out.println("What is your gpa?");
            double gpa=scanner.nextDouble();
            
            if (gpa>=3.5) {
            	System.out.println("You are eligable for a scholarship");
            }
            else { 
            	System.out.println("You should have studied harder");
            }
        }
            else {
            	System.out.println("Get a degree");
            }


          
        }
	}


