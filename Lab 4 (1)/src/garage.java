import java.util.ArrayList;

public class garage extends Room{

	public garage(EscapeModel m) {
		super.model = m;
		setOption();
		
	}
		
		public String getDescription() {
			String s = "This is the living Room where your search begins";
			return s;
		}

		
		public ArrayList<String> setOption() {
			optionList.add("1. Go to Living Room");
			optionList.add("2. Go to shed");
			optionList.add("3. Grab the car keys and Search the car");
			
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