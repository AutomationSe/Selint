package sendkeys;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//How to press Enter key using Selenium WebDriver
public class pressenterkey {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");

        WebElement pressenterkey = driver.findElement(By.xpath("//input[@id='alert1']"));
//        Thread.sleep(3000);
        pressenterkey.sendKeys(Keys.ENTER);

    }
}
