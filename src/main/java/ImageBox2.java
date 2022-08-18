import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageBox2 extends JFrame {

    public ImageBox2(MyWindow window) {


       // File file = new File("ProfilePicture.jpg");
       // try {
           // BufferedImage imageIcon2 = ImageIO.read(file);
            JLabel jLabel2 = new JLabel();//new ImageIcon(imageIcon2));

            ImageIcon imageIcon = new ImageIcon("ProfilePicture.jpg");
            jLabel2.setIcon(imageIcon);
            this.add(jLabel2);
            jLabel2.setVisible(true);
           // jLabel2.setBounds(window.getWINDOW_WIDTH() / 3 * 2, 0, window.getWINDOW_WIDTH() / 3, window.getWINDOW_HEIGHT());


      //  } catch (IOException e) {
      //      throw new RuntimeException(e);
      //  }

    }
}
