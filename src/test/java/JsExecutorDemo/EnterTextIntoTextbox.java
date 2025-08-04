package JsExecutorDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterTextIntoTextbox 
{

	public static void main(String[] args) throws InterruptedException
	{
	
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='shailaja2595@gmail.com'", email);
		
		Thread.sleep(5000);
		
		//PRINT THE TEXT
		String text = (String) js.executeScript("return document.getElementById('email').value;");

         System.out.println(text);
         driver.quit();
	}

}
