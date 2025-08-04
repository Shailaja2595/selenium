package FileUpload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Naukari 
{

	public static void main(String[] args) throws InterruptedException, FileNotFoundException, AWTException 
	{

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		//click on Login
		driver.findElement(By.xpath("//a[@id='login_Layer']")).click();
		
		Thread.sleep(3000);
		//Enter Credentials
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("shailaja2595@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Shailaja@2595");
		
		Thread.sleep(3000);
		// Click Login Button
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(3000);
		// click on Profile Icon
		driver.findElement(By.xpath("//img[@class='nI-gNb-icon-img']")).click();

		Thread.sleep(3000);
		//click on view and update profile
		driver.findElement(By.xpath("//a[@class='nI-gNb-info__sub-link']")).click();

		Thread.sleep(5000);
		//Locate the hidden input tag and upload file
//	WebElement upload = driver.findElement(By.xpath("//input[@value='Update resume']"));
//	upload.sendKeys("C:\\Users\\subhash\\OneDrive\\Desktop\\NewResume\\shailaja2025.docx");
		
//		// Wait until the file input element is available
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//	WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='button' and contains(@value, 'Update resume')]")));
//	fileInput.sendKeys("C:\\Users\\subhash\\OneDrive\\Desktop\\NewResume\\shailaja2025.docx");
		
	//	WebElement delete = driver.findElement(By.xpath("(//i[@class='icon'])[2]"));
		
//		WebElement update = driver.findElement(By.xpath("//span[@class='dummyUploadNewCTA']"));
		 Robot robot = new Robot();
		
		 robot.delay(3000);
		 
		 boolean delete = driver.findElement(By.xpath("(//i[@class='icon'])[2]")).isEnabled();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("(//i[@data-title='delete-resume'])")).click();
		 if (delete==true) {
			 
		} 
		 else if(driver.findElement(By.xpath("//span[@class='dummyUploadNewCTA']")).isDisplayed()){
			 Thread.sleep(3000);
			 driver.findElement(By.xpath("//span[@class='dummyUploadNewCTA']")).click();
		 }
		{

		}
		 
		 
		
		

	System.out.println("Resume uploaded successfully");
	driver.quit();
		
		
	
		
	}

}
