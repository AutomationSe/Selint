package perform;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//How to perform drag and drop action in Selenium WebDriver
public class dragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/droppable");
        Thread.sleep(3000);
        WebElement image1 = driver.findElement(By.xpath("(//div[@id='draggable'])[1]"));
        WebElement image2 = driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
        Actions actions = new Actions(driver);
        Thread.sleep(3000);
        actions.dragAndDrop(image1,image2).build().perform();

    }
}
