package selenium_programming;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class u_have_10Links_print_title_of_each_link
{
	// You have 10 links — how will you print the title of each link?
	public static void main(String[] args) 
	{
     	WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		List<String> urls = new ArrayList<>();

		// Step 1: Collect href values
		for (WebElement link : links) {
			String href = link.getAttribute("href");
			if (href != null && !href.isEmpty()) {
				urls.add(href);
			}
	}
		// Step 2: Navigate safely
		for (String url : urls) {
			driver.navigate().to(url);
			System.out.println("Title: " + driver.getTitle());
		}
	}
}
//  “I loop through all links, navigate to each URL, capture the page title, and print it.”