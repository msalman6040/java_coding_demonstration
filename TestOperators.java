public class TestOperators {
	public static void main(String[] args) {

/*	double y = 3.0;
	int x = (int)(20/y);
	System.out.println(x);
	x *= 7;
	System.out.println(x);
	x = ++x;
	System.out.println(x);

*/

	byte i = 50;
	short j = i;
	int k = j;
	long l = k;
	float m = l;
	double n = m;

	System.out.println("byte value: " + i);
	System.out.println("short value: " + j);
	System.out.println("int value: " + k);
	System.out.println("long value: " + l);
	System.out.println("float value: " + m);
	System.out.println("double value: " + n);

}
}