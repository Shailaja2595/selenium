package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Fill_form_inOne_statement 
{

	public static void main(String[] args) 
	{    
		
		
		    WebDriver driver=new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();

			
			Actions act =new Actions (driver);
			Action seriesOfAction =act
					.moveToElement(driver.findElement(By.id("user-name")))
					.click()
					.sendKeys("standard_user" ,Keys.TAB)
					.sendKeys("secret_sauce" ,Keys.ENTER)
					.build();
			        seriesOfAction.perform();
		

	}

}
