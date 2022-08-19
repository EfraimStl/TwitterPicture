
import java.awt.*;
import java.awt.image.BufferedImage;


public class ImageProcess {

    public void grayScale(BufferedImage image) {

        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                int pixel = image.getRGB(x, y);
                Color color = new Color(pixel);

                int red = color.getRed();
                int green = color.getGreen();
                int blue = color.getBlue();

                int avarage = (red + green + blue) / 3;
                Color newColor = new Color(avarage, avarage, avarage);
                image.setRGB(x, y, newColor.getRGB());
            }
        }
    }

    public void mirror(BufferedImage help, BufferedImage image) {
        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                int pixel = image.getRGB(x, y);
                Color color = new Color(pixel);

                help.setRGB(image.getWidth() - x - 1, y, color.getRGB());
            }
        }
    }

    public void negative(BufferedImage image){

        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                int pixel = image.getRGB(x, y);
                Color color = new Color(pixel);

                int red = color.getRed();
                int green = color.getGreen();
                int blue = color.getBlue();

                Color color1 = new Color(255 - red, 255 - green, 255 - blue);
                image.setRGB(x,y,color1.getRGB());
            }
        }

    }

    public void eliminateGreen(BufferedImage image){

        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                int pixel = image.getRGB(x, y);
                Color color = new Color(pixel);

                int red = color.getRed();
                int green = color.getGreen();
                int blue = color.getBlue();


                Color newColor = new Color(red, blue, blue);
                image.setRGB(x, y, newColor.getRGB());
            }
        }
    }

    public void lighter (BufferedImage image){
        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                int pixel = image.getRGB(x, y);
                Color color = new Color(pixel);

                int red = color.getRed();
                int green = color.getGreen();
                int blue = color.getBlue();

                Color newColor = new Color(intenseColor(red, 1.5), intenseColor(green, 1.5), intenseColor(blue, 1.5));
                image.setRGB(x, y, newColor.getRGB());
            }
        }
    }

    public void darker (BufferedImage image){
        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                int pixel = image.getRGB(x, y);
                Color color = new Color(pixel);

                int red = color.getRed();
                int green = color.getGreen();
                int blue = color.getBlue();

                Color newColor = new Color(intenseColor(red, 0.7), intenseColor(green, 0.7), intenseColor(blue, 0.7));
                image.setRGB(x, y, newColor.getRGB());
            }
        }
    }


    public static int intenseColor(int original, double by) {
        original *= by;
        if (original > 255)
            original = 255;
        return original;
    }
}
