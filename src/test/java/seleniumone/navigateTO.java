package seleniumone;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateTO {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //ToCommand
        driver.navigate().to("https://the-internet.herokuapp.com");
        Thread.sleep(2000);
        //backCommand
        driver.navigate().back();
        Thread.sleep(2000);
        //forwardCommand
        driver.navigate().forward();
        Thread.sleep(2000);
        //Refreshpage
        driver.navigate().refresh();
        driver.quit();
    }
}
