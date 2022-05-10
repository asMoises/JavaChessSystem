package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Queen extends ChessPiece {

	public Queen(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "Q";
	}

	@Override
	public boolean[][] possibleMoves() { // to Rook
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		Position p = new Position(0, 0);

		// above
		p.setValue(position.getRow() - 1, position.getColumn());
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) { // while position 'p' exist and there is
																				// no piece at there, position 'p' of
																				// mat is true
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() - 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) { // testing position not null and the piece is an
																		// opponent piece
			mat[p.getRow()][p.getColumn()] = true;
		}

		// left
		p.setValue(position.getRow(), position.getColumn() - 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) { // while position 'p' exist and there is
																				// no piece at there, position 'p' of
																				// mat is true
			mat[p.getRow()][p.getColumn()] = true;
			p.setColumn(p.getColumn() - 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) { // testing position not null and the piece is an
																		// opponent piece
			mat[p.getRow()][p.getColumn()] = true;
		}

		// right
		p.setValue(position.getRow(), position.getColumn() + 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) { // while position 'p' exist and there is
																				// no piece at there, position 'p' of
																				// mat is true
			mat[p.getRow()][p.getColumn()] = true;
			p.setColumn(p.getColumn() + 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) { // testing position not null and the piece is an
																		// opponent piece
			mat[p.getRow()][p.getColumn()] = true;
		}

		// below
		p.setValue(position.getRow() + 1, position.getColumn());
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) { // while position 'p' exist and there is
																				// no piece at there, position 'p' of
																				// mat is true
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() + 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) { // testing position not null and the piece is an
																		// opponent piece
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		// above, moves of rook and bellow, moves of bishop 

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
