package palindromeRecursive;

import java.util.Scanner;

public class PalindromeRecursive {
	public static boolean palindrome(String str, int h, int t) {
		if (h == t) {
			return true;
		}
		if (h == t-1) {
			if (str.charAt(h) != str.charAt(t))
				return false;
			return true;
		}
		if (str.charAt(h) != str.charAt(t)) {
			return false;
		}
		return palindrome(str, h + 1, t - 1);
	}

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);

		if (a.hasNext()) {
			String palindrome = a.next();
			if (palindrome(palindrome, 0, palindrome.length()-1)) {
				System.out.println(palindrome + " -- is a palindrome");
			} else {
				System.out.println(palindrome + " -- is not a palindrome");
			}
		}
	}
}
