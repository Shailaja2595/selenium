package selenium_programming;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Screenshot
{

	public static void main(String[] args) throws IOException, InterruptedException
	{
		WebDriver driver= new ChromeDriver ();
	
     	driver.manage().window().maximize();
//		driver.manage().window().fullscreen();
		
		
		
		driver.get("https://www.myntra.com/");
		Thread.sleep(3000);
		
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File f1=new File("./target/shailajak.png");
        
        Thread.sleep(3000);
        
        FileHandler.copy(f, f1);
        driver.quit();
        
        
        
//        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(src, new File("screenshot.png"));

        
        
        
	}

}
