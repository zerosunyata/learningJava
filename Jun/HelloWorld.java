package helloworld;

import less1.*;

public class HelloWorld {
	public static void main(String[] args) {
		mystring s = new mystring();
		System.out.println(s.toString());
		
		s.getPrefix();
		
		HelloWorld hello = new HelloWorld();
		System.out.println(hello.toString());
	}
}

