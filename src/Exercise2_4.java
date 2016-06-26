/** Program: Exercise 2.4
* File: Exercise2_4.java
* Summary: (Convert pounds into kilograms)
* Author: Aaron Fonseca
* Date: June 25, 2016
**/

import java.util.Scanner;
public class Exercise2_4 {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.print("Enter a number in pounds: ");
      
      double pounds = s.nextInt();
      double sum = pounds*0.454;
      sum = Math.round(sum * 100) / 100.0; //Round to two decimals
      System.out.println(pounds + " pounds is " + sum + " kilograms");
   }
} 