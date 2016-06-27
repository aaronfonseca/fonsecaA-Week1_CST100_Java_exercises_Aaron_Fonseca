/** Program: Exercise 4.22
* File: Exercise4_22.java
* Summary: (Check substring) 
* Author: Aaron Fonseca
* Date: June 25, 2016
**/

import java.util.Scanner;

public class Exercise4_22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter string s1: ");
		String str1 = input.nextLine();

		System.out.print("Enter string s2: ");
		String str2 = input.nextLine();

		//Yeah fancy ternary java 
		System.out.println(str2 + ((str1.contains(str2)) ? " is " : " is not ") + "a substring of " + str1);
	}
}