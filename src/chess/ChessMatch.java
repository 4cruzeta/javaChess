package chess;

import java.util.Iterator;

import boardgame.Board;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		board = new Board(8,8); 
		// Essa classe que define o tamanho do tabuleiro.
	}
	
	/* 
	 * libera apenas a camada de de xadrez, não a de tabuleiro.
	 * O programa não enxerga a peça interna do tabuleiro.
	 * 
	 */
	public ChessPiece [][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
			
		}
		return mat;
		
	}

}
