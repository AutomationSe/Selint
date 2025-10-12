package seleniumTwo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//How to delete cookies in Selenium
public class deleteCookies {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://the-internet.herokuapp.com/");
        driver.manage().deleteAllCookies();
    }
}
