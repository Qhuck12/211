import java.util.ArrayList;

public class bathroom extends Room {

	public bathroom(EscapeModel m) {
		super.model = m;
		setOption();
		
	}
		
		public String getDescription() {
			String s = "This is the bathroom, ";
			return s;
		}

		
		public ArrayList<String> setOption() {
			optionList.add("1. go to bedroom1");
			optionList.add("2. check towel rack for the item");
			optionList.add("3. take a break");
			
			return null;
		}

		@Override
		protected String process(int choice) {
			switch (choice) {
			
				case 1:
					model.setState(States.Bedroom1);
					return "going back to the bedroom1";
				case 2:
					return "The towel rack has a note that says something about the shed";
				case 3:
					return "take a break and read the magazine";
			}
			return null;
		}
		
	}
