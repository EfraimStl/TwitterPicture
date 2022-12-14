import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.imageio.ImageIO;
import javax.imageio.ImageWriter;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;


public class TwitterProfilePicture {

    ChromeDriver driver;

    public void getProfilePicture (String profile){

       System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        try {
            driver = new ChromeDriver();
            driver.get("https://twitter.com/" + profile+"/photo");

            Thread.sleep(2000);
           WebElement element = driver.findElement(By.className("css-9pa8cd"));
            String path = element.getAttribute("src");
            URL url = new URL(path);
            BufferedImage img = ImageIO.read(url);

            File file = new File("ProfilePicture.jpg");
            ImageIO.write(img, "jpg", file);

            Thread.sleep(2000);

        } catch (Exception e){
            e.printStackTrace();
            System.out.println("An error occurred.");
        }finally {
            driver.close();
        }
    }
}
