
/* Here is a program that checks whether a number is divisible by 2 and 3,
 whether a number is divisible by 2 or 3,
 and whether a number is divisible by 2 or 3 but not both:
*/

import java.util.Scanner;

public class Divisible{
	public static void main(String[] args) {
	
	int number;

	Scanner in = new Scanner(System.in);

	System.out.println("please input number.");

	number = in.nextInt();

	if ((number % 2 == 0) && (number % 3 == 0))
		System.out.println("number is divisible by 2 and 3");
	else if ((number % 2 == 0) || (number % 3 == 0))
		System.out.println("number is divisble by 2 or 3");
	else if ((number % 2 == 0) ^ (number % 3 == 0))
		System.out.println("number is divisble by 2 or 3 but not both");
	else
		System.out.println("number is not divisible by 2 or 3");
		 

	}
}