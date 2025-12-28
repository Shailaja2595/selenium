package selenium_programming;

import java.time.Duration;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EncodedPasswordExample
{

	public static void main(String[] args) 
	{
	
		// encoded password
		String password ="admin123";
		
	byte[] encodedPassword = Base64.encodeBase64(password.getBytes());
		
	System.out.println(new String(encodedPassword));
		
    WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	//enter userName
	driver.findElement(By.name("username")).sendKeys("Admin");
	
	//Decode Password
	byte[] decodePassword = Base64.decodeBase64("YWRtaW4xMjM=");
	
	driver.findElement(By.name("password")).sendKeys(new String(decodePassword));
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	
	}

}
