package palindrome;

import java.util.Scanner;

public class Palindrome {

	public static boolean isEven(String str) {
		if (str.length() % 2 == 0)
			return true;
		return false;
	}

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner a = new Scanner(System.in);
		boolean pal = false;

		if (a.hasNext()) {
			String palindrome = a.next();
			if (isEven(palindrome)) {
				int last = palindrome.length() - 1;
				for (int i = 0; i < palindrome.length() / 2; i++) {
					if (palindrome.charAt(i) != palindrome.charAt(last - i)) {
						System.out.println(palindrome + " -- is not a palindrome");
						pal = true;
						break;
					}
				}
				if (!pal)
					System.out.println(palindrome + " -- is a regular palindrome");
			}
			else {
				int last = palindrome.length() -1;
				for (int i = 0; i < last / 2; i++) {
					if (palindrome.charAt(i) != palindrome.charAt(last - i)) {
						System.out.println(palindrome + " -- is not a palindrome");
						pal = true;
						break;
					}
				}
				if (!pal)
					System.out.println(palindrome + " -- is a regular palindrome");
			}
		}
	}
}