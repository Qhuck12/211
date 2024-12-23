import java.util.Scanner;
import java.util.Scanner;
public class GameView {


	    private GameModel model;
	    private Scanner scanner;

	    
	    public GameView(GameModel model) {
	        this.model = model;
	        this.scanner = new Scanner(System.in);
	    }

	    
	    public void drawBoard() {
	    	System.out.println();
	        for (int i = 0; i < 7; i++) {
	            for (int j = 0; j < 7; j++) {
	                
	                Character topPiece = model.peekTop(i, j);
	                if (topPiece != null) {
	                    System.out.print(topPiece + " ");
	                } else {
	                    System.out.print("- ");
	                }
	            }
	            System.out.println(); 
	        }
	    }

	    
	    public void drawStack(int row, int col) {
	        String stackInfo = model.peek(row, col);
	        System.out.println(stackInfo);
	    }

	    
	    public int[] askForMove(char player) {
	        
	        int startRow, startCol, endRow, endCol;
	        while (true) {
	            try {
	                
	                System.out.print("Enter start row (0-6): ");
	                startRow = Integer.parseInt(scanner.nextLine());
	                
	                System.out.print("Enter start column (0-6): ");
	                startCol = Integer.parseInt(scanner.nextLine());
	                
	                
	                System.out.print("Enter end row (0-6): ");
	                endRow = Integer.parseInt(scanner.nextLine());
	                
	                System.out.print("Enter end column (0-6): ");
	                endCol = Integer.parseInt(scanner.nextLine());
	                
	                
	                return new int[] { startRow, startCol, endRow, endCol };
	            } catch (NumberFormatException e) {
	                System.out.println("Invalid input. Only enter integers from 0-6.");
	            }
	        }
	    }
	    
	    public boolean askForPeek() {
	        System.out.println();
	    	System.out.println("Do you want to peek at a stack? (y/n)");
	        Scanner scanner = new Scanner(System.in);
	        String response = scanner.nextLine();
	        return response.equals("y");
	        
	    }
	    
	    
	    public int[] askForPeekCoordinates() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter Row Coordinate (0-6): ");
	        int row = scanner.nextInt();
	        System.out.print("Enter Column Coordinate (0-6): ");
	        int col = scanner.nextInt();
	        return new int[]{row, col};
	        
	    }
	    	


	    public void close() {
	        scanner.close();
	    }
	}

