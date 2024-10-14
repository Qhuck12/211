import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class Ei {
private ArrayList<Coordinates> c_pair = new ArrayList<Coordinates> ();
	public static void main(String[] args) {
		Ei e = new Ei ();
		e.go();
	}
	
	
	public void go () {
		
		Maze m = getMazefromfile();
		MazeView v = new MazeView(m);
		v.display();
		for (int i = 0; i < c_pair.size(); i++) {
			String answer = m.Solve(c_pair.get(i).getStartrow(), c_pair.get(i).getStartcol(), c_pair.get(i).getEndrow(), c_pair.get(i).getEndcol(), "");
			if (answer == null || answer == "") {
				answer = "impossible";
			}
			System.out.println(answer);
			m.clear();
		}
	}


	private Maze getMazefromfile() {
			JFileChooser chooser = new JFileChooser();
			int returnVal = chooser.showOpenDialog(null);
			File file = null;

		    if(returnVal == JFileChooser.APPROVE_OPTION) {
		    	file = chooser.getSelectedFile();
		    }
			Scanner scan = null;
			try {
				scan = new Scanner(file);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			////////
			
			
			int Width = Integer.parseInt(scan.nextLine());
			int Height = Integer.parseInt(scan.nextLine());
			Maze ma = new Maze(Width, Height);
			for (int row = 0; row < Height; row++) {
				String Line = scan.nextLine();
				for (int col = 0; col < Width; col++) {
					char c = Line.charAt(col);
					ma.set(c, row, col);
				}
				
			}
			while (scan.hasNextLine()) {
				String [] line = scan.nextLine().split(" ");
				int startrow = Integer.parseInt(line[0]);
				int startcol = Integer.parseInt(line[1]);
				int endrow = Integer.parseInt(line[2]);
				int endcol = Integer.parseInt(line[3]);
				c_pair.add(new Coordinates(startrow, startcol, endrow, endcol));
			}
		return ma;
	}
}
		
	

