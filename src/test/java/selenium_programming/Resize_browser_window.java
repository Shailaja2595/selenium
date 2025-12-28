package selenium_programming;

import  org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resize_browser_window
{

	public static void main(String[] args)
	{
	
		WebDriver driver =new ChromeDriver();
		Dimension d =  new Dimension(500,600);
		driver.manage().window().setSize(d);

	}

}
