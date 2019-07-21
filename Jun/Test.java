package helloworld;

import java.util.Scanner;

public class Test {
	public void OwOName() {
		String Fn = "";
		System.out.print("Please input your First Name\n");
		Scanner First = new Scanner(System.in);
		if(First.hasNext()) {
			Fn = First.next();
		}
		String Ln = "";
		System.out.print("Please input your Last Name\n");
		Scanner Last = new Scanner(System.in);
		if(Last.hasNext()) {
			Ln = Last.next();
		}
		System.out.println("Hello there, " + Fn + " " + Ln);
	}
}
