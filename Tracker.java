 import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Tracker {
  ////////////////////////////
  // PROPORTIES
  ////////////////////////////
  private String records = "";
  private Player activePlayer;
  /////////////////////////////
  // CONTRUCTORS
  ///////////////////////
  Tracker() throws FileNotFoundException {
    System.out.println("TRACKER REPORTING!!!!");
    File x = new File("Ledger.csv");
    Scanner scn = new Scanner(x);

   // String[] data;
   // while (scn.hasNextLine()) {
   //   data = scn.nextLine().split(",");
   //   System.out.println(data[0]);
    //}
  }

  public Player getPlayer(String pName)throws FileNotFoundException{
    

    
    //Set the activePlayer propertie 
    //return the activePlayer

    // read the file...
    String[] stats;
    File x = new File("Ledger.csv");
    Scanner scn = new Scanner(x);
    System.out.println("?getPlayer --" + scn);
    while (scn.hasNextLine()) {
        String theNextLine = scn.nextLine();
      // find the player...
        stats = theNextLine.split(",");
        if(stats[0].equals(pName)){
          // use that data from the scanner to construct player 
          this.activePlayer = new Player(stats);
        }
      return activePlayer;
    }
 // find the player...
      
    return new Player("?????" , 50);
  }
  
    //Save file to big String and then write it back but include the stats that you want to update
  public int[] statGetter(String pName)throws FileNotFoundException{
      String[] stats;
      
      int[] intStats = new int[4];
      File x = new File("Ledger.csv");
      Scanner scn = new Scanner(x);
      while (scn.hasNextLine()) {
        String theNextLine = scn.nextLine();
        stats = theNextLine.split(",");
        if(stats[0].equals(pName)){        
          for(int i = 1; i < stats.length; i ++){
            //System.out.print(stats[i]+"   ");
            intStats[i - 1] = Integer.parseInt(stats[i]);
          }
        }
        else{ 
          
          records += theNextLine + "\n";
          
        }
      }
      return intStats;
  }

  public void writeToFile()throws FileNotFoundException{
    System.out.println("?writeToFile");
    File f = new File("Ledger.csv");
    PrintStream ps = new PrintStream(f);
    ps.println(records);
  
  }

  public String getRecords(){
    return records;
  }

  
  public void statChanger(String playerName, int[] nStats){
    for(int i = 0; i < nStats.length; i++){
      nStats[i] = nStats[i] + 1;
    }
    nStats[3] = nStats[3] - 1;
    for(int i = 0; i < nStats.length; i++){
    System.out.print(nStats[i]+" ");
      
    }
    System.out.println();
  }

  //////////////////////////
  // METHODS
  ///////////////////////////
  public void makeFile() {
    System.out.println("Making the file...");
     

    // Scanner s = new Scanner(f);
  }
  /*public String[] statGetter(String pName){
    String[] stats;
    while (scn.hasNextLine()) {
      if(stats[0] == pName){
        
      }
      stats = scn.nextLine().split(",");
      System.out.println(stats[0]);
    }
    return stats[];
  }
*/
}