package selenium_programming;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighLight_element
{

	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/");

	WebElement SerachBox = driver.findElement(By.name("search"));
	
	JavascriptExecutor js =  (JavascriptExecutor)driver;
	js.executeScript("arguments[0].setAttribute('style','background:yellow; border:2px solid red;');", SerachBox);
	}

}
