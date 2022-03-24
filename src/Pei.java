import java.util.*;

  /**
  *@Author Maximilian C. Sutton
  *@Version 0.50
  *@Since 2022-3-22
  */

public class Pei {
  
  public boolean s; 
  
  public Pei(boolean side){
    this.s = side; 
  }

  public String color(){
    if(this.s){
      return "White";
    } else {
      return "Black";
    }
  }
}