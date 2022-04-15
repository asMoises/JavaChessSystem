package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch { // This class is the core of all chess game, here are the rules.

	private Board board;
	private int turn;
	private Color currentPlay;
	private boolean check;
	private ChessPiece enPassantVulnerable;
	private ChessPiece promoted;

	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}

	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];

		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}

		return mat;
	}

	private void initialSetup() {
		board.PlacePiece(new Rook(board, Color.WHITE), new Position(2, 1));
		board.PlacePiece(new King(board, Color.BLACK), new Position(0, 4));
		board.PlacePiece(new King(board, Color.WHITE), new Position(7, 4));
	}
}
