package owoWhatsThis;

import java.util.Scanner;

public class P673 {
	public static boolean isCorrect(String str) {
		Stack problem = new Stack();
		
		if (str.length() % 2 == 0) {
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if (c == '(' || c == '[')
					problem.push(c);
				else {
					char pop = problem.pop();
					if ((c == ')' && pop == '(') || (c == ']' && pop == '[')) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public static boolean isLeft(String str) {
		if (str == "[" || str == "(") {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);

		if (a.hasNext()) {
			String unsolved = a.next();
			if(isCorrect(unsolved)) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
//			System.out.print(problem.pop());
//			System.out.print(problem.pop());
//			System.out.print(problem.pop());
//			System.out.print(problem.pop());
//			System.out.print(problem.pop());

		}
//		if(a.hasNextInt()) {
//			int lines = a.nextInt();
//			if(a.hasNext("3"));
//			String unsolved = a.next();
//			if(isCorrect(unsolved)) {
//				System.out.println("Yes");
//			}
//			else {
//				System.out.println("No");
//			}
//		}
	}
}
