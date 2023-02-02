// BUGS:
// diagnal validation
// doesn't recognize a win at start
//Move validaton fails upon invalid move if statement

import java.util.Scanner;

public class TicTacToe {
  /////////// Properties
  Player active;
  
  char activeSymbol = 'X';
  char[][] state = {
        { 'X', 'O', 'X' },
        { '-', 'X', '-' },
        { '-', '-', 'X' }
  };

  
  // CONSTRUCTOR??????????????????

  public TicTacToe() {

    Grid g = new Grid(state);

    System.out.println(winDiagonal());

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
    char p;
    if (turnCount % 2 == 0)
      p = 'O';
    else {
      p = 'X';
    }
    state[x][y] = p;
    // if(win(state) == false )makeaMove(state);

  }

  public boolean win(char[][] state, int turnCount) {
    // if win true
    // if Horizontal equal to active player win

    char active;
    if (turnCount % 2 == 1)
      active = 'X';
    else {
      active = 'O';
    }
    for (int j = 0; j < state.length; j++) {

      boolean possibleWinner = true;

      for (int i = 0; i < state[j].length; i++) {
        char found = state[j][i];
        if (found != active) {
          possibleWinner = false;
          break;
        }
      }

      return possibleWinner;
    }
    // if vertical of active player equals - win
    for (int j = 0; j < state.length; j++) {

      boolean possibleWinner = true;

      for (int i = 0; i < state[j].length; i++) {
        char found = state[i][j];
        if (found != active) {
          possibleWinner = false;
          break;
        }
      }

      return possibleWinner;
    }
    return false;
  }

  // if all diogonal of active player equals - win.
  public boolean winDiagonal() {

    if(state[1][1] != activeSymbol) return false;
    return false;

  }

}