package seleniumTwo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

//How to find more than one web element in Selenium WebDriver? //findElements
public class findMoreoneElement {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        driver.quit();
    }
}
