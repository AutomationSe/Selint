package seleniumTwo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class readJavascriptVariable {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        String title = (String) jse.executeScript("return document.title");
        System.out.println("Title is: " + title);
        driver.quit();
    }
}
