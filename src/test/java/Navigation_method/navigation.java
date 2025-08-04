package Navigation_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation 
{

	public static void main(String[] args) throws InterruptedException {

          WebDriver driver=new ChromeDriver();
          driver.manage().window().maximize();
          
          driver.get("https://www.google.com/");
  
           Thread.sleep(5000);
           driver.findElement(By.name("q")).sendKeys("HYR Tutorials");
           driver.findElement(By.name("q")).submit();
           
            Thread.sleep(5000);
           	driver.navigate().to("https://www.facebook.com/");
           	
           	Thread.sleep(5000);
            driver.findElement(By.id("email")).sendKeys("shailaja2595@gmail.com");
            
            Thread.sleep(5000);
            driver.navigate().refresh();
            
            Thread.sleep(5000);
            driver.navigate().back();
            
            Thread.sleep(5000);
            driver.navigate().forward();
             
            Thread.sleep(5000);
            driver.quit();
            
	}

}