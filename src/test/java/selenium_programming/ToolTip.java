package selenium_programming;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip 
{

	public static void main(String[] args)
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");

	@Nullable
	String actualToolTip = driver.findElement(By.xpath("//a[@href='/reg/']")).getAttribute("title");
	String expectedToolTip="Sign up for Facebook";
	
	if(actualToolTip.equalsIgnoreCase(expectedToolTip))
	{
		System.out.println("TestCase Pass");
	}
	else
	{
		System.out.println("TestCase fail");
	}
	
	}

}
