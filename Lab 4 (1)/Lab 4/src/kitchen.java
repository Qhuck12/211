import java.util.ArrayList;

public class kitchen extends Room {

	public kitchen(EscapeModel m) {
		super.model = m;
		setOption();
		
	}
		
		public String getDescription() {
			String s = "This is the living Room where your search begins";
			return s;
		}

		
		public ArrayList<String> setOption() {
			optionList.add("1. Go to the Living Room");
			optionList.add("2. Go to the dining room");
			optionList.add("3. Read note on the counter");
			optionList.add("4. Check the fridge");
			
			return null;
		}

		@Override
		protected String process(int choice) {
			switch (choice) {
			
				case 1:
					model.setState(States.LivingRoom);
					return "Going to Living Room";
				case 2:
					model.setState(States.diningroom);
					return "Going to the diningroom";
				case 3:
					return "You open the note and it says to check the fridge";
				case 4: 
					model.hasKey = true;
					return "You check the fridge and found a key";
			}
			return null;
		}
		
	}
