/** Program: Exercise 1.7
* File: Exercise1_7.java
* Summary: Write a program that displays the result
* Author: Aaron Fonseca
* Date: June 24, 2016
**/

public class Exercise1_7 {

public static void main(String[] args) {
	  //(Program with results)
      System.out.println("        1   1   1    1   1 ");
      System.out.println("4 x (1 -- + --  -- + --  --  ) = " + 
      (4*(1.0 -(1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))));
      System.out.println("        3   5   7    9   11");
      System.out.println("\n");
      System.out.println("        1   1   1    1   1   1");
      System.out.println("4 x (1 -- + --  -- + -- -- + -- ) = " + 
      (4 * (1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/ 11) + (1.0/13))));
      System.out.println("        3   5   7    9   11  13");
   }
}
