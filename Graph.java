/*
Write a program that input x- and y- coordinates of a point in the coordinate plane.
Based on these values, it then determines where it lies, on x- and y-axis, or in
any of the four quadrants.
*/

import java.util.Scanner;

public class Graph{

	public static void main(String[] args){

	int x, y;

	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter x-coordinate: ");

	x = in.nextInt();
	
	System.out.println("Enter y-coordinate: ");

	y = in.nextInt();

	if (x == 0 && y == 0)
		System.out.println("point is at origin");

	else if (x == 0 && (y > 0 || y < 0))
		System.out.println("point is on y-axis at y = " + y);

	else if ((x < 0 || x > 0) && y == 0)
		System.out.println("point is on x-axis at x = " + x);

	else if (x > 0 && y > 0)
		System.out.println("point is in 1st quadrant");

	else if (x < 0 && y > 0)
		System.out.println("point is in 2nd quadrant");

	else if (x < 0 && y < 0)
		System.out.println("point is in 3rd quadrant");

	else if (x > 0 && y < 0)
		System.out.println("point is in 4th quadrant");

	else
		System.out.println("something's wrong");

	}



}