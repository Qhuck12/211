

import static org.junit.Assert.*;

import org.junit.Test;

public class BoardTest {

	@Test
	public void defaultBoardTest() {
		IsolaBoard I = new IsolaBoard();
		if (I.getHeight() != 7) {
			fail("Height is not equal to 7");
		}
		if (I.getWidth() != 7) {
			fail("Width is not equal to 7");
		}
	}
	
	
	
	@Test
	public void customBoardTest() {
		IsolaBoard I = new IsolaBoard(6, 5);
		if (I.getHeight() != 5) {
			fail("Height is not equal to 5");
		}
		if (I.getWidth() != 6) {
			fail("Width is not equal to 6");
		}
	}

	
	@Test
	public void BoardSpaceTest() {
		IsolaBoard b = new IsolaBoard();
		if (b.get(0, 3) != BoardSpace.Player1) {
			fail("Did not get Player1, got " + b.get(0, 3));
		}
		if (b.get(6, 3) != BoardSpace.Player2) {
			fail("Did not get Player2, got " + b.get(6, 3));
		}
		if (b.get(5, 3) != BoardSpace.Available) {
			fail("Did not get Available, got " + b.get(5, 3));
		}
	}
	@Test
	public void FindPositionTest() {
		IsolaBoard t = new IsolaBoard();
		BoardPosition p = t.findPosition(BoardSpace.Player1);
		if (p.getRow() != 0 || p.getColumn() != 3) {
			fail("Did not get 0 or 3");
		}
		p = t.findPosition(BoardSpace.Player2);
		if (p.getRow() != 6 || p.getColumn() != 3) {
			fail("Did not get 6 or 3");
		}
	}
	@Test
	public void GetMoveTest() {
		IsolaBoard m = new IsolaBoard();
		m.movePlayer(BoardSpace.Player1, new BoardPosition(1,3));
		if (m.findPosition(BoardSpace.Player1).getRow() != 1 || m.findPosition(BoardSpace.Player1).getColumn() != 3) {
			fail("Player did not move");
		}
		m.movePlayer(BoardSpace.Player1, new BoardPosition(4,5));
		if (m.findPosition(BoardSpace.Player1).getRow() == 4 || m.findPosition(BoardSpace.Player1).getColumn() == 5) {
			fail("Player should not move");
		}
		m.movePlayer(BoardSpace.Player2, new BoardPosition(5,3));
		if (m.findPosition(BoardSpace.Player2).getRow() != 5 || m.findPosition(BoardSpace.Player2).getColumn() != 3) {
			fail("Player did not move");
		}
		m.movePlayer(BoardSpace.Player2, new BoardPosition(2,6));
		if (m.findPosition(BoardSpace.Player2).getRow() == 2 || m.findPosition(BoardSpace.Player2).getColumn() == 6) {
			fail("Player should not move");
		}
	}
		@Test
		public void CheckWinnerTest() {
			IsolaBoard c = new IsolaBoard(3, 3);
			if (c.checkWinner() != BoardSpace.Available) {
				fail("Should be no winner");
			}
			c.movePlayer(BoardSpace.Player1, new BoardPosition(1,1));
			c.movePlayer(BoardSpace.Player1, new BoardPosition(1,2));
			c.movePlayer(BoardSpace.Player1, new BoardPosition(0,2));
			if (c.checkWinner() != BoardSpace.Player2) {
				fail("Player2 should have won");
			}
			c = new IsolaBoard(3,3);
			c.movePlayer(BoardSpace.Player2, new BoardPosition(1,1));
			c.movePlayer(BoardSpace.Player2, new BoardPosition(1,2));
			c.movePlayer(BoardSpace.Player2, new BoardPosition(2,2));
			if (c.checkWinner() != BoardSpace.Player1) {
				fail("Player1 should have won");
			}
			BoardView b = new BoardView(c);
			b.display();
	}
}
