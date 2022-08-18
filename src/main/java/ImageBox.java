
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageBox extends JFrame {
    BufferedImage imageIcon1;
    public ImageBox(MyWindow window) {

        File file = new File("ProfilePicture.jpg");

         try {
        imageIcon1 = ImageIO.read(file);
        Icon imageIcon = new ImageIcon("ProfilePicture.jpg");
        JLabel jLabel1 = new JLabel(imageIcon);
        jLabel1.setBounds(30, 30, window.getWINDOW_WIDTH() / 3, window.getWINDOW_HEIGHT()-60);
        this.add(jLabel1);
        paint(getGraphics());

         } catch (IOException e) {
           throw new RuntimeException(e);
          }
    }
public void paint(Graphics g){
       super.paint(g);
       g.drawImage(imageIcon1, 700, 50 , null);
   }
}

