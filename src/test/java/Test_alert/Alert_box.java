package Test_alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_box 
{

	public static void main(String[] args) throws InterruptedException
	{
		 WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         
         driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
         
         Thread.sleep(5000);
         System.out.println(driver.findElement(By.id("output")).getText());
         
         driver.findElement(By.id("alertBox")).click();
         
          Thread.sleep(5000);
          System.out.println(driver.switchTo().alert().getText());
          driver.switchTo().alert().accept();
         
          Thread.sleep(5000);
          System.out.println(driver.findElement(By.id("output")).getText());
         
         
         driver.quit();
	}

}
