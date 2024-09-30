
public class BoardView 
{
	IsolaBoard board;
	public void display() {
		for (int i = 0; i < board.getHeight(); i++) {
			for (int x = 0; x < board.getWidth(); x++) {
				System.out.print(board.get (i, x));
				
			}
			System.out.println();
		
		}
	}

	public BoardView (IsolaBoard board)
	{
		this.board = board;
	}

}
