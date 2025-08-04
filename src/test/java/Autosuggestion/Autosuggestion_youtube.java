package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion_youtube 
{

	public static void main(String[] args) throws InterruptedException 
	{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.google.com/");
			driver.findElement(By.xpath("//*[@name='q']")).sendKeys("banaglore");
			Thread.sleep(3000);
			
		List<WebElement> auto = driver.findElements(By.xpath("//ul[@jsname='bw4e9b']/li"));
	   int	size=auto.size();
	
	System.out.println(size);
	
    auto.get(size-7).click();
	
	}

}
