package select_class;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_button_enable_disabled 
{

	public static void main(String[] args) throws InterruptedException
	{
		     WebDriver driver=new ChromeDriver();
			
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			driver.manage().window().maximize();

			//Round Trip
			driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
			
			String calender = driver.findElement(By.id("Div1")).getDomAttribute("style");
			
			System.out.println(calender);
			
			if(calender.contains("display: block; opacity: 1;")) {
				System.out.println("is enabled");
			}
			else {
				System.out.println("is disabled");
			}
			
			Thread.sleep(3000); 
			
			//one way
			driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
			
			String calender1 = driver.findElement(By.id("Div1")).getDomAttribute("style");
			System.out.println(calender1);
			
			if(calender1.contains("display: block; opacity: 1;")) {
				System.out.println("is enabled");
			}
			else {
				System.out.println(" is  disabled");
			}
			
			
			
			
	}

}
