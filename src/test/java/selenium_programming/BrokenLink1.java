package selenium_programming;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink1 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		List<WebElement> links = driver.findElements(By.tagName("a"));

		for (WebElement e : links) {

			String url = e.getDomAttribute("href");

			try {

				URL l = new URL(url);

				HttpsURLConnection xy = (HttpsURLConnection) l.openConnection();

				xy.connect();

				if (xy.getResponseCode() >= 400) {
					System.out.println(l + "   ->" + xy.getResponseMessage() + "   ->broken links");
				}

				else {
					System.out.println(l + "   ->" + xy.getResponseMessage());
				}

			} catch (MalformedURLException e2) {
				System.out.println("MalformedURLException");
			}
		}
	}
}
