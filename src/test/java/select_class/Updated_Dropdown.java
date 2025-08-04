package select_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Updated_Dropdown {

	public static void main(String[] args) throws InterruptedException 
	{
	
		
	    WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		//dropdown
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(3000L);
        
        //default selected dropdown 1 value
        System.out.println(  driver.findElement(By.id("divpaxinfo")).getText());
         int i=1;
    
         while(i<3)
         {
        	 //selected person by clicking
        	 driver.findElement(By.id("hrefIncAdt")).click();
        	 i++;
         }
         
         
         Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "3 Adult");
         //see in output how many person selected by clicking
         System.out.println(  driver.findElement(By.id("divpaxinfo")).getText());
         driver.findElement(By.id("btnclosepaxoption")).click();
	}

}
