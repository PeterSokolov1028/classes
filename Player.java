                  
import java.util.Scanner;

public class Player{
  // Properties
  String name;
  int hp;
  int attackState;
  Scanner scn = new Scanner(System.in);
  int wins;
  int losess;
  int streak;
  int gamesPlayed;

  
  //constructor

  public Player(String name, int hp){
    this.name = name;
    this.hp = hp;
  }

  public Player(String[] dataStuff){
    
  }

  ///////////////////////////////////////
  // Methods 
  ///////////////////////////////////////
  public String getName(){
    return this.name;
  }
  
  public int getAttackState(){
    return this.attackState;
  }
  
  public void takeDamage(){
    hp = hp - 50;
  }
  
  public void setAttackState(Scanner myScanner){
    System.out.println("Pick a Move - zero for paper, one for rock, two for sizzors ");
    // instertWhiteSpace(50);
    this.attackState = myScanner.nextInt();
  }

  public void setAttackState(int attack){
    this.attackState = attack;
  }

  public void fight(Player state){
    
  }

  public String[] getPicture(){
    // Switch the println statements to be an array list 
    // Put visual to be called after the winner decided
    healthBar();
    if(attackState == 2){
      String [] x = new String[10];
      x[0] = "  ________           ";
      x[1] = "  (@    @ )          " ;
      x[2] = "  (   ;    )          ";
      x[3] = " \\     /        \\/  ";
      x[4] = "---      ---     00   " ; 
      x[5] = "|           \\  / /   " ; 
      x[6] = "| |         |  / / /  " ;
      x[7] = "| |         | \\__/   " ;
      x[8] = " -----------          " ; 
      x[9] ="_____________|         ";

      return x;
    }
    if(attackState == 1){
      String [] y = new String[10];
      y[0] = " ________            ";
      y[1] = " (@    @ )           ";
      y[2] = " (   ;   )           ";
      y[3] = " (       )           ";
      y[4] = " \\     /         👊 ";
      y[5] = "---      ---     |--|";
      y[6] = "|           \\  / /";
      y[7] = "| |         |  / / /";
      y[8] ="| |         | \\__/ ";
      y[9] =" -----------";
      return y;
    }
   else{
    String [] z = new String[10];
    z[0] =" ________      ______  ";
    z[1] =" (@    @ )     |      |";
    z[2] =" (   ;   )     |      |";
    z[3] =" (       )     |      |";
    z[4] =" \\     /      |______|";
    z[5] ="---      ---     |  |  ";
    z[6] ="|           \\  / /    ";
    z[7] ="| |         |  / / /   ";
    z[8] ="| |         | \\__/    ";
    z[9] =" -----------           ";
     return z;
    }

  
  }

  public boolean isAlive(){
    if(this.hp == 0){
      deathDance();
      return false;
    } 
    return true;
    
   // return false;//this.hp > 0;
  }
  public static String readName(Scanner myScanner) {
    System.out.println("Enter your fighters name");
    return myScanner.next();
  }


 public void deathDance(){
     System.out.println();
     System.out.println();
     System.out.println();
     System.out.println(this.name + " Has Yeeed his last Hawww");
     System.out.println(" ________      ");
     System.out.println(" (@    @ )   ");
      System.out.println(" (   ;   )   ");
      System.out.println(" (       )   ");
      System.out.println(" \\     /    ");
      System.out.println(               );
      System.out.println(">8 --------------- ");
      System.out.println(               );
      System.out.println("---      ---     ");
      System.out.println("|           | ");
      System.out.println("| |       | |  ");
      System.out.println("| |       | |  ");
      System.out.println(" -----------");
 }

 public void healthBar(){
   System.out.print("health: ");
   for(int i = 0; i < this.hp/10;i++){
     System.out.print("💘");
   }
   System.out.println();
 }

  public void taunt(){
    System.out.println(this.name + "gooood try");
  }

  /*public int getWins{
    return this.wins; 
  }

  

  public int getLosess{
    return this.losess;
  }

  public int getStreak{
    return this.streak;
  }

  public int gamesPlayed{
    return gamesPlayed;
  }
*/
  
  
}




