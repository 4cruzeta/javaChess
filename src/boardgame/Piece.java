package boardgame;

public abstract class Piece {

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
	
	public abstract boolean[][] possibleMoves();

	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}

	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}
