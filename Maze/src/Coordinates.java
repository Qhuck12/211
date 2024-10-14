
public class Coordinates {
	private int startrow, startcol, endrow, endcol;
	public Coordinates(int startrow, int startcol, int endrow, int endcol) {
		this.startrow = startrow;
		this.startcol = startcol;
		this.endrow = endrow;
		this.endcol = endcol;
	}
	public int getStartrow() {
		return startrow;
	}
	public int getStartcol() {
		return startcol;
	}
	public int getEndrow() {
		return endrow;
	}
	public int getEndcol() {
		return endcol;
	}
}
