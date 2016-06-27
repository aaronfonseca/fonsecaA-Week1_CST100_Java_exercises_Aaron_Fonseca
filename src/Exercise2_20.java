/** Program: Exercise 2.20
* File: Exercise2_20.java
* Summary: (Financial application: calculate interest)
* Author: Aaron Fonseca
* Date: June 25, 2016
**/

import java.util.Scanner;

public class Exercise2_20 {
	public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);

			System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
			double balance = input.nextDouble();
			double annualInterestRate = input.nextDouble();

			// find interest
			double interest = balance * (annualInterestRate / 1200);
			interest = Math.round(interest * 10000) / 10000.0; //Round to four decimals

			System.out.println("The interest is " + interest);
		}
	}