package selenium_programming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCssValue 
{

	public static void main(String[] args)
	{
		 WebDriver driver=new ChromeDriver();	
		 driver.get("https://www.google.com/");
		 
	     String fontsizelogo = driver.findElement(By.className("lnXdpd")).getCssValue("font-size");
		 System.out.println( fontsizelogo );

	}

}
