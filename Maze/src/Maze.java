
public class Maze {
	private int width;
	private int height;
	private char [] [] mazeArray;
	public Maze(int width, int height) {
		this.width = width;
		this.height = height;
		this.mazeArray = new char[width] [height];
	}
	public void set(char input, int row, int col) {
		mazeArray[col] [row] = input;
	}
	public int getHeight () {
		return height;
	}
	public int getWidth () {
		return width;
	}
	public void clear() {
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				if (get(j, i) == '.'){
					set(' ', j, i);
				}
		}
	}
}
	public char get(int row, int col) {
		return mazeArray[col] [row];
	}
	public String Solve(int startrow, int startcol, int endrow, int endcol, String direction) {
		if (startrow == endrow && startcol == endcol) {
			return direction;
			
		}
		set('.', startrow, startcol);
		// checking north
		if (get(startrow-1, startcol) == ' ') {
			String d = Solve(startrow-1, startcol, endrow, endcol, direction+ "N");
			if (d != null) {
				return d;
			}
		}
		if (get(startrow+1, startcol) == ' ') {
			String d = Solve(startrow+1, startcol, endrow, endcol, direction+ "S");
			if (d != null) {
				return d;
			}
		}
		if (get(startrow, startcol-1) == ' ') {
			String d = Solve(startrow, startcol-1, endrow, endcol, direction+ "E");
			if (d != null) {
				return d;
			}
		}
		if (get(startrow, startcol+1) == ' ') {
			String d = Solve(startrow, startcol+1, endrow, endcol, direction+ "W");
			if (d != null) {
				return d;
			}
		}
		
		return null;
	}
}
	
