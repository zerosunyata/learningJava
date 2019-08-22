
public class TestChessboard {

	public static void main(String args[]) {
		boolean available[][] = new boolean[8][8];
		ChessBoard board = new ChessBoard();
		board.readFromFile("src/chessboard.txt");
		System.out.print(board);
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				available[i][j] = true;
				if (board.get(i, j) == 'q') {
					available[i][j] = false;
				}
				if (board.get(i, j) == 's') {
					available[i][j] = false;
				}

				if (board.get(i, j) == '0') {
					boolean leftprotect = false;
					boolean hasLeftQueen = false;
					for (int k = j - 1; k >= 0; k--) {
						if (board.get(i, k) == 'q' && leftprotect == false) {
							hasLeftQueen = true;
							break;
						}
						if (board.get(i, k) == 's' && leftprotect == false) {
							leftprotect = true;
							break;
						}
					}
					boolean rightprotect = false;
					boolean hasRightQueen = false;

					for (int k = j + 1; k < 8; k++) {
						if (board.get(i, k) == 'q' && rightprotect == false) {
							hasRightQueen = true;
							break;
						}
						if (board.get(i, k) == 's' && rightprotect == false) {
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
				System.out.print(available[i][j]?'a':'n');
			}
			System.out.println();
		}
	}
}
