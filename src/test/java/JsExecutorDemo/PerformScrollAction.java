package JsExecutorDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformScrollAction 
{		
		public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.hyrtutorials.com/");
			driver.manage().window().maximize();
		
			Thread.sleep(5000);
			
		WebElement element = driver.findElement(By.xpath("//a[text()='Yada Giri Reddy ']"));
			
			JavascriptExecutor js= (JavascriptExecutor)driver;
			
	js.executeScript("window.scrollTo(0,1000)");
			
	//		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			
	//		js.executeScript("window.scrollTo(arguments[0],arguments[1])",element.getLocation().x,element.getLocation().y);
			
	//		js.executeScript("window.scrollTo(0,1000)");
			
	//		Thread.sleep(5000);
			
	//		js.executeScript("window.scrollTo(0,1000)");
			
//			js.executeScript("arguments[0].scrollIntoView()", element);
//			driver.quit();

	   }

}
