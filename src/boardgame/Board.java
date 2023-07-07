package boardgame;

public class Board {
	
	private int rows;
	private int columns;
	private Piece [][] pieces;
	public Board(int rows, int columns) {
		if (rows < 1 || columns < 1) {
			throw new BoardException("Erro: pelo meno uma linha e uma coluna.");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}
	public int getRows() {
		return rows;
	}
	
	/*
	 * Uma vez criado o tabuleiro não se muda linhas e colunas.
	 */
	
	public int getColumns() {
		return columns;
	}
		
	public Piece piece(int row, int column) {
		if (!positionExists(row, column)) {
		throw new BoardException("Não há essa posição no tabuleiro.");	
		}
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		if (!positionExists(position)) {
		throw new BoardException("Não há essa posição no tabuleiro.");	
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	
	/*
	 * atribui à matriz pieces (declarada na classe Board e instanciada no
	 * construtor) na posição dada, a piece informada. Atualiza a posição.
	 */
	public void placePiece(Piece piece, Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("Já tem uma peça na posição: " + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	public Piece removePiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Não há essa posição no tabuleiro.");	
			}
		if (piece(position) == null) {
			return null;
		}
		Piece aux = piece(position);
		aux.position = null;
		pieces[position.getRow()][position.getColumn()] = null;
		return aux;
	}
	
	/*
	 * Método auxiliar que facilita teste pela linha e coluna.
	 */
	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
			
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	
	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Não há essa posição no tabuleiro.");
		}
		return piece(position) != null;
		
	}
}
