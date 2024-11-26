import java.util.ArrayList;

public class greenhouse extends Room {

	public greenhouse(EscapeModel m) {
		super.model = m;
		setOption();
		
	}
		
		public String getDescription() {
			String s = "This is the living Room where your search begins";
			return s;
		}

		
		public ArrayList<String> setOption() {
			optionList.add("1. Go to pool room");
			optionList.add("2. If you have a shovel, try digging underneath the sign");
			optionList.add("3. Water the plants for the owner");
			
			return null;
		}

		@Override
		protected String process(int choice) {
			switch (choice) {
			
				case 1:
					model.setState(States.poolroom);
					return "going back to the pool room";
				case 2:
					if (model.hasShovel) {
					return "You found a note that says the key is near the kitchen";
			}
				else {
					return "You do not have a shovel, try looking for one";
					}
				case 3:
					return "you give the plants a nice watering";
			}
			return null;
		}
		
	}
