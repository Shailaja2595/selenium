package handling_frame;

import java.awt.Frame;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Different_ways_handle_frame 
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	
 	   driver.get("https://ui.vision/demo/webtest/frames/");
	    driver.manage().window().maximize();

	WebElement a = driver.findElement(By.xpath("//*[@src='frame_1.html']"));
	 
	 //FIRST WAY
	  driver.switchTo().frame(a);
	  driver.findElement(By.xpath("//*[@src='frame_1.html']")).sendKeys("shailaja");           
	  
	  //SECOND WAY
	  
/*	  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
      wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.xpath("//*[@src='frame_1.html']"))));
     
     driver.findElement(By.xpath("//*[@src='frame_1.html']")).sendKeys("shailaja");      */
	  
}
	 }
