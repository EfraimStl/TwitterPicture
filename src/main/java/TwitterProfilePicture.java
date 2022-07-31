import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;


public class TwitterProfilePicture {

    ChromeDriver driver;

    public void getProfilePicture (String profile){

       System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        try {
            driver = new ChromeDriver();
            profile="St_David12";
            driver.get("https://twitter.com/" + profile+"/photo");

            Thread.sleep(2000);
           WebElement element = driver.findElement(By.className("css-9pa8cd"));
            String path = element.getAttribute("src");
            //String paath = "https://pbs.twimg.com/profile_images/1537331123314892801/FJ_aGeBm_400x400.jpg";
            URL url = new URL(path);
            BufferedImage img = ImageIO.read(url);

            File file = new File("ProfilePicture.jpg");
            //file.createNewFile();
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
