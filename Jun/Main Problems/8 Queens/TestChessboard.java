package eightQueen;


public class TestChessboard {

	public static void main(String args[]) {
		ChessBoard board = new ChessBoard();
		board.readFromFile("src/eightQueen/chessboard.txt");
		System.out.print(board);
	}
}
