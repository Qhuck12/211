
public class MazeView {
	Maze maze;
	public void display() {
		for (int i = 0; i < maze.getHeight(); i++) {
			for (int x = 0; x < maze.getWidth(); x++) {
				System.out.print(maze.get (i, x));
				
			}
			System.out.println();
		
		}
	}

	public MazeView (Maze maze)
	{
		this.maze = maze;
	}

}

