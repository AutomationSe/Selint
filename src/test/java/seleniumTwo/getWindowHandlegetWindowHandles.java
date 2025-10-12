package seleniumTwo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.CdpEndpointFinder;

import java.util.Iterator;
import java.util.Set;

//Difference between getWindowHandle() and getWinowHandles()
public class getWindowHandlegetWindowHandles {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://omayo.blogspot.com");

        driver.findElement(By.linkText("Open a popup window")).click();
        String window = driver.getWindowHandle();
        System.out.println("window handle: " + window);
        Thread.sleep(2000);

//        driver.getWindowHandles();
        Set<String> allwindows = driver.getWindowHandles();
        Iterator<String> itr = allwindows.iterator();
        itr.next(); //first Window Handle
        String childwindow = itr.next(); //second window handle
        driver.switchTo().window(childwindow);
        Thread.sleep(3000);
        driver.close();
        driver.switchTo().window(window);
        Thread.sleep(3000);
        driver.close();
    }
}
