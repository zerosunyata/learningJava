/**

 * Read Textbook Chapter 1,2,3,4,5

 * @author Xueyu Yin

 *

 */

public class FixError {

	/*

	 * Find the error in each of the following code segments, and explain how to

	 * correct it:

	 * Errors:

	 * can only have one static void per class

	 * In a), add curly bracket ( } ) and make it <= 10

	 * In b), change 'int' value to 1 and make k != 1.0 to k <= 10 and k += 1 (not 0.1)

	 * In c), add break; under case 
	
	 * In d), add i <= 10 instead of i < 10 (to print ten)


	 */



	public static void main(String[] args) {

		a();

		b();

		c(1);

		d();

	}


	public static void a() {

		int i = 1;

		while (i <= 10) {

			System.out.println(i);
			
			++i; 
			
		}		

	}


	public static void b() {

		for (int k = 1; k <= 10; k += 1)

			System.out.println(k);

	}



	public static void c(int n) {

		switch (n) {

		case 1:

			System.out.println("The number is 1");

      break;

		case 2:

			System.out.println("The number is 2");

			break;

		default:

			System.out.println("The number is not 1 or 2");

			break;

		}

	}



	public static void d() {

//		The following code should print the values 1 to 10:

		int n = 1;

		while (n <= 10)

			System.out.println(n++);

	}

}
