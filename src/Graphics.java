import javax.swing.*;  
import java.awt.*; 
import java.awt.event.*;
import java.util.*;
import java.io.*;    

public class Graphics extends JFrame {
  
  //int displayState = 0;
  JFrame frame = new JFrame();
  Container contain = this.getContentPane();

  //String boardText = "Welcome to the Royal Game Of Ur!";

  //Constructor for the graphics class, sets the JFrame attributes
  public Graphics(){
    //this.displayState = 0;
    this.setBounds(10, 10, 1294, 764);
    this.setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
  }
  
  public void refresh(){
    validate();
    repaint();
  }

  public void sceneDispay(){
    ImageIcon testImage = new ImageIcon(".//res//ArmorHat.png");
    JLabel testLabel = new JLabel(testImage);
    JPanel testPanel = new JPanel();
    testPanel.setBounds(0, 0, 80,20);
    testPanel.add(testLabel);

    contain.add(testPanel);
  }
}
