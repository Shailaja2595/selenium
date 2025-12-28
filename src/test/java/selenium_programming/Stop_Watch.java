package selenium_programming;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Stopwatch;

public class Stop_Watch 
{

	public static void main(String[] args) 
	{
		
		    WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        
	        //Open URL
			driver.get("https://www.facebook.com/");
			
			//Explicit wait
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
			Stopwatch watch = null;
		
		try
		{
			watch = Stopwatch.createStarted();
			
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
			watch.stop();
			
			 long seconds = watch.elapsed(TimeUnit.SECONDS);
			 
			 long millis = watch.elapsed(TimeUnit.MILLISECONDS);
			 
			 
			 System.out.println("Time taken to load element: " + seconds + " seconds");
			    System.out.println("Time taken to load element: " + millis + " milliseconds");
			element.click();
		} 
		
		catch (Exception e)
		
		{
			
			System.out.println(e);
			
		}
	}

}
