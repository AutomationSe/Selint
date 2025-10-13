package sendkeys;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadfile {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        String projectpath = System.getProperty("user.dir");
        driver.findElement(By.id("uploadfile")).sendKeys(projectpath+"\\test\\resources\\wave.jpg");

    }
}
