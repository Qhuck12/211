import java.util.ArrayList;

public class LivingRoom extends Room {
public LivingRoom(EscapeModel m) {
	super.model = m;
	setOption();
	
}
	
	public String getDescription() {
		String s = "This is the living Room where your search begins";
		return s;
	}

	
	public ArrayList<String> setOption() {
		optionList.add("1. go to bedroom");
		optionList.add("2. go to garage");
		optionList.add("3. search Living room for the item");
		
		return null;
	}

	@Override
	protected String process(int choice) {
		switch (choice) {
		
			case 1:
				model.setState(States.Bedroom1);
				return "going back to the bedroom1";
			case 2:
				model.setState(States.garage);
				return "going to the garage";
			case 3:
				return "Item is not in the Living Room";
		}
		return null;
	}
	
}
