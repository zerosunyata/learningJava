
public class FourChariots {
	public static int num = 0;
	public static final int MAXCHARIOTS = 4;
	public static int[] cols = new int[MAXCHARIOTS];

	public FourChariots() {
		for(int i = 0; i < MAXCHARIOTS; i ++)
			cols[i] = -1;
		getArrangement(0);
		System.out.print("\n");
		System.out.println(MAXCHARIOTS + " chariot has " + num + " solution(s)");		
	}

	public void printResult() {
		System.out.print("\n");
		System.out.println(MAXCHARIOTS + " chariot(s) has " + num + " solution(s)");
	}

	public void getArrangement(int n) {
		//1 init cols
		for(int i = n; i < MAXCHARIOTS; i ++)
			cols[i] = -1;

		//2 set rows to false, means we can put chariot on this row

		boolean[] rows = new boolean[MAXCHARIOTS];
		
		//3 set non available position
		for (int i = 0; i < n; i++) {
			rows[cols[i]] = true;
			if (cols[i] >= 0) {
				rows[cols[i] ] = true;
			}
	
		}

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
			if (rows[i])
				continue;
			cols[n] = i;
			if (n < MAXCHARIOTS - 1) {
				printStep(n);
				getArrangement(n + 1);
			} else {
				num++;
				printChessBoard();
			}
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
		FourChariots chariots = new FourChariots();
		chariots.getArrangement(0);		
		chariots.printResult();
	}
}
