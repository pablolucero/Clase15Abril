package model.exception;

public class TooManyMinesPerBoardException extends Exception {

	private static final long serialVersionUID = 1L;

	public TooManyMinesPerBoardException() {
		super("El porcentaje maximo de minas por tablero es del 70%");
	}
}
