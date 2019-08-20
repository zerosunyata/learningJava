import java.util.Scanner;

public class AllInAll {

	public static int search(char character, String str2, int index) {
		for (int i = index; i < str2.length(); i++) {
			if (str2.charAt(i) == character)
				return i;
		}
		return -1;
	}

	public static boolean work(String str1, int head, String str2, int head2) {
		int index1 = head;
		int index2 = head2;
		
		if (str1.length() == index1)
			return true;
		
		if (str2.length() == index2) 
			return false;
		
		int number = AllInAll.search(str1.charAt(index1), str2, index2);
		if (number == -1) {
			return false;
		} else {
			index1 = index1 + 1;
			index2 = number + 1;
			return(work(str1, index1, str2, index2));
			
		}
	}

	public static void main(String args[]) {
		String str1 = "";
		String str2 = "";
		int indexStr1 = 0;
		int indexStr2 = 0;

		Scanner input = new Scanner(System.in);
		
		str1 = input(input, "first");
		str2 = input(input, "second");
		
		boolean inWord = work(str1, indexStr1, str2, indexStr2);
		System.out.println("is string1 in string2? = " + inWord);
		
		
		
	}

	public static String input(Scanner input, String prompt) {
		String str = null;
		System.out.print("Please enter " + prompt + " word: ");
		if(input.hasNext())
			str = input.next();
		return str;
	}
}
