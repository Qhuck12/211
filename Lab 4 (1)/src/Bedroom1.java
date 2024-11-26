import java.util.ArrayList;
import java.util.Random;

public class Bedroom1 extends Room {
	public Bedroom1(EscapeModel m) {
		super.model = m;
		setOption();
		
	}
	@Override
	public String getDescription() {
		
		return "This is the main bedroom and everything is a mess so searching might be difficult";
	}

	@Override
	protected ArrayList<String> setOption() {
		optionList.add("1. go to bathroom");
		optionList.add("2. Read a book");
		optionList.add("3. take a nap");
		return null;
	}

	@Override
	protected String process(int choice) {
		switch (choice) {
		case 1:
			model.setState(States.bathroom);
			return "Going to the bathroom";
		case 2:
			return readbook();
		case 3:
			return "taking a quick rest";
		}
		
		return null;
	}

	private String readbook() {
		Random r = new Random();
		int randomNumber = r.nextInt(1, 4);
		if(randomNumber ==1 ) {
			return "Hint: Go to the kitchen";
		}
		else if (randomNumber == 2) {
			return "This page has nothing informative";
		}
		else if(randomNumber == 3) {
			return "This page says something about the diningroom";
		}
		else if(randomNumber == 4) {
			return "This page talks about a fairy tale";
		}
			
		return null;
	}
	
}
