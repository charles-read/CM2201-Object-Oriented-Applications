import java.io.*;
import java.util.*;

//class implements GameInterface for initialisation, mainGame and declareWinner.
public class GameDice implements GameInterface {

  public static RandomInterface r=new LinearCongruentialGenerator();

//Variables used in GameDice class.
  public static HashSet<Integer> numbersRolled=new HashSet<Integer>();
  public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

  public void initialiseGame() {
      // The initialization phase:
      // GameDice doesn't have an initialiseGame method.
  }

  public void mainGame() {
      // The main game:

      // Let the user roll the die twice
      for (int i=0; i<2; i++) {
        System.out.println("Hit <RETURN> to roll the die");
        try {
          br.readLine();
        }
        catch(IOException e){
          System.out.println(e);
        }
        int dieRoll=(int)(r.next() * 6) + 1;

        System.out.println("You rolled " + dieRoll);
        numbersRolled.add(new Integer(dieRoll));
      }

      // Display the numbers rolled
      System.out.println("Numbers rolled: " + numbersRolled);
  }

  public void declareGameWinner() {
      // Declare the winner:

      // User wins if at least one of the die rolls is a 1
      if (numbersRolled.contains(new Integer(1))) {
        System.out.println("You won!");
      }
      else System.out.println("You lost!");
  }
}