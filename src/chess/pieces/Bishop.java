package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Bishop extends ChessPiece {

	public Bishop(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "B";
	}

	@Override
	public boolean[][] possibleMoves() { // to Bishop
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		Position p = new Position(0, 0);

		// nw
		p.setValue(position.getRow() - 1, position.getColumn() - 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) { // while position 'p' exist and there is
																				// no piece at there, position 'p' of
																				// mat is true
			mat[p.getRow()][p.getColumn()] = true;
			p.setValue(p.getRow() - 1, p.getColumn() - 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) { // testing position not null and the piece is an
																		// opponent piece
			mat[p.getRow()][p.getColumn()] = true;
		}

		// ne
		p.setValue(position.getRow() - 1, position.getColumn() + 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) { // while position 'p' exist and there is
																				// no piece at there, position 'p' of
																				// mat is true
			mat[p.getRow()][p.getColumn()] = true;
			p.setValue(p.getRow() - 1, p.getColumn() + 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) { // testing position not null and the piece is an
																		// opponent piece
			mat[p.getRow()][p.getColumn()] = true;
		}

		// se
		p.setValue(position.getRow() + 1, position.getColumn() + 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) { // while position 'p' exist and there is
																				// no piece at there, position 'p' of
																				// mat is true
			mat[p.getRow()][p.getColumn()] = true;
			p.setValue(p.getRow() + 1, p.getColumn() + 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) { // testing position not null and the piece is an
																		// opponent piece
			mat[p.getRow()][p.getColumn()] = true;
		}

		// sw
		p.setValue(position.getRow() + 1, position.getColumn() - 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) { // while position 'p' exist and there is
																				// no piece at there, position 'p' of
																				// mat is true
			mat[p.getRow()][p.getColumn()] = true;
			p.setValue(p.getRow() + 1, p.getColumn() - 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) { // testing position not null and the piece is an
																		// opponent piece
			mat[p.getRow()][p.getColumn()] = true;
		}

		return mat;
	}
}
