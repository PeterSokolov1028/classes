public class Grid{
  //Properties
  private int size = 4;
  private char[][][] state = new char[size][size][size];

  //Constructor
  public Grid(){
    this.size = size;
  }

  public Grid(int size){
    this.size = size;
  }

  public Grid(char[][][] state){
    this.state = state;
  }

  


  //Methods
  public void drawGrid(){
    for(int k = 0; k < size; k++){
      for(int i = 0;i < size ;i++){
        for(int j = 0;j < size ;j++){
          System.out.print("[" +state[k][i][j] + "]");
      }
      System.out.println();
      }
    System.out.println();
    }



  
  }
}