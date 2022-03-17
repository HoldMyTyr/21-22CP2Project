import java.util.Random;

/**
*@Author Maximilian C. Sutton
*@Version 1.00
*@Since 2021-3-16
*this class's fuction is to pick a random number that is 0 or 1 (flip of a coin) and adding up 4 diffrent flips
*/

public class Dice {
  Random rand = new Random();

  /**
  * Rolls the die by choosing a random number between 0 and 1
  * @return int
  */
  public int roll() {
    return rand.nextInt(2) + 0;
  }

  /**
  * Adds the 4 dice rolls
  * @perams int, int, int, int
  * @return int
  */
  public int sum(int d1, int d2, int d3, int d4){
    int sum = d1 + d2 + d3 + d4;
    return sum;
  }
}