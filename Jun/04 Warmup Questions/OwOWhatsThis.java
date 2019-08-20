package owoWhatsThis;

import java.util.Scanner;

public class OwOWhatsThis {

	public int n = 0;

	public static boolean isEven(int n) {
		if (n % 2 == 0)
			return true;
		return false;
	}

	public static int question(int n, int j) {
		int max = 0;
		for (int i = n; i <= j; i++) {
//			System.out.print(alg(i) + " ");
			max = Math.max(max, alg(i));
		}
		return max;
	}

	public static int alg(int n) {
		int cycleLength = 1;
		while (n != 1) {
			if (!isEven(n)) {
				n = 3 * n + 1;
			} else {
				n = n / 2;
			}
			cycleLength++;
		}
		return cycleLength;
	}

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		if (a.hasNextInt()) {
			int n = a.nextInt();
			if (a.hasNextInt()) {
				int j = a.nextInt();
				System.out.println(question(n,j));
			}
			//System.out.println("cycle length = " + alg(n));
		}
	}
}
