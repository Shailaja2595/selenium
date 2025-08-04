package select_class;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBox_DropDown 
{

	public static void main(String[] args) throws InterruptedException 
	{
		 WebDriver driver=new ChromeDriver();
			
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
			
			WebElement common = driver.findElement(By.xpath("//input[@type='checkbox']"));
			System.out.println(common.isSelected());
			
			Assert.assertFalse(false);
			
			
		    WebElement first = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']"));
		    first.click();
		    System.out.println(first.isSelected());
		    
		    Assert.assertTrue(true);
		   
	    // List<WebElement> all_checkBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
	     
	       List<WebElement> all_checkBox = driver.findElements(By.xpath("//div[@id='discount-checkbox']//div"));
	  
	       System.out.println( all_checkBox.size());
		
		    for(WebElement checkbox :all_checkBox)	
		    { 
		    	    checkbox.click();
		    		
		    	    Thread.sleep(1000);
		    	    System.out.println(checkbox.isSelected());
		   
		    }
		   
		    
//		    for(int i=0; i<all_checkBox.size(); i++) {
//		    	all_checkBox.get(i).click();
//		    	System.out.println(all_checkBox.isSelected());
//		    
//		    }
		    
		
		    }
	}


