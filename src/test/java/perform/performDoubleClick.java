package perform;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//How to perform double click action in Selenium WebDriver
public class performDoubleClick {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");

        WebElement doubleclick = driver.findElement(By.xpath("(//button[normalize-space()='Double click Here'])[1]"));
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleclick).build().perform();
    }
}
