package controller;

import model.Board;

public class Minesweeper {

	private Board board;
	
	public Minesweeper(int rows, int columns, int mines) {
		this.board = new Board(rows, columns, mines);
	}
	
	public void mostrarJuego() {
		for (int x = 0; x < board.getRows(); x++) {
			for (int y = 0; y < board.getColumns(); y++) {
				if (board.hasMine(x,y)) {
					System.out.print("* ");
				} else {
					System.out.print(board.getValue(x, y) + " ");
				}
			}
			System.out.print("\n");
		}
	}
	
	public static void main(String[] args) {
		Minesweeper juego = new Minesweeper(5, 3, 2);
		
		juego.mostrarJuego();

	}

}
