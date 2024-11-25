
public class Main {

	public static void Main(String[] args) {
		public static void main(String[] args) {
			Main m = new Main ();
			m.go();

		}
	}	
		public void go () {
			GameModel model = new GameModel();
			GameView view = new GameView(model);
			Controller2 controller = new Controller2(model, view);
			controller.startGame();
		


	}

}
