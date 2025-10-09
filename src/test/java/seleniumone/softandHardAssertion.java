package seleniumone;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class softandHardAssertion {
    public static void main(String[] args) throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        Thread.sleep(5000);
//        Assert.assertTrue(driver.getTitle().equals("xyz"));
        softAssert.assertTrue(driver.getTitle().equals("xyz"));
        driver.findElement(By.id("input-email")).sendKeys("arun.selenuim@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("Second@123");
        driver.findElement(By.xpath("(//input[@value='Login'])[1]")).click();

        if (driver.findElements(By.xpath("(//div[@class='alert alert-danger alert-dismissible'])[1]")).size() > 0) {
            System.out.println("❌ Error message displayed - login failed!");
            Assert.fail("Login failed - Error message appeared.");
        } else {
            System.out.println("✅ Login successful - No error message found.");
        }
        softAssert.assertAll();
        driver.quit();

    }
}
