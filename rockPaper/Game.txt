import java.io.FileNotFoundException; 
import java.util.Scanner;

class Game {
  public static final String LOVE = "💘";
  public static final String HATE = "👊";

  public static void main(String[] args) throws FileNotFoundException {

 
  
    // Say hello
    System.out.println("Hello Fighters!");


    
  
    
    // getting ready to get input from the user
    Scanner scn = new Scanner(System.in);
    String nameP1 = Player.readName(scn);
  
    String nameP2 = Player.readName(scn);
    

    //Tracker
   

    // setting up the players
    Player p1 = new Player(nameP1, 100);
    Player p2 = new Player(nameP2, 100);

    // puts the players into a combat state of readieness

    // do the war!
    while (p1.isAlive() && p2.isAlive()) {
      // do the actual battle!!!!!
      p1.setAttackState(scn);
      p2.setAttackState(scn);
      throwHands(p1, p2);
      visual(p1, p2);
      System.out.println(p1.name + " " + p1.hp + p2.name + " " + p2.hp);
    }
    System.out.println("You are trash you lose");

    // this is where I can track result

  }

  public static void throwHands(Player one, Player two) {
    // K. Let's see who is fighting....
    System.out.println("!!!!! HERE COMES THE BATTLE !!!!!!!!");
    System.out.println(one.getName() + ":" + one.getAttackState());
    System.out.println(two.getName() + ":" + two.getAttackState());

    int p1 = one.getAttackState();
    int p2 = two.getAttackState();
    // tie
    if (p1 == p2) {
      System.out.println("tie!");
    }
    // Player 1 wins
    else if (p1 == 0 && p2 == 1 || p1 == 1 && p2 == 2) {

      two.takeDamage();
      System.out.println("YOU WON " + one.getName() + "!");

    }
    // Player 2 wins
    else {
      one.takeDamage();
      System.out.println(one.hp);
      System.out.println("YOU WON " + two.getName() + "!");
    }
  }

  public static void instertWhiteSpace(int count) {
    for (int i = 0; i < count; i++) {
      System.out.println();
    }
  }

  public static String stringReverse(String tbr) {
    String reversed = "";
    for (int i = tbr.length(); i > 0; i--) {
      reversed = reversed + tbr.substring(i - 1, i);
    }
    return reversed;
  }

  public static void visual(Player one, Player two) {
    String[] pic1 = one.getPicture();
    String[] pic2 = two.getPicture();
    for (int i = 0; i < pic1.length; i++) {
      System.out.println(pic1[i] + "         " + stringReverse(pic2[i]));
    }
  }

}