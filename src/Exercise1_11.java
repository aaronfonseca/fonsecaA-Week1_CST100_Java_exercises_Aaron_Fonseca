/** Program: Exercise 1.11
* File: Exercise1_11.java
* Summary: (Population projection)
* Author: Aaron Fonseca
* Date: June 24, 2016
**/

public class Exercise1_11 {

	public static void main(String[] args) {
		int population = 312032486;
		int seconds = 31536000; // Second in year
		int birth = 7;
		int deaths = 13;
		int immigrant = 45;
	
		System.out.println("One birth every 7 seconds");
		System.out.println("One death every 13 seconds");
		System.out.println("One new immigrant every 45 seconds");
		System.out.println("Write a program to display the population for each of the next five years. Assume the current population is 312,032,486 and one year has 365 days.");
		
		for(int x = 1; x < 6; x++) {
			population+= seconds/birth;
			population+= seconds/immigrant;
			population-= seconds/deaths;
			System.out.print("Population year " + x +" = " + population);
			System.out.println("\n");
	      }
	}

}