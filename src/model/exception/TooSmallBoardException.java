package model.exception;

public class TooSmallBoardException extends Exception {

	private static final long serialVersionUID = 1L;

	public TooSmallBoardException() {
		super("El tablero es demasiado chico");
	}
}
