import java.util.Scanner;

public class p100 {
	
	public static int cycle = 0; 
	
	public static boolean algorithm(int j) {
		
		System.out.print(j + " ");
		cycle += 1;
		
		if(j == 1)
			return true;
		
		if(j % 2 == 1) {
			return(algorithm((3 * j) + 1));
		} else{
			return(algorithm(j/2));
		}
		
	}
	
	//initialize the cycle variable??
	public static int cycleLength(int n) {
		return n; 
	}

	public static void main(String args[]) {
		
		int i = 0;
		int j = 0;
		int max = 0; 
		
		Scanner input = new Scanner(System.in);
		i = input(input, "first");
		j = input(input, "second");
		
		for(int loop = i; loop < (j + 1); loop++) {
			System.out.println("Print for " + loop);
			p100.cycle = cycleLength(0);
			algorithm(loop);
			System.out.println("\nCycle = " + p100.cycle);
			
			max = Math.max(max, p100.cycle);
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
