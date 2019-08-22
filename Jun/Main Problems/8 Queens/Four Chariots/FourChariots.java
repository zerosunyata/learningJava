package fourChariots;
public class FourChariots {
	public static int nos = 0;
	public static final int MAXC = 8;
	public static int[] col = new int[MAXC];

	public FourChariots() {
		for (int i = 0; i < MAXC; i++)
			col[i] = -1;
	}

	public void fcsolution(int n) {
		for (int i = n; i < MAXC; i++) {
			col[i] = -1;
		}
		boolean[] rol = new boolean[MAXC];

		for (int i = 0; i < n; i++) {
			rol[col[i]] = true;
		}

		for (int i = 0; i < MAXC; i++) {
			if (rol[i])
				continue;
			col[n] = i;
			if (n < MAXC - 1) {
				fcsolution(n + 1);
			} else {
				nos++;
			}
		}
	}

	public void pnos() {
		System.out.print("Chariots: " + MAXC + " Number of Solutions: " + nos);
	}

	public static void main(String[] args) {
		FourChariots Charlotte = new FourChariots();
		Charlotte.fcsolution(0);
		Charlotte.pnos();
	}
}
