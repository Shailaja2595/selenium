package Test_alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prompt_box {

	public static void main(String[] args) throws InterruptedException {
		

		 WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
      
        System.out.println(driver.findElement(By.id("output")).getText());
        
        driver.findElement(By.id("promptBox")).click();
     
   
         System.out.println(driver.switchTo().alert().getText());
         
         Thread.sleep(5000);
         driver.switchTo().alert().sendKeys("HYR Tutorials");
         driver.switchTo().alert().accept();
         
         Thread.sleep(5000);
         System.out.println(driver.findElement(By.id("output")).getText());
         driver.findElement(By.id("promptBox")).click();
         
         Thread.sleep(5000);
         System.out.println(driver.switchTo().alert().getText());
         driver.switchTo().alert().dismiss();
        
         System.out.println(driver.findElement(By.id("output")).getText());
         Thread.sleep(5000);
         driver.quit();
	}

}
