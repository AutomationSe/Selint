package seleniumTwo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

//How can you find broken links in a page using Selenium WebDriver?
public class checkBrokenLinks {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoblaze.com/");

        // Get all anchor (<a>) elements
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total links found: " + links.size());

        // Counters
        int validCount = 0;
        int brokenCount = 0;

        for (WebElement link : links) {
            String url = link.getAttribute("href");
            // Skip empty or null links
            if (url == null || url.isEmpty()) {
                System.out.println("⚠️ Skipped: Empty or missing href");
                continue;
            }
            try {
                // Open HTTP connection
                HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
                connection.setRequestMethod("HEAD"); // faster than GET
                connection.connect();
                int responseCode = connection.getResponseCode();
                if (responseCode >= 400) {
                    System.out.println("❌ Broken link: " + url + " | Code: " + responseCode);
                    brokenCount++;
                } else {
                    System.out.println("✅ Valid link: " + url + " | Code: " + responseCode);
                    validCount++;
                }
                connection.disconnect();

            } catch (Exception e) {
                System.out.println("⚠️ Error checking link: " + url + " | Exception: " + e.getMessage());
            }
        }

        System.out.println("\n🔹 Summary:");
        System.out.println("Total Links: " + links.size());
        System.out.println("Valid: " + validCount + " | Broken: " + brokenCount);

        driver.quit();
    }
}
