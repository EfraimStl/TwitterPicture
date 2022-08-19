import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MyWindow extends JFrame {

    private int WINDOW_WIDTH = 1000;
    private int WINDOW_HEIGHT = 500;
    private int SPACE_BETWEEN_BUTTONS = 50;

    JTextField userNameInsert = new JTextField();
    ImageProcess imageProcess = new ImageProcess();

    BufferedImage imageIcon1;
    BufferedImage imageIcon2;

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
            imageProcess.grayScale(imageIcon1);

                paint(getGraphics(), imageIcon1);

                try {
                    imageIcon1 = ImageIO.read(new File("ProfilePicture.jpg"));
                }catch (IOException exc){
                }
        }));

        JButton mirrorButton = new JButton();
        mirrorButton.setBounds(WINDOW_WIDTH / 2 - 100, SPACE_BETWEEN_BUTTONS + grayScaleButton.getY(), 200, 40);
        mirrorButton.setVisible(false);
        mirrorButton.setText("Mirror");
        this.add(mirrorButton);

        mirrorButton.addActionListener((e -> {
            try {
            imageIcon2 = ImageIO.read(new File("ProfilePicture.jpg"));
            imageProcess.mirror(imageIcon2, imageIcon1);
            paint(getGraphics(), imageIcon2);

            imageIcon1 = ImageIO.read(new File("ProfilePicture.jpg"));
            }catch (IOException exc){
            }

        }));

        JButton negativeButton = new JButton();
        negativeButton.setBounds(WINDOW_WIDTH / 2 - 100, SPACE_BETWEEN_BUTTONS + mirrorButton.getY(), 200, 40);
        negativeButton.setVisible(false);
        negativeButton.setText("Negative");
        this.add(negativeButton);

        negativeButton.addActionListener((e -> {

            imageProcess.negative(imageIcon1);
            paint(getGraphics(), imageIcon1);

            try {
                imageIcon1 = ImageIO.read(new File("ProfilePicture.jpg"));
            }catch (IOException exc){
            }

        }));

        JButton eliminateButton = new JButton();
        eliminateButton.setBounds(WINDOW_WIDTH / 2 - 100, SPACE_BETWEEN_BUTTONS + negativeButton.getY(), 200, 40);
        eliminateButton.setVisible(false);
        eliminateButton.setText("Eliminate");
        this.add(eliminateButton);

        eliminateButton.addActionListener((e -> {

            imageProcess.eliminateGreen(imageIcon1);
            paint(getGraphics(), imageIcon1);

            try {
                imageIcon1 = ImageIO.read(new File("ProfilePicture.jpg"));
            }catch (IOException exc){
            }
        }));

        JButton lighterButton = new JButton();
        lighterButton.setBounds(WINDOW_WIDTH / 2 - 100, SPACE_BETWEEN_BUTTONS + eliminateButton.getY(), 200, 40);
        lighterButton.setVisible(false);
        lighterButton.setText("Lighter");
        this.add(lighterButton);

        lighterButton.addActionListener((e -> {
            imageProcess.lighter(imageIcon1);
            paint(getGraphics(), imageIcon1);

            try {
                imageIcon1 = ImageIO.read(new File("ProfilePicture.jpg"));
            }catch (IOException exc){
            }

        }));
        JButton darkerButton = new JButton();
        darkerButton.setBounds(WINDOW_WIDTH / 2 - 100, SPACE_BETWEEN_BUTTONS + lighterButton.getY(), 200, 40);
        darkerButton.setVisible(false);
        darkerButton.setText("Darker");
        this.add(darkerButton);

        darkerButton.addActionListener((e -> {

            imageProcess.darker(imageIcon1);
            paint(getGraphics(),imageIcon1);

            try {
                imageIcon1 = ImageIO.read(new File("ProfilePicture.jpg"));
            }catch (IOException exc){
            }
        }));

        //textField for user name
        userNameInsert.setBounds(WINDOW_WIDTH / 2 - 100, WINDOW_HEIGHT / 12, 100, 40);
        userNameInsert.setBackground(Color.WHITE);
        userNameInsert.setBackground(Color.gray);
        this.add(userNameInsert);
        userNameInsert.setVisible(true);

        searchButton.addActionListener((e -> {

             TwitterProfilePicture profilePicture = new TwitterProfilePicture();
           profilePicture.getProfilePicture(userNameInsert.getText());
            File file = new File("ProfilePicture.jpg");


            try {
                imageIcon1 = ImageIO.read(file);

                Icon imageIcon = new ImageIcon("ProfilePicture.jpg");
                JLabel jLabel1 = new JLabel(imageIcon);
                jLabel1.setBounds(30, 30, getWINDOW_WIDTH() / 3, getWINDOW_HEIGHT());
                this.add(jLabel1);

                paint(getGraphics(), imageIcon1);

            } catch (Exception j) {
                throw new RuntimeException(j);
            }

            grayScaleButton.setVisible(true);
            mirrorButton.setVisible(true);
            eliminateButton.setVisible(true);
            negativeButton.setVisible(true);
            lighterButton.setVisible(true);
            darkerButton.setVisible(true);
        }));

    }

    public void paint(Graphics g, BufferedImage image) {
        super.paint(g);

        g.drawImage(image, 620, 30, null);

           }

    public int getWINDOW_WIDTH() {
        return this.WINDOW_WIDTH;
    }

    public int getWINDOW_HEIGHT() {
        return this.WINDOW_HEIGHT;
    }
}
