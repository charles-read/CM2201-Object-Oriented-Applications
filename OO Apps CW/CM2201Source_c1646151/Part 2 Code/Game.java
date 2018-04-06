import java.io.*;
import java.util.*;

public class Game {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) {
		GameGenerator GameGen = new GameGenerator(); //Creates instance of GameGenerator(my factory) called GameGen.
	
	try {
		System.out.print("Card (c) or Die (d) game? ");
		String GameAnswer = br.readLine(); //GameAnswer = C or D (depending on game).
		GameInterface GameExecute = GameGen.GameExecute(GameAnswer);  //Creates instance of GameInterface called GameExecute.

		GameExecute.initialiseGame(); //Calls methods from Interface instance.
		GameExecute.mainGame();
		GameExecute.declareGameWinner();
		}
	
	catch (Exception e){
			System.out.println("Unexpected User Input.");
		}

	}
}