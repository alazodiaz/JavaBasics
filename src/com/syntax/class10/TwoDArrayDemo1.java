package com.syntax.class10;

public class TwoDArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[][] countries = {

                { "Usa", "Canada" }, // 1 array with index 0
                { "Peru", "Brazil", "Colombia", "Ecuador" }, // 2 array with index 1
                { "Ethiopia", "Egypt", "Kenya" }, { "Germany", "Turkiye", "Moldova", "Ukraine" },
                { "Kazakhstan", "Afghanistan", "Korea" } 
                };
		
		System.out.println(countries.length); //5- shows total # of arrays or rows
		
 //how to go inside the array and find out how many elements are in the area or find out how many columns
        
        //so go inside countries
		
		int elOf1arr=countries[0].length;
		System.out.println("# of elements from 1 array "+elOf1arr); //or # of columns from  1st row
		
		
		int elOf2arr=countries[0].length;
		System.out.println("# of elements from 2nd array "+elOf2arr); //or number of columns from 2nd row
		
		
		System.out.println(" ------- getting all values from 2d array ----------");
		
		for (int r=0; r<countries.length; r++) { //loops over rows
			
			for (int c=0; c<countries[r].length; c++) // have to specify the index of the rows in order to not get # of rows so use [r] //loops over columns
			
				System.out.println(countries[r][c]); //Accessing the elements
		}
		
		
		 System.out.println(" ------- getting all values from 2d array using for enhanced for loop -----");
		 
		 for (String[] singleArray:countries) {
			 for (String el:singleArray) {
				 System.out.println(el);
			 }
		 }
		 
		 

        System.out.println(" ------- getting all values from 2d array using for each loop -----");
        

        for (String[] country : countries) {

            for (String c : country) {

                if (c.equals("Kazakhstan")) {
                    System.out.println(c+ " is my home country");
                } else {
                    System.out.print(c + "  ");
                }
            }
            System.out.println();
        }

	}

}
