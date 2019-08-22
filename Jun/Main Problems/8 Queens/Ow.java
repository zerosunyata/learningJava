package eightQueen;

public class Ow {
	public static final int MAXQUEEN = 8;
	static ChessBoard chessboard = new ChessBoard();
	static boolean available[][] = new boolean[8][8];
	
	public void solve() {
		for (int i = 0; i < MAXQUEEN; i++) {
			for (int j = 0; i < MAXQUEEN; i++) {
				if (available[i][j] == true) {
					for (int k = j + 1; k < MAXQUEEN; k++) {
						available[i][k] = false;
					}
					if (available[i][j] == true) {
						for (int k = j - 1; k >= 0; k--) {
							if (available[i][k] == true) {
								for (int l = j + 1; l < MAXQUEEN; l++) {
									available[i][l] = true;
								}
							}
						}
					}
				}
			}
		}
	}
	
	public static void main(String args[]) {
		chessboard.readFromFile("src/chesschessboard.txt");
		System.out.print(chessboard);

		
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				available[i][j] = true;
				if (chessboard.get(i, j) == 'q') {
					available[i][j] = false;
				}
				if (chessboard.get(i, j) == 's') {
					available[i][j] = false;
				}

				if (chessboard.get(i, j) == '0') {
					boolean leftprotect = false;
					boolean hasLeftQueen = false;
					for (int k = j - 1; k >= 0; k--) {
						if (chessboard.get(i, k) == 'q' && leftprotect == false) {
							hasLeftQueen = true;
							break;
						}
						if (chessboard.get(i, k) == 's' && leftprotect == false) {
							leftprotect = true;
							break;
						}
					}
					boolean rightprotect = false;
					boolean hasRightQueen = false;

					for (int k = j + 1; k < 8; k++) {
						if (chessboard.get(i, k) == 'q' && rightprotect == false) {
							hasRightQueen = true;
							break;
						}
						if (chessboard.get(i, k) == 's' && rightprotect == false) {
							rightprotect = true;
							break;
						}
					}
					if (hasLeftQueen || hasRightQueen)
						available[i][j] = false;
				}
			}
		}
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(available[i][j] ? 'a' : 'n');
			}
			System.out.println();
		}
	}
}
