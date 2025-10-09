package seleniumone;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class headlessWindow {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        FirefoxOptions options  = new FirefoxOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        WebDriver driver = new FirefoxDriver(options);
        driver.get("https://demoblaze.com/");
        Thread.sleep(5000);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.quit();
    }
}
