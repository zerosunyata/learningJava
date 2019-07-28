/**
 * Read Textbook Chaper 1,2,3,4,5
 * @author Xueyu Yin
 *
 */


public class FixError {
	/**
	 * Find the error in each of the following code segments, and explain how to
	 * correct it:
	 */

	public static void main(String[] args) {
		a();
		b();
		c(1);
		d();
	}

	public static void a() {
		int i = 1;
		while (i <= 10) // no end statement for loops and other statements
			System.out.println(i++);
	}

	public static void b() {
		for (double k = 0.1; k <= 1.1; k += 0.1) // int value is whole numbers only
			System.out.println(k);
	}

	public static void c(int n) {
		switch (n) {
		case 1:
			System.out.println("The number is 1");
			break; // break
		case 2:
			System.out.println("The number is 2");
			break;
		default:
			System.out.println("The number is not 1 or 2");
			break;
		}
	}

	public static void d() {
		//		The following code should print the values 1 to 10:
		int n = 1;
		while (n <= 10) // less or equal
			System.out.println(n++);
	}
}