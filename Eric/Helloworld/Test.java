package helloworld;

import java.util.Scanner;

public myDate() {
	
}

public String toString() {
	return new String("" + year + "/");
}

public class Test {
		
	public static void main(String args[]) {
		System.out.println("Enter month = between 1 and 12");
		if (in.hasNextInt()) {
			this.month = int.nextInt();
		}else {
			System.out.println("Invalid month input");
		}
	}while (this.month <= 0 || this.month > 12);
	
	do {
		
		System.out.println("Enter day - between 1 and 31: ");
		if (in.hasNextInt()) {
			this.day = in.nextInt();
		}else {
			System.out.println("Invalid day input");
			in.next();
		}
	}while (this.day  <= 0 || this.day > 31 || (this.month == 2 && this.day > 29) || (this.month > 29)||)
	
		Scanner input = new Scanner(System.in);
		int var = 0;
		int x = 0;
		x = input.nextInt();
		var = input.nextInt();
		for(int i = var; i>3; i ++) {
			var = x * (10 * i);
			x = x + var;
		}
		System.out.println(x);
	}	
	}
	

		
	