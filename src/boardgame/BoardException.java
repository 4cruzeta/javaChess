package boardgame;

public class BoardException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	/*
	 * Esse construtor passa a mensagem para o construtor da super classe
	 */
	
	public BoardException(String msg) {
		super(msg);
	}
}
