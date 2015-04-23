package model;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestBoard {

	@Test
	public void test() throws Exception {
		Board b = new Board(4,5,5);
		assertTrue(b.getRows() == 4 && b.getColumns() == 5);
	}
	
	@Test
	public void test2() throws Exception {
		Board b = new Board(4,5,10);
		b.addMine(1,1);
		assertTrue(b.hasMine(1, 1));
	}

	@Test
	public void test3() throws Exception {
		Board b = new Board(4,5,2);
//		assertTrue(b.getValue(1, 1) == 0);
	}

	@Test
	public void test4() throws Exception {
		Board b = new Board(4,5,3);
		int count = 0;
		for (int i=0; i<b.getRows(); i++) {
			for (int j=0; j<b.getColumns(); j++) {
				count = count + (b.hasMine(i, j)?1:0);
			}
		}
		assertTrue(count == 3);
	}

	@Test
	public void test5() throws Exception {
		Board b = new Board(4,5,10);
		int count = 0;
		for (int i=0; i<b.getRows(); i++) {
			for (int j=0; j<b.getColumns(); j++) {
				count = count + (b.hasMine(i, j)?1:0);
			}
		}
		assertTrue(count == 10);
	}

	@Test
	public void test6() throws Exception {
		Board b = new Board(4,5,2);
		b.addMine(1, 1);
		assertTrue(b.hasMine(1,1));
	}

	@Test
	public void test7() throws Exception {
		Board b = new Board(5,5,2);
		b.addMine(0,0);
		b.addMine(1,1);
		assertTrue(b.hasMine(0, 0) &&
				// b.getValue(0, 1) == 2 &&
				b.hasMine(1, 1)); // &&
				// b.getValue(1, 0) == 2);
	}

//	@Test
//	public void test8() throws Exception {
//		Board b = new Board(5,5,5);
//		b.addMine(0,0);
//		b.addMine(1,1);
//		assertTrue(b.hasMine(0, 0) &&
//				b.getValue(0, 1) == 2 &&
//				b.getValue(0, 2) == 1 &&
//				b.getValue(1, 0) == 2 &&
//				b.hasMine(1, 1) &&
//				b.getValue(1, 2) == 1 &&
//				b.getValue(2, 0) == 1 &&
//				b.getValue(2, 1) == 1 &&
//				b.getValue(2, 2) == 1);
//	}
	
}
