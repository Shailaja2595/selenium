package Excel_data;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	WebDriver driver;
	
	
	@Test(dataProvider = "excel", dataProviderClass =Get_data_excel .class)
	

	
	public void login(String id, String ps)
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		driver.findElement(By.xpath("//a[@id='login_Layer']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(id);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(ps);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
