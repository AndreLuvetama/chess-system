package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

//classe torre
public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);
		
	}
	
	@Override
	public String toString() {
		return "R"; // onde tiver a peça Rook vai ter a letra R
	}
	
	
	
}
