package waits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class implicitwait {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://omayo.blogspot.com/");
        driver.findElement(By.className("dropbtn")).click();
        // Implicit wait
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(5));
        driver.findElement(By.linkText("Facebook")).click();
    }
}
