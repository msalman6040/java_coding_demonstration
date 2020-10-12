/* The US federal personal income tax is calculated based on the filing status and
taxable income. There are four filing statuses: single filers, married filing jointly,
married filing separately, and head of household. The tax rates for 2009 are shown below.

 */

import java.util.Scanner;

public class TaxCalculator{

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

	System.out.println("Enter 1 for single filer. Enter 2 for married filing jointly. " +
           "Enter 3 for married filing separately. Enter 4 for Head of household:");

	int taxSelection = in.nextInt();

        System.out.println("Enter Integer value for yearly income:");

        int Income = in.nextInt();

        if (taxSelection == 1)
            if (Income >= 0 && Income <=8350)
                System.out.println("Marginal Tax Rate is 10%");
            else if (Income >= 8351 && Income <=33950)
                System.out.println("Marginal Tax Rate is 15%");
            else if (Income >= 33951 && Income <=82250)
                System.out.println("Marginal Tax Rate is 25%");
            else if (Income >= 82251 && Income <=171550)
                System.out.println("Marginal Tax Rate is 28%");
            else if (Income >= 171551 && Income <=372950)
                System.out.println("Marginal Tax Rate is 33%");
            else if (Income >= 372951)
                System.out.println("Marginal Tax Rate is 35%");
        else if (taxSelection == 2)
            if (Income >= 0 && Income <=16700)
                System.out.println("Marginal Tax Rate is 10%");
            else if (Income >= 16701 && Income <=67900)
                System.out.println("Marginal Tax Rate is 15%");
            else if (Income >= 67901 && Income <=137950)
                System.out.println("Marginal Tax Rate is 25%");
            else if (Income >= 137051 && Income <=208850)
                System.out.println("Marginal Tax Rate is 28%");
            else if (Income >= 208851 && Income <=372950)
                System.out.println("Marginal Tax Rate is 33%");
            else if (Income >= 372951)
                System.out.println("Marginal Tax Rate is 35%");
        else if (taxSelection == 3)
            if (Income >= 0 && Income <=8350)
                System.out.println("Marginal Tax Rate is 10%");
            else if (Income >= 8351 && Income <=33950)
                System.out.println("Marginal Tax Rate is 15%");
            else if (Income >= 33951 && Income <=68525)
                System.out.println("Marginal Tax Rate is 25%");
            else if (Income >= 68526 && Income <=104425)
                System.out.println("Marginal Tax Rate is 28%");
            else if (Income >= 104426 && Income <=186475)
                System.out.println("Marginal Tax Rate is 33%");
            else if (Income >= 186476)
                System.out.println("Marginal Tax Rate is 35%");
        else if (taxSelection == 4)
            if (Income >= 0 && Income <=11950)
                System.out.println("Marginal Tax Rate is 10%");
            else if (Income >= 11951 && Income <=45500)
                System.out.println("Marginal Tax Rate is 15%");
            else if (Income >= 45501 && Income <=117450)
                System.out.println("Marginal Tax Rate is 25%");
            else if (Income >= 117451 && Income <=190200)
                System.out.println("Marginal Tax Rate is 28%");
            else if (Income >= 190201 && Income <=372950)
                System.out.println("Marginal Tax Rate is 33%");
            else if (Income >= 372951)
                System.out.println("Marginal Tax Rate is 35%");
    }
}
