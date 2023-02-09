// BUGS:
// diagnal validation
// doesn't recognize a win at start
//Move validaton fails upon invalid move if statement

import java.util.Scanner;

public class TicTacToe {
  /////////// Properties
  Player active;

  int size = 3;
  char activeSymbol;
  char[][] state2 = 
    {
        { '-', '-', '-' },
        { '-', '-', '-' },
        { '-', '-', '-' }
    };
  char[][] state = new char[size][size];
  public char[] initializeState(char[][] state){
    for(int i = 0; i < size; i++){
      for(int j = 0; j < size; j++){
        state[i][j] = '-';
      }
      
    }
    return state;
  }

  
  initializeState(state);
  
  // CONSTRUCTOR??????????????????

  public TicTacToe() {
    Grid g = new Grid(state);

    System.out.println(winHorizontal() + "??");

    int turnCount = 1;
    while (win(state, turnCount) == false) {
      g.drawGrid();
      
      makeaMove(state, turnCount);
      turnCount++;
      if (turnCount > 9)
        break;
    }
    g.drawGrid();
    System.out.println("GAME OVER");
  }

  /////////// METHODS

  public void makeaMove(char[][] state, int turnCount) {
    Scanner g = new Scanner(System.in);
    System.out.println("Insert the coordinates");
    int y = g.nextInt();
    int x = g.nextInt();
    while(state[x][y] == 'X'|| state[x][y] == 'O'){
      System.out.println("Invalid move please select a different place to move too");
      y = g.nextInt();
      x = g.nextInt();
    }
    if (turnCount % 2 == 0)
      activeSymbol = 'O';
    else {
      activeSymbol = 'X';
    }
    state[x][y] = activeSymbol;
    // if(win(state) == false )makeaMove(state);

  }


  public boolean win(char[][] state, int turnCount){
    
    if(winVertical()) return true;
    if(winHorizontal()) return true;
    if(winDiagonal()) return true;
    
    return false;
  }
  
 
  //Horizontal winner
   public boolean winHorizontal(){
    // check to see if we can win.
    // as soon as we cannot win, we exit.

    // must check every column before we can know if we cannot win.
    boolean canWin;
    for(int x = 0; x < state.length; x++){
      canWin = true;
        for(int y = 0; y < state.length; y++){
          if(activeSymbol != state[x][y]){
            
            canWin = false;
            break;
          }
        }
      if(canWin) return true;

    }
    return false;
      
    }
  //Vertical winner
  public boolean winVertical(){
    // check to see if we can win.
    // as soon as we cannot win, we exit.

    // must check every column before we can know if we cannot win.
    boolean canWin;
    for(int x = 0; x < state.length; x++){
      canWin = true;
        for(int y = 0; y < state.length; y++){
          if(activeSymbol != state[y][x]){
            canWin = false;
            break;
          }
        }
      if(canWin) return true;

    }
    return false;
      
    }

  // if all diogonal of active player equals - win.
  public boolean winDiagonal() {
    //checking the first diagonal
    boolean possibleWinner = true;
    //Checking first diagonal
    for(int  i = 0; i < state.length;i++){
      if(activeSymbol != state[i][i]) possibleWinner = false;
      //Checking if the far diagonal is true
      if(activeSymbol != state[state.length-(i+1)][i] && !possibleWinner) return false;  
    }
   
   
    
    
    return true;
  }
}