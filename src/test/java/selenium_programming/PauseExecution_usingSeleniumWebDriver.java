package selenium_programming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class PauseExecution_usingSeleniumWebDriver 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
			WebDriver driver =new ChromeDriver();
			driver.get("https://omayo.blogspot.com/2013/05/page-one.html");

	
		String text = driver.findElement(By.xpath("(//textarea[@rows='10'])[2]")).getText();
		System.out.println(text);
		
		synchronized (driver) 
		{
		driver.wait(5000);
		}
		 driver.findElement(By.xpath("(//textarea[@rows='10'])[2]")).clear();
			
	}

}
