package waits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// For wating for a specific element
public class explicitWait {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://omayo.blogspot.com/");
        driver.findElement(By.className("dropbtn")).click();
        // Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(8));
        //wait for element to be visible
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook"))).click();
        //wait for element to be clickable
        WebElement timerbutton =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='timerButton'])[1]")));
        timerbutton.click();
//        driver.quit();
    }
}
