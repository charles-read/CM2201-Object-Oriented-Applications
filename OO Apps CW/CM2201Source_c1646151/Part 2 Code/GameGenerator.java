public class GameGenerator { //GameGenerator is my factory class.
  public GameInterface GameExecute(String GameAnswer) throws Exception {

    //if statement to select the game type. 
    if (GameAnswer.equals("c")){
    	   System.out.println("Card Game Selected");
    	   return new GameCard(); //creates instanse of GameCard class.
    }
    else if (GameAnswer.equals("d")){
    	   System.out.println("Die Game Selected");
    	   return new GameDice(); //creates instanse of GameDice class.
    }

    else throw new Exception();
  }
}