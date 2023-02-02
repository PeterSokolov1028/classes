public class Grid{
  //Properties
  private int width = 3;
  private int height = 3;
  private char[][] state = new char[width][height];

  //Constructor
  public Grid(){
    this.width = width;
    this.height = height;
  }

  public Grid(int width, int height){
    this.width = width;
    this.height = height;
  }

  public Grid(char[][] state){
    this.state = state;
  }

  


  //Methods
  public void drawGrid(){
    for(int i = 0;i < state.length ;i++){
      for(int j = 0;j < state[i].length ;j++){
        System.out.print("[" +state[i][j] + "]");
      }
      System.out.println();
    }



  
  }
}