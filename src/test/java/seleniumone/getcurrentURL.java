package seleniumone;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//How to fetch the current page URL in Selenium WebDriver
public class getcurrentURL {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/login");
        driver.getCurrentUrl();
    }
}
