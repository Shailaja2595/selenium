package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sauce {

	public static void main(String[] args) throws InterruptedException
	{
        ChromeOptions options = new ChromeOptions();

        // Disable Chrome password manager popup
        options.addArguments("--incognito");
        


		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
		
	
		
		
//		String mainwindow = driver.getWindowHandle();
//		driver.switchTo().window(mainwindow);
    driver.findElement(By.linkText("Sauce Labs Backpack")).click();
	driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
	
	
	String v = driver.findElement(By.xpath("//div[@class='inventory_details_price']")).getText();
	System.out.println(v);
		Thread.sleep(3000);
		
	//	driver.quit();

	}

}
