package Actions_class;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Move_element {

	public static void main(String[] args) throws InterruptedException {

		
	       WebDriver driver =new ChromeDriver();
           driver.get("https://www.naukri.com/");
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       //    Thread.sleep(3000);         
          driver.findElement(By.xpath("(//*[text()='Login'])[1]")).click();
          driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("shailaja2595@gmail.com");
          driver.findElement(By.xpath("//input[@type='password']")).sendKeys("shailaja@25");
          driver.findElement(By.xpath("//button[text()='Login']")).click();
          
         Thread.sleep(5000);
          
        WebElement move = driver.findElement(By.xpath("//div[text()='Jobs']"));
        Thread.sleep(5000);
         Actions act=new Actions(driver);
          act.moveToElement(move).build().perform();
          
          move.click();
       
          
	}

}