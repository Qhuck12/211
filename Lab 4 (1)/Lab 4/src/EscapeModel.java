
public class EscapeModel {
	public States currentstate = States.LivingRoom;
	public void setState(States s) {
		currentstate = s;
	}
	public States getState() {
		return currentstate;
	}
	public boolean hasKey = false;
	public boolean hasShovel = false;
}
