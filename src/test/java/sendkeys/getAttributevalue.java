package sendkeys;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Get an attribute value of an element using Selenium WebDriver
public class getAttributevalue {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://omayo.blogspot.com/");
        String text = driver.findElement(By.id("textbox1")).getAttribute("value");
        System.out.println("element stored " + text);
        driver.quit();
    }
}
