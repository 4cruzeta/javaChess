package boardgame;

public class Piece {

	protected Position position; // atributo position protected para não ser 
								// visivel na camada xadrez.
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; 	// inicialmente não foi colocada no tabuleiro.
	}

	protected Board getBoard() { // protected apenas uso interno - tabuleiro.
		return board;
	}
		
}
