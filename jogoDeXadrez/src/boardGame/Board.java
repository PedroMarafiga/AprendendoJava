package boardGame;

public class Board {
	
	private int Rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
	
		Rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}
	
	

	public int getRows() {
		return Rows;
	}



	public void setRows(int rows) {
		Rows = rows;
	}



	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

	public Piece[][] getPieces() {
		return pieces;
	}

	public void setPieces(Piece[][] pieces) {
		this.pieces = pieces;
	}
	
	public Piece piece(int row,int column) {
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getCollumn()];
	}
}
