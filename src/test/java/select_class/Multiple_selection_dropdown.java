package select_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_selection_dropdown 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		
		
		WebElement dropdown = driver.findElement(By.id("ide"));
		
		  //SELECT DROPDOWN
		
           Select s=new Select(dropdown);
           
           s.selectByIndex(3);
           
           Thread.sleep(2000);
           
           s.selectByValue("ec");
           
           Thread.sleep(2000);
           
           s.selectByVisibleText("Visual Studio");
           
           Thread.sleep(2000);
           
           // DESELECT DROPDOWN
           
           s.deselectByIndex(3);
           
           Thread.sleep(2000);
           
           s.deselectByValue("ec");
           
           Thread.sleep(2000);
           
           s.deselectByVisibleText("Visual Studio");
           
	}

}
