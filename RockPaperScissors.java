import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors{

	public RockPaperScissors(){
		String gameState;

		do {
			Random computerDecision = new Random();
			int cdecision = computerDecision.nextInt(3);
			//0 = rock
			//1 = paper
			//2 = scissors

		
			Scanner playerDecision = new Scanner(System.in);
			System.out.println("Pick between 'rock', 'paper', or 'scissors'.");
			System.out.println("Or X to exit the game.");
			String pdecision = playerDecision.nextLine();

			if (pdecision.equals("X")){
				break;
			}


			if (!pdecision.equals("rock") && !pdecision.equals("paper") && !pdecision.equals("scissors")) {
		
			} else if (cdecision == 0) {
			System.out.println("Computer chooses rock");
			} else if (cdecision == 1) {
			System.out.println("Computer chooses paper");
			} else if (cdecision == 2) {
			System.out.println("Computer chooses scissors");
			}


			if (!pdecision.equals("rock") && !pdecision.equals("paper") && !pdecision.equals("scissors")) {
			System.out.println("Invalid input.");
			System.out.println("\n");
			} else if (pdecision.equals("rock") && cdecision == 1) {
			System.out.println("Computer wins!");
			System.out.println("\n");
			} else if (pdecision.equals("rock") && cdecision == 2) {
			System.out.println("Player wins!");
			System.out.println("\n");
			} else if (pdecision.equals("paper") && cdecision == 2) {
			System.out.println("Computer wins!");
			System.out.println("\n");
			} else if (pdecision.equals("paper") && cdecision == 0) {
			System.out.println("Player wins!");
			System.out.println("\n");
			} else if (pdecision.equals("scissors") && cdecision == 0) {
			System.out.println("Computer wins!");
			System.out.println("\n");
			} else if (pdecision.equals("scissors") && cdecision == 1) {
			System.out.println("Player wins!");
			System.out.println("\n");
			} else {
			System.out.println("Tie!");
			gameState = "X";
			System.out.println("\n");
			//System.out.println(gameState);//
			}
		} while(1 != 0);
	}

	public static void main(String[] args){
		
		RockPaperScissors g = new RockPaperScissors();

	}
}
