package sendkeys;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.lang.reflect.Field;
import java.util.HashMap;

//How to download a file in Selenium WebDriver
public class downloadFIle {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        String downloadFilePath = System.getProperty("user.dir");

        HashMap<String, Object> chromePrefs = new HashMap<>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", downloadFilePath);

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("https://omayo.blogspot.com/p/page7.html");

        driver.findElement(By.linkText("ZIP file")).click();
        Thread.sleep(5000);
        File file = new File(downloadFilePath + "\\DownloadDemo-master.zip");
        if (file.exists()){
            System.out.println("file Got sucessfully downloaded");
        }else {
            System.out.println("File didn't get downloaded");
        }
    }
}