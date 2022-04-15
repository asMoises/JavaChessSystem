package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {

		ChessMatch chessMat = new ChessMatch();
		UI.printBoard(chessMat.getPieces());

	}

}
