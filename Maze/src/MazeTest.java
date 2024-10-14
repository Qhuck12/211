import static org.junit.Assert.*;

import org.junit.Test;

public class MazeTest {

	@Test
	public void test() {
		Maze m = new Maze(2,3);
		if (m.getWidth() != 2 || m.getHeight() != 3) {
			fail("did not get height or width");
		}
		
	}
	@Test
	public void test2() {
		Maze m = new Maze(2,3);
		 m.set('1', 1, 1);
		 if (m.get(1,1) != '1') {
			 fail("did not get char");
		 }
		
	}
	@Test
	public void test3() {
		Maze m = new Maze(2,3);
		 m.set('.', 1, 1);
		 m.clear();
		 if (m.get(1,1) == '.') {
			 fail("did not clear");
		 }
		
	}
}
