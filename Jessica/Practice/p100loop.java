import java.util.Scanner;

public class p100loop {
	
	public static int algorithm(int j) {
		
		int cycle = 1;
		
		do {
			System.out.print(j + " ");
			cycle += 1;
			
//			if(j == 1)
//				return cycle;
			
			if(j % 2 == 1)
				j = (3 * j) + 1;
			else
				j = (j/2);
			
		}while(j!=1);
		
		return cycle; 
		
		
	}
	
	//initialize the cycle variable??
	public static int cycleLength(int n) {
		return n; 
	}
	
	public static void printAndAdd(int j) {
	
	}

	public static void main(String args[]) {
		
		int i = 0;
		int j = 0;
		int max = 0; 
		int cycle = 0;
		
		Scanner input = new Scanner(System.in);
		i = input(input, "first");
		j = input(input, "second");
		
		for(int loop = i; loop < (j + 1); loop++) {
			System.out.println("Print for " + loop);
//			p100.cycle = cycleLength(0)
			cycle = algorithm(loop);
			System.out.println("\nCycle = " + cycle);
			
			max = Math.max(max, cycle);
//			if(p100.cycle > max)
//				max = p100.cycle;
		}
		
		System.out.println("Max number = " + max);	
		
	}
	
	public static int input(Scanner input, String prompt) {
		int number = 0;
		System.out.println("Please print " + prompt + " number: ");
		if(input.hasNext())
			number = input.nextInt();
		return number;
	}
}
