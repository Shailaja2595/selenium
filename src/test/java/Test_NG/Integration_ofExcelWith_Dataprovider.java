package Test_NG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Integration_ofExcelWith_Dataprovider 
{
         
	
	@Test(dataProvider="loginTest" , dataProviderClass=ExcelDataSupllier.class)
	public void loginTest(String username , String password) throws InterruptedException
	{
		     WebDriver driver=new ChromeDriver();
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
			driver.findElement(By.xpath("//*[@type='submit']")).click();
			Thread.sleep(3000);
			Assert.assertTrue(driver.findElement(By.xpath("//*[text()='manda user']")).isDisplayed());
			Thread.sleep(3000);
					driver.quit();
	}
	
	
	
}
