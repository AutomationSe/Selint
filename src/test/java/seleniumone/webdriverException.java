package seleniumone;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverException {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        //driver.get("https://omayo.blogspot.com/");
        //Nosuchelement
        //driver.findElement(By.xpath("(//input[@value='Loginx'])[1]")).click();

         //NoSuchWindowException
        //driver.switchTo().window("xyz");

        //Nosuchframeexception
        //driver.switchTo().frame("xyz");

        //NoAlertPresentException
        //driver.switchTo().alert();

        //InvalidSelectorException
//        driver.findElement(By.xpath("(///input[@value='Login'")).click();
        //Thread.sleep(5000);
         //ElementNotInteractableException
        //driver.findElement(By.xpath("(//input[@id='hbutton'])[1]")).click();

        driver.quit();
        //NoSuchSessionException
        driver.findElement(By.xpath("(//input[@id='hbutton'])[1]")).click();
    }
}
