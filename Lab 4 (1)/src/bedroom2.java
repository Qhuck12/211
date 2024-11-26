import java.util.ArrayList;

public class bedroom2 extends Room {

	public bedroom2(EscapeModel m) {
		super.model = m;
		setOption();
		
	}
		
		public String getDescription() {
			String s = "This is the second bedroom, not much to look at here";
			return s;
		}

		
		public ArrayList<String> setOption() {
			optionList.add("1. go to LivingRoom");
			optionList.add("2. Check closet for any leads");
			optionList.add("3. Read diary left by the house owner");
			
			return null;
		}

		@Override
		protected String process(int choice) {
			switch (choice) {
			
				case 1:
					model.setState(States.Bedroom1);
					return "going back to the bedroom1";
				case 2:
					return "dshgdbg";
				case 3:
					return "fdsaf";
			}
			return null;
		}
		
	}