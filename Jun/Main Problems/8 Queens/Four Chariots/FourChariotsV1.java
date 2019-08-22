package fourChariots;

public class FourChariotsV1 {
	public static int num = 0;
	public static final int MAXCHARIOTS = 2;
	public static int[] cols = new int[MAXCHARIOTS];
	
	public FourChariotsV1() {
		// init cols		
	}
	
	public void printResult() {
		System.out.print("\n");
		System.out.println(MAXCHARIOTS + " chariot(s) has " + num + " solution(s)");
	}
	
	public void getArrangement(int n) {
		//1 init cols
		
		//2 set rows to false, means we can put chariot on this row
		
		boolean[] rows = new boolean[MAXCHARIOTS];
		//3 set non available position
		
		// read rules https://en.wikipedia.org/wiki/Xiangqi#Chariot
		
		
		// print information
		System.out.print("\nCol "+ n + " Status"+"\n");

		for(int i = 0; i < MAXCHARIOTS; i ++) {
			for(int j = 0; j < n; j ++)
				System.out.print("  ");
			if(rows[i])
				System.out.println("* ");
			else
				System.out.println("+ ");
		}
		
		System.out.println();
		
		// go deep
		for (int i = 0; i < MAXCHARIOTS; i++) {
			// check if rows[i] available 
			// if not available pass
			// if available put chariot at postion and go deep
		}

	}

	public void printStep(int n) {

		System.out.print("Try step "+ n +"\n");

		for (int i = 0; i < MAXCHARIOTS; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == cols[j]) {
					System.out.print(i+" ");
				} else
					System.out.print("+ ");
			}
			System.out.print("\n");
		}

	}

	
	public void printChessBoard() {

		System.out.print("NO." + num + " solution\n");

		for (int i = 0; i < MAXCHARIOTS; i++) {
			for (int j = 0; j < MAXCHARIOTS; j++) {
				if (i == cols[j]) {
					System.out.print(i+" ");
				} else
					System.out.print("+ ");
			}
			System.out.print("\n");
		}

	}

	public static void main(String args[]) {
		FourChariotsV1 chariots = new FourChariotsV1();
		chariots.getArrangement(0);		
		chariots.printResult();
	}
}
