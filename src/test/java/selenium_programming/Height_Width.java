package selenium_programming;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Height_Width 
{

	public static void main(String[] args) 
	{

		 WebDriver driver=new ChromeDriver();	
		 driver.get("https://www.google.com/");
		 
        Dimension logo = driver.findElement(By.className("lnXdpd")).getSize();
        System.out.println("Height of logo :"+logo.height);
        System.out.println("Width  of logo :"+logo.width);
	}

}
