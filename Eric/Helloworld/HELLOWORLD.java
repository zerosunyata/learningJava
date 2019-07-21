package helloworld;

import java.util.Scanner;
import lesson1.*;

class Helloworld {
	public static void main(String[] args) {
//	Test test = new Test();
//	test.inputAndPrint();
	MyString s = new MyString();
	System.out.println(s.toString());
	
	s.getPrefix();
	
	Helloworld hello = new Helloworld();
	System.out.println(hello.toString());
	}
}