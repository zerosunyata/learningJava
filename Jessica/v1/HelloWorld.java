import java.util.Scanner;

public class HelloWorld { //extends Object

	// refractering
	public static void main(String[] args) {
//		Test test = new Test();
//		test.inputAndPrint();
		MyString s = new MyString();
		System.out.println(s.toString());
		
		//variable = field = member
		//visible = accesible/touch (private/protected/not the same package)
		//s.getPrefix(); //public 
		
		HelloWorld hello = new HelloWorld();
		System.out.println(hello.toString()); //hashcode = byte (unique address)
	}
}

//method = action verbs
	//object names = names

//hw = bmi little thing

// String firstName;
//System.out.println("Hello World!");
//// keyboard
//Scanner in = new Scanner(System.in);
//System.out.print("Please imput your first name: ");
//if (in.hasNext()) {
//	// firstName = in.next();
//	String firstName = in.next();
//	System.out.print("Please imput your last name: ");
//	// if (in.hasnext()); (
//	// lastname = in.next() )
//	String lastName = in.next();
//	System.out.println("Your name is: " + firstName + " " + lastName);
////	s = "abc";
