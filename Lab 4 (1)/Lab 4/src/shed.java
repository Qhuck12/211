import java.util.ArrayList;

public class shed extends Room {

	public shed(EscapeModel m) {
		super.model = m;
		setOption();
		
	}
		
		public String getDescription() {
			String s = "This is the shed with some tools that might be able to help you in your search";
			return s;
		}

		
		public ArrayList<String> setOption() {
			optionList.add("1. go back to garage");
			optionList.add("2. Pick up shovel");
			optionList.add("3. Look around shed for clues");
			
			return null;
		}

		@Override
		protected String process(int choice) {
			switch (choice) {
			
				case 1:
					model.setState(States.garage);
					return "going to the garage";
				case 2:
					model.hasShovel = true;
					return "You now have a shovel that allows you to dig in certain rooms";
				case 3:
					return "No clues in the shed";
			}
			return null;
		}
		
	}
