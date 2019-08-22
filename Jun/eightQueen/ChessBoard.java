package eightQueen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ChessBoard {

	public static final int MAXQUEEN = 8;

	private char chessboard[][];

	public ChessBoard() {
		setChessboard(new char[MAXQUEEN][MAXQUEEN]);
	}
	
	public void readFromFile(String filename) {
		Scanner input = null;
		try {
			input = new Scanner(new File(filename));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		input.useDelimiter(Pattern.compile("\\r\\n|\\n"));
		int row = 0;
		int col = 0;
		while (input.hasNext()) {
			String line = input.next();
			col = 0;
			for (char c : line.toCharArray()) {
				this.chessboard[row][col++] = c;
			}

			if (++row > MAXQUEEN)
				break;
		}
	}

	private char[][] getChessboard() {
		return chessboard;
	}

	private void setChessboard(char chessboard[][]) {
		this.chessboard = chessboard;
	}

	public char get(int row, int col) {
		return this.chessboard[row][col];
	}

	public void set(int row, int col, char c) {
		this.chessboard[row][col] = c;
	}

	public boolean isStone(int row, int col) {
		return get(row, col) == 's' ? true : false;
	}

	public String toString() {
		String returnString = "";
		for (int i = 0; i < MAXQUEEN; i++) {
			for (int j = 0; j < MAXQUEEN; j++) {
				if (this.chessboard[i][j] == '0')
					returnString += '+';
				if (this.chessboard[i][j] == 's')
					returnString += '*';
				if (this.chessboard[i][j] == 'q')
					returnString += 'Q';
			}
			returnString += "\n";
		}
		return returnString;
	}
}
