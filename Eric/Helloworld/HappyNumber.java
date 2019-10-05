import java.util.Scanner;

public class HappyNumber {

	public static int Happy(int x) {
		int sumOfSqure = 0;
		int m;
		int a = 0;
		m = x;
		while (m > 0) {
			a = m % 10;
			System.out.println(a);
			m = m / 10;
			sumOfSqure += a * a;
		}
		return (sumOfSqure);
	}

	public static void main(String args[]) {
		int anInt = 0;
		Scanner strInt = new Scanner(System.in);
		System.out.print("Enter any number:");
		anInt = strInt.nextInt();
		int initial = anInt;
		int sumOfSquare = Happy(anInt);
		while (sumOfSquare != 1) {
			if (sumOfSquare == initial) {
				System.out.println("Not Happy, new number=" + sumOfSquare);
				System.out.println("Oops, it is back to the original number now, DEAD LOOP!");
				System.out.println("");
				break;
			}
			sumOfSquare = Happy(sumOfSquare);
		}
		if (sumOfSquare == 1)
			System.out.println("Happy Number");

	}
}
