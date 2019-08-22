package gaussSummation;
/**
 * mathematical induction
 * @author Ian
 *
 */
public class GaussSummation {
	/*
	 * Gauss summation
	 */

	public static int f(int n) {
		System.out.println("call f("+n+")");

		if (n == 1) {
			System.out.println("reach base condition.");
			return 1; // base case
		} else {
			System.out.println("f("+n+")"+"= f("+(n-1)+")"+"+"+n+".");
			return f(n - 1) + n; // induction
		}
	}
	
	public static void main(String args[]) {
//		System.out.println("f(1) = " + f(1));
//		System.out.println("f(2) = " + f(2));
		System.out.println("f(3) = " + f(3));
	}
}
