package chess;

import boardGame.Board;
import boardGame.Piece;
import boardGame.Position;

public class ChessPiece extends Piece{
	
	private Color color;
	private int moveCount;
	
	public ChessPiece(Board board,Color color) {
		super(board);
		this.color = color;
	
	}
	
	
	public Color getColor() {
		return color;
	}



	public Position getChessPosition() {
		return 
	}
}
