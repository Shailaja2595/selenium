package handling_frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Nested_frame 
{

	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
	     driver.manage().window().maximize();
	     
	     driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
	    driver.findElement(By.id("name")).sendKeys("Hello");     //main webpage
	    
	    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frm3']")));
	    

	    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frm1']")));
	    
	      WebElement course = driver.findElement(By.id("course"));
         Select s=new Select(course);
         s.selectByVisibleText("Java");
         
         driver.switchTo().parentFrame();
         driver.findElement(By.id("name")).clear();
         driver.findElement(By.id("name")).sendKeys("frame 3");  // frame 3

         
         driver.switchTo().defaultContent();
         driver.findElement(By.id("name")).clear();
         driver.findElement(By.id("name")).sendKeys("main webpage"); //main web page
	}

}
