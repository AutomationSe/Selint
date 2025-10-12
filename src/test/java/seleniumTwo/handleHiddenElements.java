package seleniumTwo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleHiddenElements {
    public static void main(String[] args) throws InterruptedException {
        // Setup Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open the practice page
        driver.get("https://www.letskodeit.com/practice");

        // Click on 'Hide' button to hide the textbox
        driver.findElement(By.id("hide-textbox")).click();
        Thread.sleep(2000); // wait for effect

        // Create JavaScript Executor instance
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Make the hidden textbox visible again (optional but clean)
        js.executeScript("document.getElementById('displayed-text').style.display='block';");

        // Enter text into the textbox using JavaScript
        js.executeScript("document.getElementById('displayed-text').value='Arun Matoori';");

        // Optional: Print the value back to verify
        String enteredText = (String) js.executeScript("return document.getElementById('displayed-text').value;");
        System.out.println("Textbox value is: " + enteredText);

        // Close browser
        Thread.sleep(2000);
        driver.quit();


    }
}
