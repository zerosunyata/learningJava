package palindromeRecursive;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PalindromeRecursive {
	
	public static void dict() {
		Map<String, String> vocab = new HashMap<String, String>();
		vocab.put("E", "3");
		vocab.put("J", "L");
		vocab.put("L", "J");
		vocab.put("S", "2");
		vocab.put("Z", "5");
		vocab.put("2", "S");
		vocab.put("3", "E");
		vocab.put("5", "Z");
	}
	
	public static boolean palindrome(String str, int h, int t) {
		
		Map<String, String> vocab = new HashMap<String, String>();
		vocab.put("E", "3");
		vocab.put("J", "L");
		vocab.put("L", "J");
		vocab.put("S", "2");
		vocab.put("Z", "5");
		vocab.put("2", "S");
		vocab.put("3", "E");
		vocab.put("5", "Z");
		
		if (h == t) {
			return true;
		}
		if (h == t-1) {
			if (str.charAt(h) != str.charAt(t))
				return false;
			return true;
		}
		if (str.charAt(h) != str.charAt(t)) {
			if (str.charAt(h) == 'E')
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