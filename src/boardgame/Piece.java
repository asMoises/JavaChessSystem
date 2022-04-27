package boardgame;

public class Piece {

	protected Position position; // signal to protected kind at UML is #
	private Board board;
	

	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}	
}
