package selenium_programming;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverexample
{

	public static void main(String[] args) throws InterruptedException
	{
		
		// HtmlUnit Driver is headless driver providing non - GUI implementation of selenium  WebDriver . 
        // It is written in java . This is inbuilt headless browser of slenium WebDriver .

		HtmlUnitDriver driver = new HtmlUnitDriver();

		driver.get("https://www.google.com/");
		System.out.println("Before Search : "+ driver.getTitle());
	WebElement search = driver.findElement(By.id("APjFqb"));
	search.sendKeys("india gate");
	search.sendKeys(Keys.ENTER);
	
	System.out.println("After Search : "+ driver.getTitle());

	Thread.sleep(3000);
	
	driver.quit();
	}

}                    
