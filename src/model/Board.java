package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Board {
	
	private int rows;
	private int columns;
	private int mines;
	private Cell[][] cells;

	public Board(int rows, int columns, int mines) {
		this.rows = rows;
		this.columns = columns;
		this.mines = mines;
		this.cells = new Cell[rows][columns];
		initBoard();
		setMines();
	}

	private void setMines() {
		int i = 0;
		while (i<mines && i < rows * columns) {
			int x = new Random().nextInt(this.rows);
			int y = new Random().nextInt(this.columns);
			if (!hasMine(x, y)) {
				addMine(x, y);
				i++;
			}
		}
	}

	private void setValues(int x, int y) {
		List<Position> ps = cells[x][y].getNearPositions();
		for (Position p : ps) {
			Cell c = cells[p.x][p.y];
			c.value = c.value + 1;
		}
	}

	private void initBoard() {
		for (int x = 0; x < rows; x++) {
			for (int y = 0; y < columns; y++) {
				cells[x][y] = new Cell(new Position(x, y));
			}
		}
		
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}
	
	public int getValue(int x, int y) {
		return cells[x][y].value;
	}

	public void addMine(int x, int y) {
		cells[x][y].isMine = true;
		setValues(x,y);
	}
	
	public boolean hasMine(int x, int y) {
		return cells[x][y].isMine;
	}
	
	public class Cell {
		public int value;
		public boolean isMine;
		public Position position;
		
		public Cell(int value, Position position) {
			this.value = value;
			this.isMine = false;
			this.position = position;
		}
		
		public Cell(Position position) {
			this.value = 0;
			this.isMine = false;
			this.position = position;
		}

		public List<Position> getNearPositions() {
			List<Position> positions = new ArrayList<Position>();
			int x = this.position.x;
			int y = this.position.y;
			
			for (int i = x-1; i <= x+1; i++) {
				for (int j = y-1; j <= y+1; j++) {
					if (0 <= i && i < rows && 0 <= j && j < columns && 
							(i != x || j != y)){
						positions.add(new Position(i, j));
					}
				}
			}
			
			return positions;
		}
	}
	
	protected class Position {
		public int x;
		public int y;
		
		public Position(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

}
