package sendkeys;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//How to pause execution using Selenium WebDriver?
public class pauseExecution {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/login");
        synchronized (driver){
            driver.wait(5000);
        }

        WebElement sendemailkeys = driver.findElement(By.xpath("(//input[@id='username'])[1]"));
        sendemailkeys.sendKeys("tomsmith");
        driver.quit();
    }
}
