package seleniumone;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.WatchEvent;

//How to login into any site using selenium if it is showing an authentication popup
public class authenticationPopUp {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //syntax: https://username:password@url
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
//        driver.quit();

    }
}
