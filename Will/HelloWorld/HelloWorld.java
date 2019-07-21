package helloWorld;

import java.util.Scanner;
//import lesson1.test;
import lesson1.*;

public class HelloWorld {

	public static void main(String[] args) {
//		Test test = new Test();
//		test.inputAndPrint();
		myString s = new myString();
		System.out.println(s.toString());
		
		s.getPrefix();
		
		HelloWorld hello = new HelloWorld();
		System.out.println(hello.toString());
	}
}


