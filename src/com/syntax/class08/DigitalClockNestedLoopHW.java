package com.syntax.class08;

public class DigitalClockNestedLoopHW {

	public static void main(String[] args) {
		// Create a digital clock using nested loops
		//If you can, try to have a clock that would show 2 digits for hour and 2 digits for minutes
		
		String time = null;
		
		  for (int h = 0; h <= 23; h++) {

	            for (int m = 0; m <= 59; m++) {

	                if(h<10 && m<10) {
	                    time="0"+h+":"+"0"+m;

	                } else if (h<10 && m>=10) {
	                    time="0"+h+":"+m;

	                } else if(h>=10 && m<10) {
	                    time=h+":"+"0"+m;

	                } else {
	                    time=h+":"+m;
	                }

	                System.out.println(time);
	            }
	        }

		}

	}

