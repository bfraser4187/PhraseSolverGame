/*
 * Activity 2.5.2
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
import java.util.Scanner;
  
public class PhraseSolver
{
  /* your code here - attributes */
  private Player player1;
  private Player player2;
  private Board game;
  private boolean solved;
  String guess = "";
  /* your code here - constructor(s) */ 
  public PhraseSolver()
  {
    player1 = new Player();
    player2 = new Player();
    game = new Board();
    solved = false;
  }
  /* your code here - accessor(s) */

  public void turn(){
    System.out.println("Enter a letter or type the phrase: ");
    Scanner sc = new Scanner(System.in);
    guess = sc.nextLine();
  
    if(guess.length() == 1)
    {
      game.guessLetter(guess);
    }
    else{
      game.isSolved(guess);
    }
  }


  /* your code here - mutator(s)  */



  public void play()
  {
    boolean solved = false;
    int currentPlayer = 1;

    Scanner input = new Scanner(System.in);
    
    boolean correct = true;
    while (!solved) 
    {
      System.out.println(game.getSolvedPhrase());
      /* your code here - game logic */
      if( currentPlayer % 2 == 1){
        System.out.println("It's " + player1.getName() +"\'s turn");
        turn();
        if (game.getPhrase().contains(guess) == true)
        {
          player1.setScore(game.getCurrentLetterValue());
        }
      }
      else{
        System.out.println("It's " + player2.getName() +"\'s turn");
        turn();
        if (game.getPhrase().contains(guess) == true)
        {
          player2.setScore(game.getCurrentLetterValue());
        }
      }
      
      /* your code here - determine how game ends */
      if ((guess.equals(game.getPhrase()))){
        solved = true;
        System.out.println("\nYou guessed the correct phrase!");

        System.out.print( player1.getName() +" finished with ");
        System.out.println(player1.getScore() + " points");

        System.out.print( player2.getName() +" finished with ");
        System.out.println(player2.getScore() + " points");

        if (player1.getScore() > player2.getScore()){
          System.out.println(player1.getName() + " won!");
        }
        else if (player1.getScore() == player2.getScore()){
          System.out.println("You tied!");
        }
        else{
          System.out.println(player2.getName() + "won!");
        }
      }

      currentPlayer++;

      
    
    } 
   
  }
  
}