package JsExecutorDemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToDisplay_Alert 
{

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("alert('Hello')");

	}

}
