import java.util.ArrayList;

public abstract class Room {
	public abstract String getDescription();
	protected abstract ArrayList<String> setOption();
	protected ArrayList<String> optionList = new ArrayList<String>();
	protected abstract String process(int choice);
	protected EscapeModel model;
	
	
	public ArrayList<String> getOptions() {
		return optionList;
	}
	
	
}
