package selenium_programming;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_element
{

	public static void main(String[] args) 
	{

		WebDriver driver =new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");


	    driver.findElement(By.id("hide-textbox")).click();
	    JavascriptExecutor js=   (JavascriptExecutor)driver;
	    js.executeScript("document.getElementById(displayed-text').value='shailaja khandekar';");
	 

	}

}
