
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageBox extends JPanel {

    MyWindow myWindow;
    BufferedImage imageIcon1;

   public ImageBox(MyWindow window) {

       myWindow = window;

       File file = new File("ProfilePicture.jpg");

       ImageIcon imageIcon = new ImageIcon("ProfilePicture.jpg");


       try {
           imageIcon1 = ImageIO.read(file);

           JPanel jPanel = new JPanel();
           jPanel.setSize(myWindow.getWINDOW_WIDTH() / 3, myWindow.getWINDOW_HEIGHT());
           JLabel jLabel1 = new JLabel(new ImageIcon(imageIcon1));
           jLabel1.setBounds(0, 0, myWindow.getWINDOW_WIDTH() / 3, myWindow.getWINDOW_HEIGHT());
           jLabel1.setVisible(true);
           jPanel.add(jLabel1);

       } catch (IOException e) {
           throw new RuntimeException(e);
       }

   }
   public void paintComponent(Graphics g){
       super.paintComponent(g);
       g.drawImage(imageIcon1, 0, 0 , this);
   }
   }

