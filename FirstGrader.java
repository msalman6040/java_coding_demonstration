
import javax.swing.*;
import java.util.Random;

public class FirstGrader {

	public static void main(String[] args) {
		
		Random rand1 = new Random();
		

		int number1, number2;
		
		number1 = rand1.nextInt(9); 

		number2 = number1 + rand1.nextInt(3);


		String str = " " + number2 + " - " + number1;

		String strInput = JOptionPane.showInputDialog(null, str);

		int numInput = Integer.parseInt(strInput);

		if (numInput == number2 - number1)
			System.out.println("correct. You got it right!");
		else
			System.out.println("sorry. your answer was wrong."); 

	}


}

/* This example creates a program to teach a first grade child how to learn subtractions.
The program randomly generates two single-digit integers number1 and number2 with number1 >= number2 
and displays a question such as "What is 9 – 2?" to the student. After the student types the answer, 
the program displays whether the answer is correct.
*/

		