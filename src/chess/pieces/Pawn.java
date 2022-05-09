package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Pawn extends ChessPiece {

	public Pawn(Board board, Color color) {
		super(board, color);

	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

		Position p = new Position(0, 0);

		// white pawn (at mat, it is a decrease count)
		if (getColor() == Color.WHITE) {

			// Testing place to one movement of pawn
			p.setValue(position.getRow() - 1, position.getColumn()); // Piece Position
			if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}

			// Testing the second place to pawn at its first move
			p.setValue(position.getRow() - 2, position.getColumn()); // Piece position
			Position p2 = new Position(position.getRow() - 1, position.getColumn());
			if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) && getBoard().positionExists(p2)
					&& !getBoard().thereIsAPiece(p2) && getMoveCount() == 0) {
				mat[p.getRow()][p.getColumn()] = true;
			}

			// testing move to catch the opponent piece at left diagonal
			p.setValue(position.getRow() - 1, position.getColumn() - 1); // Piece Position
			if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}

			// testing move to catch the opponent piece at right diagonal
			p.setValue(position.getRow() - 1, position.getColumn() + 1); // Piece Position
			if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
		} else {
			// black pawn (at mat, it is a increase count)
			// Testing place to one movement of pawn
			p.setValue(position.getRow() + 1, position.getColumn()); // Piece Position
			if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}

			// Testing the second place to pawn at its first move
			p.setValue(position.getRow() + 2, position.getColumn()); // Piece position
			Position p2 = new Position(position.getRow() + 1, position.getColumn());
			if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) && getBoard().positionExists(p2)
					&& !getBoard().thereIsAPiece(p2) && getMoveCount() == 0) {
				mat[p.getRow()][p.getColumn()] = true;
			}

			// testing move to catch the opponent piece at left diagonal
			p.setValue(position.getRow() + 1, position.getColumn() - 1); // Piece Position
			if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}

			// testing move to catch the opponent piece at right diagonal
			p.setValue(position.getRow() + 1, position.getColumn() + 1); // Piece Position
			if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
		}

		return mat;
	}
	
	@Override
	public String toString() {
		return "P";
	}
}
