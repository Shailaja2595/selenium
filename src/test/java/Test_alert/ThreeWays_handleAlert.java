package Test_alert;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ThreeWays_handleAlert
{

	public static void main(String[] args) throws InterruptedException 
	{
          WebDriver driver=new ChromeDriver();
		
	    	driver.get("https://testautomationpractice.blogspot.com/");
		    driver.manage().window().maximize();
	   
          driver.findElement(By.id("alertBtn")).click();   //open alert
          Thread.sleep(3000);   
          
          //FIRST WAY
      /*             Alert a = driver.switchTo().alert();
                     a.accept();            */
          
          //SECOND WAY
    /*      WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
          Alert b=  wait.until(ExpectedConditions.alertIsPresent());
          b.accept();              */
          
          //THIRD WAY
         JavascriptExecutor s = (JavascriptExecutor)driver;
         try
         {
         s.executeScript("window.alert=function{}; ");
         }
         catch(Exception e)
         {
        	 
         }
          
          
          
          
	}

}
