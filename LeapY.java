/* This program first prompts the user to enter a year as an int value
 and checks if it is a leap year.
A year is a leap year if it is divisible by 4 but not by 100,
 or it is divisible by 400.
 (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
*/

import java.util.Scanner;

public class LeapY {
	public static void main(String[] args){
	
	int year;	

	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter year: ");

	year = in.nextInt();

	if (year % 4 == 0 && year % 100 != 0) 
		System.out.println("Divisible by 4 and not 100");
	else if (year % 400 == 0)
		System.out.println("Divisible by 400");
	else
		System.out.println("Not divisible by either");
	}
}