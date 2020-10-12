/* Write a program that prompts the user to enter a year 
and displays the animal for the year.
*/

import java.util.Scanner;

public class AnimalYear{
	public static void main(String[] args){
	
	int year;

	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter year: ");

	year = in.nextInt();

	year = year % 12;

	switch(year){

	case 0:
		System.out.println("year of the monkey");
		break;	
	case 1:
		System.out.println("year of the rooster");
		break;
	case(2):
		System.out.println("year of the dog");
		break;
	case(3):
		System.out.println("year of the pig");
		break;
	case(4):
		System.out.println("year of the rat");
		break;
	case(5):
		System.out.println("year of the ox");
		break;
	case(6):
		System.out.println("year of the tiger");
		break;
	case(7):
		System.out.println("year of the rabbit");
		break;
	case(8):
		System.out.println("year of the dragon");
		break;
	case(9):
		System.out.println("year of the snake");
		break;
	case(10):
		System.out.println("year of the horse");
		break;
	case(11):
		System.out.println("year of the sheep");
		break;
	default:
		System.out.println("done");

	}

	}
}