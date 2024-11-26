import java.util.ArrayList;

public class gameroom extends Room {

	public gameroom(EscapeModel m) {
		super.model = m;
		setOption();
		
	}
		
		public String getDescription() {
			String s = "This is the living Room where your search begins";
			return s;
		}

		
		public ArrayList<String> setOption() {
			optionList.add("1. go to back to basement");
			optionList.add("2. Play pacman on the arcade machine");
			optionList.add("3. Play CD labeled dialogue");
			
			return null;
		}

		@Override
		protected String process(int choice) {
			switch (choice) {
			
				case 1:
					model.setState(States.basement);
					return "going to the basement";
				case 2:
					return "playing pacman on this arcade machine reminds of when you were a child";
				case 3:
					return "You insert the CD and can faintly hear someone's voice saying to check the greenhouse and you faintly hear the word dig";
			}
			return null;
		}
		
	}