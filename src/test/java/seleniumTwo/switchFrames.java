package seleniumTwo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.sql.rowset.WebRowSet;

//How to switch to frames in Selenium WebDriver
public class switchFrames {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        Dimension d = new Dimension(500,900);
        driver.manage().window().setSize(d);
        driver.get("https://practice.expandtesting.com/iframe");
    }
}
