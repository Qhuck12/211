import java.util.ArrayList;

public class diningroom extends Room {

	public diningroom(EscapeModel m) {
		super.model = m;
		setOption();
		
	}
		
		public String getDescription() {
			String s = "This is the diningroom, enjoy a bite to eat";
			return s;
		}

		
		public ArrayList<String> setOption() {
			optionList.add("1. go back to kitchen");
			optionList.add("2. Grab some food from the fridge");
			optionList.add("3. Look in pantry for item");
			
			return null;
		}

		@Override
		protected String process(int choice) {
			switch (choice) {
			
				case 1:
					model.setState(States.kitchen);
					return "going to the kitchen";
				case 2:
					return "";
				case 3:
					return "fdsaf";
			}
			return null;
		}
		
	}
