package boardgame;

public class Piece {

	protected Position position; // signal to protected at UML Diag => #
	private Board board;
	
	public Piece() {
		
	}

	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}	
}
