import java.util.Scanner;
import java.util.Arrays;
import java.io.FileNotFoundException;

class Main{
  public static void main(String [] args) throws FileNotFoundException{
    Scanner scn = new Scanner(System.in);
    System.out.println("Hello World!");

   // Player p1 = new Player("peter", 100);
//trackers purpose is to get a players data set and then return it.
    Tracker t = new Tracker();
    Player p1 = t.getPlayer("Peter");
    Player p2 = t.getPlayer("Gus");

    //establish a turn sequence
    //turns happen until Player death
    while( p1.isAlive() && p2.isAlive() ){
      System.out.println("now do a turn");
      Turn activeTurn = new Turn();
       //on each turn both users have to input their move
      p1.setAttackState(scn);
      p2.setAttackState(scn);
    //the game works out who wins
      Game.throwHands(p1,p2);
      p1.healthBar();
    // THe player has to have a chance of death
      p1.isAlive();
      p2.isAlive();
    //show the users what happen
      Game.visual(p1,p2);
    //establish winner
    }
    if(p1.isAlive()){
      t.statChanger(p1.getName(),t.statGetter(p1.getName()));
    }
    else if(p2.isAlive()){
      t.statChanger(p2.getName(),t.statGetter(p2.getName()));
    }
   

  
     





    
    System.out.println( Arrays.toString(t.statGetter("Peter")));
  //  t.writeToFile();

    
  }
}