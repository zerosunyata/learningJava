
public class TestChessboard {

	public static void main(String args[]) {
		ChessBoard board = new ChessBoard();
		board.readFromFile("src/chessboard.txt");
		System.out.print(board);
	}
}
