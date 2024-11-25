
public class Controller2 {
	private GameModel model;
    private GameView view;
    private Controller1 red;
    private Controller1 black;

    
    public Controller2(GameModel model, GameView view) {
        this.model = model;
        this.view = view;
        this.red = new Controller1('R', model, view);
        this.black = new Controller1('B', model, view);
    }

    
   
    public void startGame() {
        boolean gameIsRunning = true;

        while (gameIsRunning) {
            view.drawBoard();
            boolean yesPeek = true;
       while (yesPeek) {
        if (view.askForPeek()) {
        	int[] peekCoordinates = view.askForPeekCoordinates();
            int row = peekCoordinates[0];
            int col = peekCoordinates[1];
            model.peek(row, col);
            view.drawStack(row, col);
        }
        else {
        	yesPeek = false;
        }
       }
            
         
            while (!black.move()) {
                
            }
            
         
            if (model.checkForWinner('B')) {
                System.out.println("Black wins!");
                break;
            }

            view.drawBoard();

           
            while (!red.move()) {
               
            }

           
            if (model.checkForWinner('R')) {
                System.out.println("Red wins!");
                break;
            }
        }

        view.close();
    }
}
}
