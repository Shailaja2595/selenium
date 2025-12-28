import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo 
{

	public static void main(String[] args)
	{
		
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement search = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		
		search.sendKeys("subhash");
		
		search.sendKeys(" shailaja");

//    driver.switchTo().newWindow(WindowType.TAB);
//
//	
//		String main =driver.getWindowHandle();
//		driver.findElement(By.xpath("element")).click();
//
//	 Set<String> child = driver.getWindowHandles();
//
//		for(String w: child)
//		{
//		driver.switchTo().window(w);
//
//		if(!w.equals(child))
//		{
//			driver.findElement(By.xpath("element")).click();
//			driver.close();
//		}
//	}
//		driver.switchTo().window(main);
		
}
	}