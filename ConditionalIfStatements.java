public class ConditionalIfStatements {

	public static void main(String[] args) {

		double score;

		score = 59.0;

		if (score >= 90.0)
			System.out.println("A");

		else if (score >= 80.0)
			System.out.println("B");

		else if (score >= 70.0)
			System.out.println("C");

		else if (score >= 60.0)
			System.out.println("D");

		else
			System.out.println("F");
	}

}