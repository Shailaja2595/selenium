package Multiple_windows_tabs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_handles 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		
	     WebDriver driver =new ChromeDriver();
	     driver.manage().window().maximize();
	     
	     driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
	   String parentHandle = driver.getWindowHandle();
	   System.out.println("parent window = "+ parentHandle);
	   
        driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
      Set<String> handles = driver.getWindowHandles();
      
      for(String hd:handles)
      {
    	  System.out.println("child window = "+hd);
    	  
    	  if(! hd.equals(parentHandle))
    	  {
    		  driver.switchTo().window(hd);
    		  
    		  driver.findElement(By.id("firstName")).sendKeys("shailaja");
    		  Thread.sleep(2000);
    		  driver.close();
    	  }
    	  
    	    
      }
      
      driver.switchTo().window(parentHandle);
      driver.findElement(By.id("name")).sendKeys("subhash");
      Thread.sleep(2000);
    driver.quit();
	}
      

}
