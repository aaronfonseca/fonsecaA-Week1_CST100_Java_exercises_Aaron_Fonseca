/** Program: Exercise 2.5
* File: Exercise2_5.java
* Summary: (Financial application: calculate tips)
* Author: Aaron Fonseca
* Date: June 25, 2016
**/

import java.util.Scanner;
public class Exercise2_5 {
	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the subtotal and a gratuity rate: ");
    double subtotal = input.nextDouble();
    double gratuityRate = input.nextDouble();
    double gratuity = subtotal * (gratuityRate / 100);
    double sum = subtotal + gratuity;
    sum = Math.round(sum * 100) / 100.0; //Round to two decimals
    System.out.println("The gratuity is " + gratuity + " and total is $" + sum);
 }
} 