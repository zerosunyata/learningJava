import java.io.FileNotFoundException;
import java.util.Scanner;

public class Palindrome{

	public static boolean isPalindrome(String str, int a, int b) {
		// one char: if there is only one character
		if(a == b)
			return true;
		
		// two chars: not match
		if((str.charAt(a)) != (str.charAt(b)))
			return false;
		
		// more than two: check chars between a and b
		if(a < b - 1) {
			isPalindrome(str, a, b-1);
		} 
		
		return true;
	}

	public static void main(String[] args) throws FileNotFoundException {

		Scanner keyboard = new Scanner(System.in);

		String choice = "y";

		boolean done = false;
		do {
			System.out.println("Please enter a palindrome or exit to terminate the program: ");
			if (keyboard.hasNext()) {
				String str = keyboard.next();
				if (!str.equals("exit")) {
					int n = str.length();
					if (isPalindrome(str, 0, n - 1)) {
						System.out.println("The word "+str+" IS a Palindrome.");
					} else {
						System.out.println("The word "+str+" IS NOT a Palindrome.");
					}
				} else {
					done = true;
				}
			}

		} while (!done);

	}
}
