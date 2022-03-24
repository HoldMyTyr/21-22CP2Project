import javax.swing.*;  
import java.awt.*;  
import java.io.*;    

public class Graphics {

  public Graphics(){

  }
  
    public static void createAndShowGUI() {
	  Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        //Create and set up the window.
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	  int screenHeight = screenSize.height - 100;
	  int screenWidth = screenSize.width - 100;

	  //sets hight and width of the frame and makes it visible
	  frame.setPreferredSize(new Dimension(screenWidth , screenHeight));
	  frame.pack();
	  frame.setLocationRelativeTo(null);
	  frame.setVisible(true);

        JPanel panel = new JPanel();
	  panel.setBackground(Color.CYAN);
	  ImageIcon icon = new ImageIcon(".//res//ArmorHat.png");
	  JLabel label = new JLabel();
	  label.setIcon(icon);
	  panel.add(label);
       
	  //ImageIcon img = new ImageIcon(".//res//ArmorHat.png");
        //JLabel leb = new JLabel(img);
        //JPanel titlePanel = new JPanel();
        //titlePanel.add(leb);


        //Display the window.
        frame.pack();
        frame.setVisible(true);
	  panel.setVisible(true);
    }
}
