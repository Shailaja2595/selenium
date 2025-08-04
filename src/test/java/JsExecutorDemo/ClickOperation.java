package JsExecutorDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOperation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		driver.manage().window().maximize();
		
		WebElement checkbox = driver.findElement(By.id("femalerb"));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", checkbox);
		
		Thread.sleep(5000);
 
		
	
		WebElement v = driver.findElement(By.xpath("//b[text()='Languages known']"));
		
		js.executeScript("arguments[0].scrollIntoView()", v);
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='bcCheckBox']"));
		
	for(WebElement object : checkboxes)
	{
		object.click();
	}
	
   	Thread.sleep(5000);
      	
		driver.quit();
	}

}

