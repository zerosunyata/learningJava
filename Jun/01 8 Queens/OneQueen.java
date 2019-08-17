
public class OneQueen {
	public static int num = 0;
	public static final int MAXQUEEN = 16;
	public static int[] cols = new int[MAXQUEEN];
	
	public OneQueen() {
		for(int i = 0; i < MAXQUEEN; i ++)
			cols[i] = -1;
		getArrangement(0);
		System.out.print("\n");
		System.out.println(MAXQUEEN + " queen(s) has " + num + " solution(s)");		
	}
	
	public void getArrangement(int n) {
		for(int i = n; i < MAXQUEEN; i ++)
			cols[i] = -1;
		
		// set rows to false, means we can put queen on this row
		boolean[] rows = new boolean[MAXQUEEN];
		// set non available position
		for (int i = 0; i < n; i++) {
			rows[cols[i]] = true;
			int d = n - i;
			if (cols[i] - d >= 0)
				rows[cols[i] - d] = true;
			if (cols[i] + d <= MAXQUEEN - 1)
				rows[cols[i] + d] = true;

		}
		
		System.out.print("\nCol "+ n + " Status"+"\n");

		for(int i = 0; i < MAXQUEEN; i ++) {
			for(int j = 0; j < n; j ++)
				System.out.print("  ");
			if(rows[i])
				System.out.println("* ");
			else
				System.out.println("+ ");
		}
		
		System.out.println();
		
		// go deep
		for (int i = 0; i < MAXQUEEN; i++) {
			if (rows[i])
				continue;
			cols[n] = i;
			if (n < MAXQUEEN - 1) {
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

		for (int i = 0; i < MAXQUEEN; i++) {
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

		for (int i = 0; i < MAXQUEEN; i++) {
			for (int j = 0; j < MAXQUEEN; j++) {
				if (i == cols[j]) {
					System.out.print(i+" ");
				} else
					System.out.print("+ ");
			}
			System.out.print("\n");
		}

	}

	public static void main(String args[]) {
		OneQueen queen = new OneQueen();
	}
}
