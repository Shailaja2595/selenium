package selenium_programming;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Img_source_url 
{

	public static void main(String[] args)
	{
		    WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        driver.manage().window().maximize();
	        driver.get("https://www.facebook.com/");

	   WebElement imageLogo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
	  
	   System.out.println(  "Src attribute value : " + imageLogo.getDomAttribute("src"));
	}

}
