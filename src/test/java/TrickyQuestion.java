import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.openqa.selenium.Keys;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrickyQuestion
{
	
	 WebDriver driver;
	
	@BeforeMethod
	public void setuo()
	{
		   driver = new ChromeDriver();
		  driver.get("https://www.flipkart.com/");	
	}
	
	@Test(enabled=false)
	public void Text1()
	{

	//	How can you check whether a particular text is present on a webpage?
		
	//	To verify text on a webpage, I use Selenium methods like getText(), getPageSource(), and isDisplayed() to validate 
	//	whether the expected text is present and visible.”
	 
		
		  // Method 1: getText()
		  String text = driver.findElement(By.xpath("//div[text()='Top Deals']")).getText();

		  if(text.contains("Top Deals")) {
		      System.out.println("Text is present");
		  } else {
		      System.out.println("Text is not present");
		  }

		
	//	Method 2: getPageSource()
		
		if(driver.getPageSource().contains("Flipkart"))
		{
		    System.out.println("Text found on page");
		}

		
		// Method 3: isDisplayed() (for element presence)
		
		WebElement message = driver.findElement(By.xpath("//img[@title='Flipkart']"));
		if(message.isDisplayed()) {
		    System.out.println("Text is displayed");
		}
		
	}

	
	@Test
	public void window()
	{

		//  how would you wait in selenium ,until the number of opened tabs should be equal to 4
		
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        // 3️⃣ Search for product
	        WebElement searchBox = driver.findElement(By.name("q"));
	        searchBox.sendKeys("mobile", Keys.ENTER);

	        // 5️⃣ Click first 3 products (each opens in new tab)
	        List<WebElement> products =
	                driver.findElements(By.xpath("//a[contains(@href,'/p/')]"));

	        products.get(0).click();
	        products.get(1).click();
	        products.get(2).click();

	        // 6️⃣ Wait until total tabs = 4
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(driver1 -> driver1.getWindowHandles().size() == 4);

	        System.out.println("4 tabs opened successfully");

	        // 7️⃣ Switch between tabs and check text
	        Set<String> allWindows = driver.getWindowHandles();

	        for (String window : allWindows) {
	            driver.switchTo().window(window);
	            System.out.println("Page Title: " + driver.getTitle());

	            // 8️⃣ Check text present on page
	            if (driver.getPageSource().contains("₹")) {
	                System.out.println("Price text is present on this page");

	            }
	
	
}
	}
}
