/** Program: Exercise 2.23
* File: Exercise2_23.java
* Summary: Cost of driving)
* Author: Aaron Fonseca
* Date: June 25, 2016
**/

import java.util.Scanner;

public class Exercise2_23 {
	public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter the driving distance: ");
			double drivingDistance = input.nextDouble();
			
			System.out.print("Enter miles per gallon: ");
			double milesPerGallon = input.nextDouble();
			
			System.out.print("Price per gallon: ");
			double pricePerGallon = input.nextDouble();
			
			double costOfDriving = (drivingDistance/milesPerGallon) * pricePerGallon;
			costOfDriving = Math.round(costOfDriving * 100) / 100.0; //Round to two decimals
			
			System.out.print("The cost of driving is: $" + costOfDriving);

		}
	}