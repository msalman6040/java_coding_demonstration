/* Write a program that prompts the user to enter an integer. 
If the number is a multiple of 5, print HiFive. 
If the number is divisible by 2, print HiEven.
*/

import javax.swing.*;

public class Multiple2Or5 {

	public static void main(String[] args) {

		//Takes integer input and stores in variable strInputedInteger as String.
		String strInputedInteger = JOptionPane.showInputDialog(null, "Enter Integer");

		//stores original integr in InputedInteger variable as Integer.
		int inputedInteger = Integer.parseInt(strInputedInteger);

		if (0 == inputedInteger % 2) {
		System.out.println("HiEven"); }

		if (0 == inputedInteger % 5) {
		System.out.println("HiFive"); }

	}

}