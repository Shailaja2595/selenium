package Test_NG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testng_practice 
{
	
	WebDriver driver;
   @BeforeTest
   @Parameters("Browser")
   public void initiate(String browser)
   {
	   
	   if (browser.equalsIgnoreCase("chrome")) 
	   {
		   driver=new ChromeDriver();
	   }
	   if(browser.equalsIgnoreCase("firefox"))
	   {
		   driver=new FirefoxDriver();
	   }
	  
	   if(browser.equalsIgnoreCase("edge"))
	   {
		   driver=new EdgeDriver();
	   }
	
   }
   
   @Test
   public void login()
   { 
	   driver.get("https://www.facebook.com/");
	   
	   driver.findElement(By.id("email")).sendKeys("8446017389");
	   driver.findElement(By.id("pass")).sendKeys("Snilabai9371$");
	   driver.findElement(By.name("login")).click();
   }
   
   @AfterTest
   public void close_browser() throws InterruptedException
   {
	   
	   Thread.sleep(5000);
	   driver.quit();
   }
}
