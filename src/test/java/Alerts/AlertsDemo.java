package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo 
{

	public static void main(String[] args) throws InterruptedException 
	{


		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		
        //Simple Alert	
		driver.findElement(By.id("alertBox")).click();
	    Alert AlertMsg = driver.switchTo().alert();
	    System.out.println(AlertMsg.getText());
	    Thread.sleep(2000);
	    AlertMsg.accept();
	
	    
	    //Confirmation Alert
	    driver.findElement(By.id("confirmBox")).click();
	    Alert confirmationMsg = driver.switchTo().alert();
	    System.out.println(confirmationMsg.getText());
	    Thread.sleep(2000);
	    confirmationMsg.dismiss();
	
	    WebElement output = driver.findElement(By.id("output"));
	    System.out.println(output.getText());
	    
	    //Prompt Alert
	    driver.findElement(By.id("promptBox")).click();
	    Alert PromptMsg = driver.switchTo().alert();
	    System.out.println(PromptMsg.getText());
	    Thread.sleep(2000);
	    PromptMsg.sendKeys("shailaja");
	    PromptMsg.accept();
	
	    WebElement output1 = driver.findElement(By.id("output"));
	    System.out.println(output1.getText());
	    
	    
	    driver.quit();
	}

}
