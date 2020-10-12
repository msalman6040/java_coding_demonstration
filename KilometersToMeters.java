import javax.swing.*;

public class KilometersToMeters{


	public static void main (String[] args){

		// takes double input for value of kilometers, stores string in variable strKilometers
		String strKilometers = JOptionPane.showInputDialog(null,"Enter kilometers");

		//converts string strKilometers into double kilometers
		double kilometers = Double.parseDouble(strKilometers);
	
		//multiplies Kilometers by 1000 to return Meters. Stores in variable meters
		double meters = kilometers * 1000;

		
		System.out.println("meters = " + meters);
		

	


	}

}