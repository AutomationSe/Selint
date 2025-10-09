package seleniumone;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verificationPoints {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        //driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
        Thread.sleep(5000);
        //isDisplayed
        System.out.println(driver.findElement(By.xpath("(//input[@value='Login'])[1]")).isDisplayed());
        //isEnabled
        System.out.println(driver.findElement(By.xpath("(//input[@value='Login'])[1]")).isEnabled());
        //isSelected
        //System.out.println(driver.findElement(By.xpath("(//input[@name='agree'])[1]")).isSelected());
        //Size
        if (driver.findElements(By.xpath("(//input[@value='Login'])[1]")).size() != 0) {
            System.out.println("Element exists.");
        } else {
            System.out.println("Element does not exist.");
        }

        //gettitle
        System.out.println(driver.getTitle());
        System.out.println(driver.getTitle().equals("Account Login"));
        //GetCurrent URL
        System.out.println(driver.getCurrentUrl().equals("https://tutorialsninja.com/demo/index.php?route=account/login"));
        //getpagesource
        //System.out.println(driver.getPageSource());
        //System.out.println(driver.getPageSource().contains("Email Address"));

        driver.quit();

    }
}
