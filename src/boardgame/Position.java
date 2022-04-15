package boardgame; // camada de tabuleiro

public class Position {
	private int row;
	private int col;

	public Position() {

	}

	public Position(int row, int col) {
		this.row = row;
		this.col = col;
	}

	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}

	public void setValue(int row, int col) {

	}

	@Override
	public String toString() {
		return row + ", " + col;
	}

}
