package select_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive_DropDown 
{

	public static void main(String[] args) throws InterruptedException
	{
	
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
//		
//	List<WebElement> list = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
//	
//	for (WebElement options : list) 
//	{
//		if(options.getText().equalsIgnoreCase("india"))
//		{
//			options.click();
//			
//			break;
//		}
//	}
		
		 List<WebElement> v = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
		 
		 
		 for (WebElement e : v) {
			
			 
			String actual = e.getText();
			
			System.out.println(actual);
			if(actual.equals("India")) {
				e.click();
			}
			 
		}
		
		
		
		
	}
}
