import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageBox2 extends JFrame {

    MyWindow myWindow;

    public ImageBox2(MyWindow window) {

        myWindow = window;

        File file = new File("ProfilePicture.jpg");
        try {
            BufferedImage imageIcon2 = ImageIO.read(file);
            JPanel jPanel = new JPanel();
            jPanel.setSize(myWindow.getWINDOW_WIDTH()/3, myWindow.getWINDOW_HEIGHT());
            JLabel jLabel2 = new JLabel(new ImageIcon(imageIcon2));
            jLabel2.setBackground(Color.BLUE);
            jLabel2.setBounds(myWindow.getWINDOW_WIDTH() / 3 * 2, 0, myWindow.getWINDOW_WIDTH() / 3, myWindow.getWINDOW_HEIGHT());
            jLabel2.setVisible(true);
            jPanel.add(jLabel2);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
