package JsExecutorDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Highlight_element 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	
		Thread.sleep(5000);
		
	WebElement emailtext = driver.findElement(By.id("email"));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAttribute('style', 'border:10px solid green; background:yellow');" ,emailtext);//highlight
		Thread.sleep(5000);
		
		
		js.executeScript("arguments[0].setAttribute('style', 'border:; background:');" ,emailtext);     

	}

}
