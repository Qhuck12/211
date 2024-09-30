import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Replay {
	IsolaBoard board = new IsolaBoard();
	BoardView view = new BoardView(board);
	
	public static void main(String[] args) {
		Replay m = new Replay ();
		m.go();
	
	}

	public void go ()
	
	{
		BoardSpace currentplayer = BoardSpace.Player1;
		view.display();
		Scanner scan = null;
		File file = new File("game.dat");
		try {
			scan = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		while (board.checkWinner() == BoardSpace.Available) {
			
			
			
			
			String line = scan.nextLine();
			System.out.println();
				
			BoardPosition p = getPosition(board.findPosition(currentplayer), line, currentplayer);
			board.movePlayer(currentplayer, p);
			view.display();
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (currentplayer == BoardSpace.Player1) {
				currentplayer = BoardSpace.Player2;
			}
			else { 
				currentplayer = BoardSpace.Player1;
			}
		}
		System.out.println("Player" + board.checkWinner());
		
		
	}
		public BoardPosition getPosition (BoardPosition current, String move, BoardSpace currentp)
		
		{
			if (move.contains("ne")) {
				int newrow = board.findPosition (currentp).getRow()-1;
				int newcol = board.findPosition(currentp).getColumn()+1;
				
						
				return new BoardPosition(newrow, newcol);
			}
			
			else if (move.contains("se")) {
				int newrow = board.findPosition (currentp).getRow()+1;
				int newcol = board.findPosition(currentp).getColumn()+1;
				
				
				return new BoardPosition(newrow, newcol);
			}
			
			else if (move.contains("nw")) {
				int newcol = board.findPosition (currentp).getColumn()-1;
				int newrow = board.findPosition(currentp).getRow()-1;
				
				return new BoardPosition(newrow, newcol);
			}
			
			else if (move.contains("sw")) {
				int newcol = board.findPosition (currentp).getColumn()-1;
				int newrow = board.findPosition(currentp).getRow()+1;
				
				return new BoardPosition(newrow, newcol);
			}
			if (move.contains("n")) {
				int newrow = board.findPosition (currentp).getRow()-1;
				int col = board.findPosition(currentp).getColumn();
				
						
				return new BoardPosition(newrow, col);
			}
			
			else if (move.contains("s")) {
				int newrow = board.findPosition (currentp).getRow()+1;
				int col = board.findPosition(currentp).getColumn();
				
				
				return new BoardPosition(newrow, col);
			}
			
			else if (move.contains("e")) {
				int newcol = board.findPosition (currentp).getColumn()+1;
				int row = board.findPosition(currentp).getRow();
				
				return new BoardPosition(row, newcol);
			}
			
			else if (move.contains("w")) {
				int newcol = board.findPosition (currentp).getColumn()-1;
				int row = board.findPosition(currentp).getRow();
				
				return new BoardPosition(row, newcol);
			}
			
				return null;
		
	}
}
