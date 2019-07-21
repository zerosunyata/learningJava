package helloworld;

import java.util.Scanner;

public class Test{
	public void inputAndPrint() {
		String firstName = "";
		System.out.print("Please imput your first name: ");
		Scanner in = new Scanner(System.in); 
		if (in.hasNext()) { 
			firstName = in.next();
		}
		String lastName = "";
		System.out.print("Please imput your last name: ");
		if (in.hasNext()) { 
			lastName = in.next();
		}
			System.out.println("Your name is: " + firstName + " " + lastName);
		}
}
