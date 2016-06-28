/** Program: Exercise 1.10
* File: Exercise1_10.java
* Summary: (Average speed in miles)
* Author: Aaron Fonseca
* Date: June 24, 2016
**/

public class Exercise1_10 {

	public static void main(String[] args) {
		double km = (14/45.5 * 60); //Find km per hour 
		km = Math.round(km * 100) / 100.0; //Round to two decimals
		
		double miles = km/1.6;//Find miles per hour
		miles = Math.round(miles * 100) / 100.0; //Round to two decimals
		
		System.out.println("Runner = (14 km / 45.5 min) x 60 min = " + km + " km per hour");
		System.out.println("Runner = (" + km + " km / 1.6) = " + miles + " miles per hour" );
		

	}

}
