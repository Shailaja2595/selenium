package select_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetMethods_dropdown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		
		
		    //single dropdown
	       WebElement dropdown = driver.findElement(By.id("course"));
	       Select s=new Select(dropdown);
	       
	       s.selectByIndex(1); 
	       Thread.sleep(2000);
	        
	     //multiple dropdown
           WebElement dropdown1 = driver.findElement(By.id("ide"));		
	           Select s1=new Select(dropdown1);    
	          
	           s1.selectByIndex(3);
	           Thread.sleep(2000);
	           
	           s1.selectByValue("ec");  
	           Thread.sleep(2000);
	           
	           //single dropdown
	           List<WebElement> v = s.getOptions();
	 	      System.out.println("CoursesAvailable::");
		     
	 	      for (WebElement e : v)
	 	      {
	 	    	  System.out.println(e.getText());
	 			
	 		  }
	 	     System.out.println();
	 	      
	 	     //multiple dropdown
	 	     List<WebElement> g = s1.getAllSelectedOptions();
	 	     System.out.println("ideSelected ::");
	           for (WebElement c : g)
	 	      {
	 	    	  System.out.println(c.getText());
	 			
	 		  }
	           
	           System.out.println();
	           System.out.println("SelectedOptions::");
	           System.out.println(s.getFirstSelectedOption().getText());
	           
	           driver.quit();
	           
	}
}
