import java.util.HashMap;
import java.util.Scanner;

public class Main {
	private EscapeModel model = new EscapeModel();
	private EscapeView view = new EscapeView();
	private HashMap<States, Room> hmap = new HashMap<States, Room>();
	private Scanner scan = new Scanner(System.in);
	EscapeView v = new EscapeView();

	public static void main(String[] args) {
		Main m = new Main();
		m.hashMap();
		m.go();
		}
	
	private void go() { 
		while (true) {
		Room currentroom = hmap.get(model.getState());
		v.printDescription(currentroom.getDescription());
		int input = scan.nextInt();
		System.out.println(currentroom.process(input));
	}
}

	public void hashMap() {
		hmap.put(States.LivingRoom, new LivingRoom(model) );
		hmap.put(States.bathroom, new bathroom(model) );
		hmap.put(States.basement, new basement(model) );
		hmap.put(States.Bedroom1, new Bedroom1(model) );
		hmap.put(States.bedroom2, new bedroom2(model) );
		hmap.put(States.diningroom, new diningroom(model) );
		hmap.put(States.poolroom, new poolroom(model) );
		hmap.put(States.greenhouse, new greenhouse(model) );
		hmap.put(States.kitchen, new kitchen(model) );
		hmap.put(States.shed, new shed(model) );
		hmap.put(States.garage, new garage(model) );
		hmap.put(States.gameroom, new gameroom(model) );
		
		
		
}

	
}
