package POM;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pom 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		FileInputStream fs=new FileInputStream("./src/test/java/property/facebook.properties");
		Properties pr=new Properties();
		pr.load(fs);
		Thread.sleep(3000);
		String id = pr.getProperty("user");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(id);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(pr.getProperty("last"));
		
		

	}

}
