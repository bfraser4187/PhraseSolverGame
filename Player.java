/*
 * Activity 2.5.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player
{

  /* your code here - attributes */
  private String name;
  private int score;
 
  /* your code here - constructor(s) */ 
  public Player(){
    System.out.println("Enter your name: ");
    Scanner sc = new Scanner(System.in);
    this.name = sc.nextLine();
    score = 0;
  }


  public Player(String name){
    this.name = name;
    score = 0;
  }

  /* your code here - accessor(s) (getter) */ 
  public String getName(){
    return name;
  }

  public int getScore(){
    return score;
  }

  public String toString(){
    return (getName() + " you have " + getScore() + " points");
  }

  /* your code here - mutator(s) (setter) */ 
  public void setScore(int score){
    this.score += score;
  }

}