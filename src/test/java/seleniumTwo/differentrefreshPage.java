package seleniumTwo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

//Different ways for refreshing the page using Selenium WebDriver
public class differentrefreshPage {
    /*
    * 1. Refresh
    * driver.navigate().refresh()
    * 2. sendkeys()
    * sendkeys(Keys.f5) of Actionclass
    * 3. JavascriptExecuter
    * 4. driver.get(driver.getCurrentURL)
    * 5. driver.navigate().to(driver.getCurrentUrl());
    *
    */

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        Thread.sleep(5000);

        // 1. Using driver.navigate().refresh()
        System.out.println("Refreshing using driver.navigate().refresh()");
        driver.navigate().refresh();
        Thread.sleep(3000);

        // 2. Using Actions class to send Keys.F5
        System.out.println("Refreshing using Actions Class");
        Actions actions = new Actions(driver);
        actions.sendKeys(org.openqa.selenium.Keys.F5).perform();
        Thread.sleep(3000);

        // 3. Using JavascriptExecutor
        System.out.println("Refreshing using JavascriptExecutor");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("location.reload()");
        Thread.sleep(3000);

        // 4. Using driver.get(driver.getCurrentUrl())
        System.out.println("Refreshing using driver.get(driver.getCurrentUrl())");
        driver.get(driver.getCurrentUrl());
        Thread.sleep(3000);

        // 5. Using driver.navigate().to(driver.getCurrentUrl())
        System.out.println("Refreshing using driver.navigate().to(driver.getCurrentUrl())");
        driver.navigate().to(driver.getCurrentUrl());
        Thread.sleep(3000);

        driver.quit();
    }
}
