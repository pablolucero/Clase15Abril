package model;

import junit.framework.Assert;

import model.Board;

import org.junit.Test;

public class TestBoard {

	@Test
	public void test() {
		Board b = new Board(4,5,0);
		Assert.assertTrue(b.getRows() == 4 && b.getColumns() == 5);
	}
	
	@Test
	public void test2() {
		Board b = new Board(4,5,0);
		b.addMine(1,1);
		Assert.assertTrue(b.hasMine(1,1));
	}
	
	@Test
	public void test3() {
		Board b = new Board(4,5,0);
		Assert.assertTrue(b.getValue(1,1) == 0);
	}
	
	@Test
	public void test4() {
		Board b = new Board(4,5,3);
		int count = 0;
		for (int i = 0; i < b.getRows(); i++) {
			for (int j=0; j < b.getColumns(); j++) {
				count = count + (b.hasMine(i, j) ? 1:0);
			}
		}
		Assert.assertTrue(count == 3);
	}
	
	@Test
	public void test5() {
		Board b = new Board(4,5,21);
		int count = 0;
		for (int i = 0; i < b.getRows(); i++) {
			for (int j = 0; j < b.getColumns(); j++) {
				count = count + (b.hasMine(i, j) ? 1:0);
			}
		}
		Assert.assertTrue(count == 20);
	}
	
	@Test
	public void test6() {
		Board b = new Board(4,5,0);
		b.addMine(1, 1);
		Assert.assertTrue(b.getValue(1,0) == 1);
	}
	
	@Test
	public void test7() {
		Board b = new Board(2,2,0);
		b.addMine(0,0);
		b.addMine(1,1);
		Assert.assertTrue(	b.hasMine(0,0) &&
							b.getValue(0,1) == 2 &&
							b.hasMine(1,1) &&
							b.getValue(1,0) == 2);
	}
	
	@Test
	public void test8() {
		Board b = new Board(3,3,0);
		b.addMine(0,0);
		b.addMine(1,1);
		Assert.assertTrue(	b.hasMine(0,0) &&
							b.getValue(0,1) == 2 &&
							b.getValue(0,2) == 1 &&
							b.getValue(1,0) == 2 &&
							b.hasMine(1,1) &&
							b.getValue(1, 2) == 1 &&
							b.getValue(2,0) == 1 &&
							b.getValue(2,1) == 1 &&
							b.getValue(2, 2) == 1);
	}
	
}
