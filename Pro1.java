import javax.swing.*;

public class Pro1{

	public static void main (String[] args) {

		final double PI = 3.14;

		String strRadius = JOptionPane.showInputDialog(null, "Enter Radius");

		int radius = Integer.parseInt(strRadius);

		if (radius > 0) {

		double area;

		area = PI * radius * radius;

		System.out.println(area);

		}

	}

}