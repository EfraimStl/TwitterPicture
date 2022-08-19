
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

    public void mirror(BufferedImage image) {
        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                int pixel = image.getRGB(x, y);
                Color color = new Color(pixel);

                image.setRGB(image.getWidth() - x - 1, y, color.getRGB());
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

                image.setRGB(255 - red, 255 - green, 255 - blue);
            }
        }

    }

    public void eliminate(BufferedImage image){

        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                int pixel = image.getRGB(x, y);
                Color color = new Color(pixel);

                int green = color.getGreen();
                int blue = color.getBlue();


                Color newColor = new Color(green, green, blue);
                image.setRGB(x, y, newColor.getRGB());
            }
        }
    }

    public void Lighter (BufferedImage image){
        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                int pixel = image.getRGB(x, y);
                Color color = new Color(pixel);

                int red = color.getRed();
                int green = color.getGreen();
                int blue = color.getBlue();

                Color newColor = new Color(intenseColor(red, 1.3), intenseColor(green, 1.2), intenseColor(blue, 1.2));
               image.setRGB(x, y, newColor.getRGB());
                // image.setRGB(intenseColor(red, 1.3), intenseColor(green, 1.2), intenseColor(blue, 1.2));
            }
        }
    }

    public void Darker (BufferedImage image){
        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                int pixel = image.getRGB(x, y);
                Color color = new Color(pixel);

                int red = color.getRed();
                int green = color.getGreen();
                int blue = color.getBlue();

                image.setRGB(intenseColor(red, 0.7), intenseColor(green, 0.7), intenseColor(blue, 0.7));
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
