import java.util.ArrayList;

public class basement extends Room {

	public basement(EscapeModel m) {
		super.model = m;
		setOption();
		
	}
		
		public String getDescription() {
			String s = "This is the basement, a lot to be seached down here";
			return s;
		}

		
		public ArrayList<String> setOption() {
			optionList.add("1. go to Living Room");
			optionList.add("2. go to pool room");
			optionList.add("3. Search the storage room.");
			
			return null;
		}

		@Override
		protected String process(int choice) {
			switch (choice) {
			
				case 1:
					model.setState(States.Bedroom1);
					return "going back to the bedroom1";
				case 2:
					model.setState(States.poolroom);
					return "going to the pool room";
				case 3:
					return "";
			}
			return null;
		}
		
	}
