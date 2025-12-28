package selenium_programming;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;


public class colors 
{

	public static void main(String[] args) 
	{
       WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		String expected="#f8f9fa";
		WebElement webElement = driver.findElement(By.xpath("(//*[@class='gNO89b'])[2]"));
		String rgbacolor = webElement.getCssValue("background-color");
		
		System.out.println(rgbacolor);
		
		
		Color colr = Color.fromString(rgbacolor);
		
		String actual = colr.asHex();
		System.out.println(actual);
		
		
		Assert.assertEquals(actual, expected);

	
		
	}

}
