package selenium_programming;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 
{

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver =new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
	     	//total rows in webtable
		     int rowList = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		        System.out.println("rows :"+rowList);
		 
	 		//total clm in webtable
	 		 int clmList = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		 		System.out.println("clms :"+clmList);
		 
		 
		 List<WebElement> v = driver.findElements(By.xpath("//table[@name='BookTable']//tr//td"));
		 
		 
		 for (WebElement e : v) {
			
			 
			 System.out.println(e.getText());
			 
		}
		 
		 Thread.sleep(3000);
		 
		 System.out.println(driver.findElement(By.xpath("(//table[@name='BookTable']//tr//td)[19]")).getText());
		 
		
	}

	
	
}
