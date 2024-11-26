import java.util.ArrayList;

public class poolroom extends Room {
	public poolroom(EscapeModel m) {
		super.model = m;
		setOption();
		
	}
		
		public String getDescription() {
			String s = "This is the poolroom, don't play pool for too long, you still need to escape.";
			return s;
		}

		
		public ArrayList<String> setOption() {
			optionList.add("1. go to greenhouse");
			optionList.add("2. go to the basement");
			optionList.add("3. Start playing pool");
			optionList.add("4. Search under the pool tables for clues");
			optionList.add("5. Check the ball pocket for what made the strange noise");
			
			return null;
		}

		@Override
		protected String process(int choice) {
			switch (choice) {
			
				case 1:
					model.setState(States.greenhouse);
					return "going to the green house";
				case 2: 
					model.setState(States.basement);
					return "going to the basement";
				case 3:
					return "You started playing pool but then heard a strange noise when the ball went into the pocket. Maybe check it out";
				case 4:
					return "You search under the pool table, but no luck, there was nothing";
				case 5: 
					return "Somehow the 8ball got in the pocket";
			}
			return null;
		}
		
	}
