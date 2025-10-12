package seleniumTwo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptExecuter {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");

        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("alert('Senel Ariyarathna')");

        //Scroll the page
//        jse.executeScript("window.scrollBy(0,600)");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement alertbutton = driver.findElement(By.id("alert1"));
        jse.executeScript("arguments[0].click()", alertbutton);


    }
}
