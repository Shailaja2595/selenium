package FileUpload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class uploaddata {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/upload-download");
		
		WebElement v = driver.findElement(By.xpath("//input[@type='file']"));
		
		Actions ac=new Actions(driver);
		ac.click(v).build().perform();
		 
		 
//		   JavascriptExecutor js = (JavascriptExecutor) driver;
//	        js.executeScript("arguments[0].click();", v);
		
		
		Thread.sleep(2000);
		Robot r=new Robot() ;
		
		String path="C:\\Users\\subhash\\OneDrive\\Pictures\\Capture13.JPG";
		
		 StringSelection selection = new StringSelection(path);
	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
	        
	       r.keyPress(KeyEvent.VK_CONTROL) ;
	       r.keyPress(KeyEvent.VK_V);
	       
	     r.keyRelease(KeyEvent.VK_V);
	       r.keyRelease(KeyEvent.VK_CONTROL);
	     
	       Thread.sleep(1000);
		
		
	       r.keyPress(KeyEvent.VK_ENTER);
	        r.keyRelease(KeyEvent.VK_ENTER);
	        
	        System.out.println("hiiii");
	}

}
