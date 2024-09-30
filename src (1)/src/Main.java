import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	IsolaBoard board = new IsolaBoard();
	BoardView view = new BoardView(board);
	
	public static void main(String[] args) {
		Main m = new Main ();
		m.go();
	
	}

	public void go ()
	
	{
		BoardSpace currentplayer = BoardSpace.Player1;
		view.display();
		PrintWriter pw = null;
		try {
			pw = new PrintWriter("game.dat");
		
		while (board.checkWinner() == BoardSpace.Available) {
			System.out.println("Enter your move " + currentplayer);
			Scanner scan = new Scanner(System.in);
			String move = scan.next();
			BoardPosition p = getPosition(board.findPosition(currentplayer), move, currentplayer);
			
			while (p == null) { 
				move = scan.next();
				p = getPosition(board.findPosition(currentplayer), move, currentplayer);
			}
			BoardPosition original = board.findPosition(currentplayer);
			board.movePlayer(currentplayer, p);
			if (original.getRow() == board.findPosition(currentplayer).getRow()&& original.getColumn() == board.findPosition(currentplayer).getColumn()) {
				System.out.println("Player did not move");
			}else {
				pw.println(move);
			if (currentplayer == BoardSpace.Player1) {
				currentplayer = BoardSpace.Player2;
			}else {currentplayer = BoardSpace.Player1;}
			}
			view.display();
		}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		pw.close();
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
