import java.util.*;
import javax.swing.*;  
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class RoyalGameOfUr{
  /**
  *@Author Maximilian C. Sutton
  *@Version 0.05
  *@Since 2022-3-22
  */

  public static Pei[][][] board = new Pei[8][3][7];
  public static Player p1 = new Player();
  public static Player p2 = new Player();
  public static int[] die = new int[4];
  public static Dice dice = new Dice();
  public static Graphics g = new Graphics();
  
  public static void main(String[] args) throws FileNotFoundException {
    g.sceneDispay();
    g.refresh();
  } 
  
  public static int turn(){
    die[0] = dice.roll();
    die[1] = dice.roll();
    die[2] = dice.roll();
    die[3] = dice.roll();
    return dice.sum(die[0], die[1], die[2], die[3]);
    //
  }
  
  public static void startPos(){
    for(int z = 0; z < 14; z++){
      if(z >= 7){
        Pei peice = new Pei(false);
        board[2][2][z-7] = peice; 
      } else {
        Pei peice = new Pei(true);
        board[2][0][z] = peice; 
      }
    }
  }

  public static void printBoard(){
    String g = "f";
    for(int a = 0; a < 8; a++){
      for(int b = 0; b < 3; b++){
        for(int c = 0; c < 7; c++){
          if(board[a][b][c] != null){
            g = board[a][b][c].color();
          } else {
            g = "f";
          }
          System.out.println(a + " : " + b + " : " + c + " : " + board[a][b][c] + " : " + g);
        }
      }
    }
    System.out.println(turn() + "\n" + die[0] + " : " + die[1] + " : " + die[2] + " : " + die[3]);
  }
}