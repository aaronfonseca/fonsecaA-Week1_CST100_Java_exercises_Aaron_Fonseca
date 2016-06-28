/** Program: Exercise 4.17
* File: Exercise4_17.java
* Summary: (Days of a month) 
* Author: Aaron Fonseca
* Date: June 25, 2016
**/

import java.util.Scanner;

public class Exercise4_17 {
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);

			System.out.print("Enter a year: ");
			int year = input.nextInt();
			
			System.out.print("Enter a 3 letter month: ");
			String month = input.next();
			
			System.out.print(month + " " + year + " has ");
			if ( month.equals("Jan") || month.equals("Mar") || month.equals("May") || month.equals("Jul") ||
				  month.equals("Aug") || month.equals("Oct") || month.equals("Dec"))
				System.out.println(31 + " days");
			else if (month.equals("Apr") || month.equals("Jun") || month.equals("Sep") || month.equals("Nov"))
				System.out.println(30 + " days");
			else
				System.out.println(28 + " days");//Feb	
		}
	}