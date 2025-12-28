package selenium_programming;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_BrokenLinkCode {

    public static void main(String[] args) throws IOException {
        
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("http://www.deadlinkcity.com/");

        List<WebElement> links = driver.findElements(By.tagName("a"));
        int brokenLinkCount = 0;

        System.out.println("Total Links = " + links.size());

        for (WebElement element : links) {
            String url = element.getAttribute("href");  // safer than getDomAttribute()

            try {
                URL u = new URL(url);
                HttpURLConnection connection = (HttpURLConnection) u.openConnection();
                connection.setRequestMethod("HEAD");
                connection.connect();

                int resCode = connection.getResponseCode();

                if (resCode >= 400) {
                    System.out.println(url + " --> Broken Link");
                    brokenLinkCount++;
                }

            } catch (Exception e) {
                System.out.println("Skipping invalid URL: " + url);
            }
        }

        System.out.println("Total Broken Links: " + brokenLinkCount);

        driver.quit();
    }
}
