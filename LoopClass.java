/* A colony of 800 poffins is increasing at the rate of 4% annually.
 When will their population first exceed 1200? */

public class LoopClass{

	public static void main(String[] args){

	int population = 800;

	int year = 0;

	while (population < 1200){

	population = (int)(population * 1.04);

	year = year + 1;

	

	};

	System.out.println(year);

	System.out.println(population);




	}

}