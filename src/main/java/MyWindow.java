import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class MyWindow extends JFrame {

    private int WINDOW_WIDTH = 1000;
    private int WINDOW_HEIGHT = 500;
    private int SPACE_BETWEEN_BUTTONS = 50;

    //ImageProcess image = new ImageProcess();

    JTextField userNameInsert = new JTextField();

    public MyWindow() {
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setBackground(Color.white);

        JButton searchButton = new JButton();
        searchButton.setBounds(WINDOW_WIDTH / 2, WINDOW_HEIGHT / 12, 100, 40);
        searchButton.setVisible(true);
        searchButton.setText("Search");
        this.add(searchButton);


        JButton grayScaleButton = new JButton();
        grayScaleButton.setBounds(WINDOW_WIDTH / 2 - 100, SPACE_BETWEEN_BUTTONS + searchButton.getY(), 200, 40);
        grayScaleButton.setVisible(false);
        grayScaleButton.setText("Gray scale");
        this.add(grayScaleButton);

        grayScaleButton.addActionListener((e -> {

          //  image.grayScale();

        }));

        JButton mirrorButton = new JButton();
        mirrorButton.setBounds(WINDOW_WIDTH / 2 - 100, SPACE_BETWEEN_BUTTONS + grayScaleButton.getY(), 200, 40);
        mirrorButton.setVisible(false);
        mirrorButton.setText("Mirror");
        this.add(mirrorButton);

        mirrorButton.addActionListener((e -> {

        }));

        JButton negativeButton = new JButton();
        negativeButton.setBounds(WINDOW_WIDTH / 2 - 100, SPACE_BETWEEN_BUTTONS + mirrorButton.getY(), 200, 40);
        negativeButton.setVisible(false);
        negativeButton.setText("Negative");
        this.add(negativeButton);

        negativeButton.addActionListener((e -> {


        }));

        JButton eliminateButton = new JButton();
        eliminateButton.setBounds(WINDOW_WIDTH / 2 - 100, SPACE_BETWEEN_BUTTONS + negativeButton.getY(), 200, 40);
        eliminateButton.setVisible(false);
        eliminateButton.setText("Eliminate");
        this.add(eliminateButton);

        eliminateButton.addActionListener((e -> {

        }));

        JButton lighterButton = new JButton();
        lighterButton.setBounds(WINDOW_WIDTH / 2 - 100, SPACE_BETWEEN_BUTTONS + eliminateButton.getY(), 200, 40);
        lighterButton.setVisible(false);
        lighterButton.setText("Lighter");
        this.add(lighterButton);

        lighterButton.addActionListener((e -> {

        }));
        JButton darkerButton = new JButton();
        darkerButton.setBounds(WINDOW_WIDTH / 2 - 100, SPACE_BETWEEN_BUTTONS + lighterButton.getY(), 200, 40);
        darkerButton.setVisible(false);
        darkerButton.setText("Darker");
        this.add(darkerButton);

        darkerButton.addActionListener((e -> {

        }));

        //textField for user name
        userNameInsert.setBounds(WINDOW_WIDTH / 2 - 100, WINDOW_HEIGHT / 12, 100, 40);
        userNameInsert.setBackground(Color.WHITE);
        userNameInsert.setBackground(Color.gray);
        this.add(userNameInsert);
        userNameInsert.setVisible(true);

        searchButton.addActionListener((e -> {

            //TwitterProfilePicture profilePicture = new TwitterProfilePicture();
          //  profilePicture.getProfilePicture(userNameInsert.getText());
         ImageBox imageBox = new ImageBox(this);
            /*ImageIcon imageIcon = new ImageIcon("ProfilePicture.jpg");
            JLabel jLabel2 = new JLabel();
            jLabel2.setIcon(imageIcon);
            jLabel2.setVisible(true);
            this.add(jLabel2);*/
          // ImageBox2 imageBox2 = new ImageBox2(this);
            //JFrame myFrame = new JFrame();
           /* Icon myIcon = new ImageIcon("ProfilePicture.jpg");
            JLabel label = new JLabel(myIcon);
            this.add(label);*/


            // ImageBox2 imageBox2 = new ImageBox2(this);
           /*  grayScaleButton.setVisible(true);
             mirrorButton.setVisible(true);
             eliminateButton.setVisible(true);
             negativeButton.setVisible(true);
             lighterButton.setVisible(true);
             darkerButton.setVisible(true);*/
        }));

    }


    public int getWINDOW_WIDTH(){
        return this.WINDOW_WIDTH;
    }
    public int getWINDOW_HEIGHT(){
        return this.WINDOW_HEIGHT;
    }
}
