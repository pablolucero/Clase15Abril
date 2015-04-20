package model.exception;

public class TooLittleMinesPerBoardException extends Exception {

	private static final long serialVersionUID = 1L;

	public TooLittleMinesPerBoardException() {
		super("Debería al menos poner una mina");
	}
}
