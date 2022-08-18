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

    ImageProcess image;

    JTextField userNameInsert = new JTextField();

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

            for (int x = 0; x < imageIcon2.getWidth(); x++) {
                for (int y = 0; y < imageIcon2.getHeight(); y++) {
                    int pixel = imageIcon2.getRGB(x, y);
                    Color color = new Color(pixel);

                    int red = color.getRed();
                    int green = color.getGreen();
                    int blue = color.getBlue();

                    int avarage = (red + green + blue) / 3;
                    Color newColor = new Color(avarage, avarage, avarage);
                    imageIcon2.setRGB(x, y, newColor.getRGB());
                }
            }

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

            TwitterProfilePicture profilePicture = new TwitterProfilePicture();
            profilePicture.getProfilePicture(userNameInsert.getText());
            File file = new File("ProfilePicture.jpg");
            File file2 = new File("PictureChange");

            try {
                imageIcon1 = ImageIO.read(file);
//                אופציה של חריטה על המסך
                Icon imageIcon = new ImageIcon("ProfilePicture.jpg");
                JLabel jLabel1 = new JLabel(imageIcon);
                jLabel1.setBounds(30, 30, getWINDOW_WIDTH() / 3, getWINDOW_HEIGHT() - 60);
                this.add(jLabel1);
//                אופציה של ציור על המסך

                imageIcon2 = ImageIO.read(file2);
                paint(getGraphics());

            } catch (IOException j) {
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

    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(imageIcon2, 700, 200, null);
    }

    public int getWINDOW_WIDTH() {
        return this.WINDOW_WIDTH;
    }

    public int getWINDOW_HEIGHT() {
        return this.WINDOW_HEIGHT;
    }
}
