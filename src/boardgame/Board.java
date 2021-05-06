package boardgame;

public class Board {
	private int rows; //qtde de linhas
	private int colunms;
	private Piece[][] pieces;
	public Board(int rows, int colunms) {
		this.rows = rows;
		this.colunms = colunms;
		pieces = new Piece[rows][colunms];
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getColunms() {
		return colunms;
	}
	public void setColunms(int colunms) {
		this.colunms = colunms;
	}
	public Piece[][] getPieces() {
		return pieces;
	}
	public void setPieces(Piece[][] pieces) {
		this.pieces = pieces;
	}
	
	public Piece piece(int row, int colunm) {
		return pieces[row] [colunm];
	}
	
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	
	//Metodo que coloca as peças no tabuleiro
	public void placePiece(Piece piece, Position position) {
		pieces[position.getRow()][position.getColumn()] = piece; // coloca piece na posição linha e coluna da Matriz pieces
		piece.position = position; // piece rece o position declarada no metodo
	}
	

}
