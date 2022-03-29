import javax.swing.*;  
import java.awt.*; 
import java.awt.event.*;
import java.util.*;
import java.io.*;    

public class Graphics extends JFrame {
  
  int displayState;
  JFrame frame = new JFrame();
  JPanel activePanel;
  JTextField activeTextField;

  String boardText = "Welcome to the Royal Game Of Ur!";

  //Constructor for the graphics class, sets the JFrame attributes
  public Graphics(){
    this.displayState = 0;
    this.setBounds(10, 10, 1294, 764);
    this.setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
  }
  

  public void sceneDispay(int displayNum){}
}
