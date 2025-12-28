package selenium_programming;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_full 
{

	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver= new ChromeDriver ();	
     	driver.manage().window().maximize();

		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
		
		
		// capture full page screenshot
//		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        File f1=new File("./target/shail.png");
//        
//        Thread.sleep(3000);
//        
//        FileHandler.copy(f, f1);
//        driver.quit();

        // capture section of web Page screenshot

//       WebElement section = driver.findElement(By.xpath("//img[@alt='awareness']"));
//     File f = section .getScreenshotAs(OutputType.FILE);
//        File f1=new File("./target/section.png");
//        
//        Thread.sleep(3000);
//        
//        FileHandler.copy(f, f1);
//        driver.quit();
        
        
        // capture WebElement screenshot

        WebElement element = driver.findElement(By.xpath("//a[@id='register_Layer']"));
      File f = element .getScreenshotAs(OutputType.FILE);
         File f1=new File("./target/WebElement_element.png");
         
         Thread.sleep(3000);
         
         FileHandler.copy(f, f1);
         driver.quit();
        
	}

}
