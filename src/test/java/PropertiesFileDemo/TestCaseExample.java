package PropertiesFileDemo;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseExample {

	public static void main(String[] args) throws IOException
	{
		
		ReadConfigFile ConfigFile = new ReadConfigFile ();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(ConfigFile.getURL());
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(ConfigFile.getUserName());
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(ConfigFile.getPassword());
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
