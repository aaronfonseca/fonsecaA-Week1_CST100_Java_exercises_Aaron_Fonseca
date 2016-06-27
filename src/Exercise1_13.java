/** Program: Exercise 1.13
* File: Exercise1_13.java
* Summary: (Algebra: solve 2 * 2 linear equations)
* Author: Aaron Fonseca
* Date: June 24, 2016
**/

public class Exercise1_13 {

	public static void main(String[] args) {
		
		System.out.println("(Algebra: solve 2 x 2 linear equations) You can use Cramer's rule to solve the following 2 x 2 system of linear equation:");
		System.out.println("Write a program that solves the following equation and displays the value for x and y:");
		System.out.println("3.4x + 50.2y = 44.5");
		System.out.println("2.1x + .55y = 5.9");
		double a = 3.4;
		double b = 50.2;
		double c = 2.1;
		double d = 0.55;
		double e = 44.5;
		double f = 5.9;
		double x = ((e*d)-(b*f))/((a*d)-(b*c));
		double y = ((a*f)-(e*c))/((a*d)-(b*c));
		System.out.println("x = " + x);
		System.out.println("y = " + y);

	}

}
